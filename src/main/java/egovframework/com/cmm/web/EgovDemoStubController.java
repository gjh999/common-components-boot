package egovframework.com.cmm.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 데모 스텁 컨트롤러.
 *
 * <p>외부 인프라(SMTP 메일서버·SMS 게이트웨이·OAuth 등)나 배치 집계가 <b>선행되어야 실제 동작</b>하는
 * 컴포넌트를, <b>구조를 갖추고 더미데이터로 한 사이클(목록 조회)이 동작</b>하도록 시연한다.
 * 각 화면 상단에 "더미데이터 시연" 배너와 실제 구현에 필요한 조건을 함께 표기한다.</p>
 *
 * <p>데이터는 JSP 원본 스키마를 이관한 실제 테이블(COMTHEMAILDSPTCHMANAGE / COMTNSMS /
 * COMTNSCRAP / COMTSBBSSUMMARY 등)에 넣은 <b>더미 시드</b>를 조회한다. 운영에서는 해당 외부연동/배치가
 * 이 테이블을 채운다.</p>
 */
@Controller
public class EgovDemoStubController {

	private final JdbcTemplate jdbc;

	public EgovDemoStubController(@Qualifier("dataSource") DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}

	/** 공통 렌더링: 실제(더미시드) 테이블을 조회해 제네릭 목록 화면으로 표시 */
	private String render(ModelMap model, String title, String icon, String reason, String howto,
			String sql, String[]... cols) {
		List<Map<String, Object>> rows = new ArrayList<>();
		try {
			rows = jdbc.queryForList(sql);
		} catch (Exception e) {
			// 테이블/컬럼 부재 시에도 화면은 뜨도록(빈 목록)
		}
		model.addAttribute("stubTitle", title);
		model.addAttribute("stubIcon", icon);
		model.addAttribute("dummyReason", reason);
		model.addAttribute("dummyHowto", howto);
		model.addAttribute("cols", Arrays.asList(cols)); // 각 원소: [키, 헤더라벨]
		model.addAttribute("rows", rows);
		return "cmm/examples/EgovDemoStub";
	}

	/** 메일 발송 (cop/ems) — SMTP 메일서버 필요 */
	@GetMapping("/cop/ems/selectSndngMailList.do")
	public String emsMail(ModelMap model) {
		return render(model, "메일 발송 관리", "bi-envelope",
				"실제 발송에는 외부 SMTP 메일서버 연동이 필요합니다. 아래는 더미데이터 시연입니다.",
				"spring-boot-starter-mail 추가 → spring.mail.* 설정 → JavaMailSender 로 MimeMessage 발송 → 결과를 이 테이블에 적재",
				"SELECT SJ, SNDR, RCVER, SNDNG_RESULT_CODE, TO_CHAR(DSPTCH_DT,'YYYY-MM-DD') AS DSPTCH_DT FROM COMTHEMAILDSPTCHMANAGE ORDER BY MSSAGE_ID",
				new String[]{"SJ", "제목"}, new String[]{"SNDR", "발신"}, new String[]{"RCVER", "수신"},
				new String[]{"SNDNG_RESULT_CODE", "결과"}, new String[]{"DSPTCH_DT", "발송일"});
	}

	/** SMS 발송 (cop/sms) — SMS 게이트웨이 필요 */
	@GetMapping("/cop/sms/selectSmsList.do")
	public String smsList(ModelMap model) {
		return render(model, "SMS 발송 관리", "bi-chat-text",
				"실제 발송에는 통신사/문자사업자 SMS 게이트웨이 API가 필요합니다. 아래는 더미데이터 시연입니다.",
				"문자사업자(NHN Cloud·알리고·AWS SNS 등) 발신번호 사전등록 + API키 → REST 발송요청 → 결과 콜백을 이 테이블에 적재",
				"SELECT TRNSMIS_TELNO, RECPTN_TELNO, TRNSMIS_CN, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD HH24:MI') AS FRST_REGIST_PNTTM FROM COMTNSMS ORDER BY SMS_ID",
				new String[]{"TRNSMIS_TELNO", "발신번호"}, new String[]{"RECPTN_TELNO", "수신번호"},
				new String[]{"TRNSMIS_CN", "내용"}, new String[]{"FRST_REGIST_PNTTM", "발송시각"});
	}

	/** 게시판 통계 (sts/bst) — 통계 집계 배치 필요 */
	@GetMapping("/sts/bst/selectBbsStats.do")
	public String bbsStats(ModelMap model) {
		return render(model, "게시판 통계", "bi-graph-up",
				"통계는 일배치가 집계한 요약 테이블(COMTSBBSSUMMARY)을 조회합니다. 아래는 더미 집계 데이터 시연입니다.",
				"sym/bat Quartz 스케줄러로 게시판(TB_BBS) 일집계 잡 작성 → COMTSBBSSUMMARY(발생일자별)에 적재 → 통계화면이 조회",
				"SELECT OCCRRNC_DE, DETAIL_STATS_SE, CREAT_CO, TOT_RDCNT, AVRG_RDCNT FROM COMTSBBSSUMMARY ORDER BY OCCRRNC_DE DESC",
				new String[]{"OCCRRNC_DE", "집계일자"}, new String[]{"DETAIL_STATS_SE", "구분"},
				new String[]{"CREAT_CO", "작성수"}, new String[]{"TOT_RDCNT", "총조회"}, new String[]{"AVRG_RDCNT", "평균조회"});
	}

	/** 게시글 스크랩 (cop/scp) — 게시판 Article 연계 */
	@GetMapping("/cop/scp/selectArticleScrapList.do")
	public String scrapList(ModelMap model) {
		return render(model, "게시글 스크랩", "bi-bookmark-star",
				"스크랩은 게시판 Article 서브시스템과 연계됩니다(현 게시판은 토대 let 기반). 아래는 더미데이터 시연입니다.",
				"게시판 Article 상세에서 스크랩 등록 → COMTNSCRAP 적재 → 내 스크랩 목록 조회. (com.cop.bbs Article 연계 필요)",
				"SELECT SCRAP_NM, BBS_ID, NTT_ID, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD') AS FRST_REGIST_PNTTM FROM COMTNSCRAP WHERE USE_AT='Y' ORDER BY SCRAP_ID",
				new String[]{"SCRAP_NM", "스크랩명"}, new String[]{"BBS_ID", "게시판"},
				new String[]{"NTT_ID", "글번호"}, new String[]{"FRST_REGIST_PNTTM", "스크랩일"});
	}

	/** 블로그 관리 (cop/bbs blog) — 블로그 사용자/구독 연계는 별도 */
	@GetMapping("/cop/bbs/selectBlogList.do")
	public String blogList(ModelMap model) {
		return render(model, "블로그 관리", "bi-journal-richtext",
				"블로그는 게시판 블로그유형 + 블로그 사용자/구독 관리와 연계됩니다. 아래는 더미데이터 시연입니다.",
				"게시판마스터를 블로그유형으로 생성 → COMTNBLOG/COMTNBLOGUSER로 블로그·구독자 관리 → 글은 게시판 Article 재사용",
				"SELECT BLOG_NM, BLOG_INTRCN, USE_AT, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD') AS FRST_REGIST_PNTTM FROM COMTNBLOG WHERE USE_AT='Y' ORDER BY BLOG_ID",
				new String[]{"BLOG_NM", "블로그명"}, new String[]{"BLOG_INTRCN", "소개"},
				new String[]{"USE_AT", "사용"}, new String[]{"FRST_REGIST_PNTTM", "개설일"});
	}

	/** 데이터활용 통계 (sts/dst) — 첨부파일 다운로드 집계 배치 필요 */
	@GetMapping("/sts/dst/selectDtaUseStatsList.do")
	public String dtaUseStats(ModelMap model) {
		return render(model, "데이터활용(다운로드) 통계", "bi-file-earmark-bar-graph",
				"첨부파일 다운로드 집계가 선행되어야 합니다. 아래는 더미데이터 시연입니다.",
				"파일 다운로드 시 COMTNDTAUSESTATS에 적재 → 일/월 배치로 집계 → 통계화면이 조회",
				"SELECT BBS_ID, NTT_ID, ATCH_FILE_ID, FILE_SN, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD') AS FRST_REGIST_PNTTM FROM COMTNDTAUSESTATS ORDER BY DTA_USE_STATS_ID",
				new String[]{"BBS_ID", "게시판"}, new String[]{"NTT_ID", "글번호"},
				new String[]{"ATCH_FILE_ID", "첨부파일"}, new String[]{"FILE_SN", "파일순번"}, new String[]{"FRST_REGIST_PNTTM", "이용일"});
	}

	/** 웹로그(접속 URL) 통계 (sts/wlg) — 웹로그 수집·집계 배치 필요 */
	@GetMapping("/sts/wlg/selectWebLogStats.do")
	public String webLogStats(ModelMap model) {
		return render(model, "웹로그(URL) 통계", "bi-bar-chart-line",
				"웹로그 수집·집계가 선행되어야 합니다. 아래는 더미 집계 데이터 시연입니다.",
				"인터셉터로 URL 접속을 COMTNWEBLOG에 수집 → 일배치로 COMTSWEBLOGSUMMARY에 집계 → 통계화면이 조회",
				"SELECT OCCRRNC_DE, URL, RDCNT FROM COMTSWEBLOGSUMMARY ORDER BY RDCNT DESC",
				new String[]{"OCCRRNC_DE", "집계일자"}, new String[]{"URL", "URL"}, new String[]{"RDCNT", "조회수"});
	}

	/** 정보형(테이블 없이 라이브러리 연동으로 동작하는 컴포넌트) 렌더링 */
	private String renderInfo(ModelMap model, String title, String icon, String reason, String... notes) {
		model.addAttribute("stubTitle", title);
		model.addAttribute("stubIcon", icon);
		model.addAttribute("dummyReason", reason);
		model.addAttribute("dummyHowto", "아래 동작 방식 참고 — 목록 화면이 아니라 인증/보안 라이브러리 연동으로 동작합니다.");
		model.addAttribute("infoOnly", true);
		model.addAttribute("notes", Arrays.asList(notes));
		return "cmm/examples/EgovDemoStub";
	}

	/** 소셜 로그인 (ext/oauth) — 외부 OAuth2 제공자 필요 */
	@GetMapping("/ext/oauth/loginInfo.do")
	public String oauthInfo(ModelMap model) {
		return renderInfo(model, "소셜 로그인 (OAuth2)", "bi-box-arrow-in-right",
				"구글·네이버·카카오 등 외부 OAuth2 제공자 등록이 필요해 더미(정보)로 구조만 시연합니다.",
				"spring-boot-starter-oauth2-client 의존 추가",
				"각 제공자 콘솔에서 clientId·secret·redirect URI 발급",
				"application.yml의 spring.security.oauth2.client.registration.* 설정",
				"SecurityConfig에 oauth2Login() 활성화 → 로그인 버튼이 제공자 인증으로 리다이렉트");
	}

	/** 캡차 (ext/captcha) — 이미지 캡차/reCAPTCHA 필요 */
	@GetMapping("/ext/captcha/captchaInfo.do")
	public String captchaInfo(ModelMap model) {
		return renderInfo(model, "캡차 (CAPTCHA)", "bi-shield-lock",
				"이미지 캡차 라이브러리 또는 구글 reCAPTCHA 연동이 필요해 더미(정보)로 구조만 시연합니다.",
				"이미지 캡차: kaptcha로 서버에서 이미지 생성 → 입력값 세션 검증",
				"reCAPTCHA: 사이트키·시크릿 발급 → 프론트 위젯 + 서버 검증 API 호출",
				"로그인·회원가입 등 폼 제출 전 캡차 검증 필수화");
	}

	/** LDAP 사용자 연동 (ext/ldapumt) — LDAP/AD 디렉터리 필요 */
	@GetMapping("/ext/ldap/ldapInfo.do")
	public String ldapInfo(ModelMap model) {
		return renderInfo(model, "LDAP 사용자 연동", "bi-diagram-3",
				"외부 LDAP/AD 디렉터리 서버가 필요해 더미(정보)로 구조만 시연합니다.",
				"spring-boot-starter-data-ldap 의존 추가",
				"LDAP 서버 접속정보(host/port/baseDn/manager) 설정",
				"사용자 검색·인증 바인딩 → 필요 시 로컬 사용자테이블로 동기화 배치");
	}

	/** 간이 구현(실데이터 표준화 테이블 조회, 고급기능 일부 생략) 렌더링 — 파란 안내 */
	private String renderSimple(ModelMap model, String title, String icon, String note, String sql, String[]... cols) {
		List<Map<String, Object>> rows = new ArrayList<>();
		try {
			rows = jdbc.queryForList(sql);
		} catch (Exception e) {
			// 빈 목록으로 표시
		}
		model.addAttribute("stubTitle", title);
		model.addAttribute("stubIcon", icon);
		model.addAttribute("dummyReason", note);
		model.addAttribute("simple", true);
		model.addAttribute("cols", Arrays.asList(cols));
		model.addAttribute("rows", rows);
		return "cmm/examples/EgovDemoStub";
	}

	/** 전체 일정 관리 (cop/smt/sam) — 표준화 TB_SCHDUL_INFO 실데이터, 간이 목록 */
	@GetMapping("/cop/smt/sam/EgovAllSchdulManageList.do")
	public String allSchdul(ModelMap model) {
		return renderSimple(model, "일정 관리", "bi-calendar3",
				"전체 일정 목록의 간이 구현입니다(반복일정·부서일정·팝업 등 고급기능은 원본 모듈 참조). 데이터는 표준화 테이블 TB_SCHDUL_INFO의 실데이터입니다.",
				"SELECT SCHDUL_NM, TO_CHAR(SCHDUL_BEGINDE,'YYYY-MM-DD') AS BGN, TO_CHAR(SCHDUL_ENDDE,'YYYY-MM-DD') AS END_DE, SCHDUL_PLACE FROM TB_SCHDUL_INFO ORDER BY SCHDUL_BEGINDE DESC",
				new String[]{"SCHDUL_NM", "일정명"}, new String[]{"BGN", "시작"},
				new String[]{"END_DE", "종료"}, new String[]{"SCHDUL_PLACE", "장소"});
	}

	/** 업무 일지 (cop/smt/dsm) — COMTNDIARYINFO 실데이터, 간이 목록 */
	@GetMapping("/cop/smt/dsm/EgovDiaryManageList.do")
	public String diaryList(ModelMap model) {
		return renderSimple(model, "업무 일지", "bi-journal-check",
				"업무 일지 목록의 간이 구현입니다(일정 연계·결재 등은 원본 모듈 참조). 데이터는 COMTNDIARYINFO 실데이터입니다.",
				"SELECT DIARY_NM, DIARY_PROGRSRT, DRCT_MATTER, PARTCLR_MATTER, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD') AS RD FROM COMTNDIARYINFO ORDER BY DIARY_ID",
				new String[]{"DIARY_NM", "일지명"}, new String[]{"DIARY_PROGRSRT", "진행률(%)"},
				new String[]{"DRCT_MATTER", "지시사항"}, new String[]{"PARTCLR_MATTER", "특이사항"}, new String[]{"RD", "작성일"});
	}

	/** 서버 자원(장비) 관리 (utl/sys/srm) — 모니터링 에이전트 필요 */
	@GetMapping("/utl/sys/srm/EgovServerResrcInfo.do")
	public String serverResrc(ModelMap model) {
		return render(model, "서버 자원 관리", "bi-hdd-rack",
				"실시간 자원 수집에는 서버 모니터링 에이전트가 필요합니다. 아래는 더미(등록장비) 데이터 시연입니다.",
				"각 서버에 모니터링 에이전트(또는 SNMP) 설치 → CPU/메모리/디스크 주기 수집 → COMTN*MNTRNG*에 적재 → 화면이 조회",
				"SELECT SERVER_EQPMN_NM, SERVER_EQPMN_IP, SERVER_EQPMN_MNGR, OPERSYSM_INFO, CPU_INFO, MORY_INFO FROM COMTNSERVEREQPMNINFO ORDER BY SERVER_EQPMN_ID",
				new String[]{"SERVER_EQPMN_NM", "장비명"}, new String[]{"SERVER_EQPMN_IP", "IP"},
				new String[]{"SERVER_EQPMN_MNGR", "담당자"}, new String[]{"OPERSYSM_INFO", "OS"},
				new String[]{"CPU_INFO", "CPU"}, new String[]{"MORY_INFO", "메모리"});
	}

	/** 연계 시스템 관리 (ssi/syi) — 대외기관 연계 인터페이스 필요 */
	@GetMapping("/ssi/syi/EgovCntcSystemList.do")
	public String cntcSystem(ModelMap model) {
		return render(model, "연계 시스템 관리", "bi-hdd-network",
				"실제 연계에는 대외기관 인터페이스(EAI/표준연계) 설정이 필요합니다. 아래는 더미(등록시스템) 데이터 시연입니다.",
				"연계 대상 시스템 등록(COMTNCNTCSYSTEM) → 표준연계 규격(메시지/인증) 협의 → 송수신 인터페이스 구현·모니터링",
				"SELECT SYS_NM, SYS_IP, INSTT_ID, TO_CHAR(FRST_REGIST_PNTTM,'YYYY-MM-DD') AS RD FROM COMTNCNTCSYSTEM ORDER BY SYS_ID",
				new String[]{"SYS_NM", "시스템명"}, new String[]{"SYS_IP", "IP"},
				new String[]{"INSTT_ID", "기관"}, new String[]{"RD", "등록일"});
	}

	/** 게시글 통계 (sts/sst) — 게시글 조회 집계 배치 필요 */
	@GetMapping("/sts/sst/selectNttStats.do")
	public String nttStats(ModelMap model) {
		return render(model, "게시글 통계", "bi-clipboard-data",
				"게시글 조회수 집계가 선행되어야 합니다. 아래는 더미 집계 데이터 시연입니다.",
				"게시글 조회 이벤트를 집계 배치로 COMTNNTTSTATS에 적재(게시수·평균/최대/최소 조회수·최다게시자) → 통계화면이 조회",
				"SELECT NTCE_CO, AVRG_RDCNT, TOP_RDCNT, MUMM_RDCNT FROM COMTNNTTSTATS ORDER BY STATS_ID",
				new String[]{"NTCE_CO", "게시수"}, new String[]{"AVRG_RDCNT", "평균조회"},
				new String[]{"TOP_RDCNT", "최대조회"}, new String[]{"MUMM_RDCNT", "최소조회"});
	}
}

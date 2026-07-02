package egovframework.com.uss.umt.service;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 마이페이지(본인) 회원정보 조회/수정용 VO.
 * 업무사용자(USR)·일반회원(GNR)·기업회원(ENT) 공통 항목을 담는다.
 * 식별은 로그인 세션의 ESNTL_ID(uniqId) + userSe 로 한다.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *  2026.07.01  Claude        마이페이지(본인) 기능 신규 — 포털에서 이식
 *   2026.07.02  구재호        Spring Boot + Thymeleaf + KRDS + 다국어(i18n) 전환
 * </pre>
 */
@Getter
@Setter
public class MypageVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 사용자고유아이디(ESNTL_ID) */
	private String uniqId;

	/** 사용자 구분(USR/GNR/ENT) */
	private String userSe;

	/** 로그인 아이디(읽기전용) */
	private String userId;

	/** 이름(회원명/사용자명/회사명) */
	private String userNm;

	/** 이메일 */
	private String email;

	/** 전화번호(단일) */
	private String telno;

	/** 우편번호 */
	private String zip;

	/** 주소 */
	private String adres;

	/** 상세주소 */
	private String detailAdres;

	/** 현재 비밀번호(변경 시) */
	private String oldPassword;

	/** 새 비밀번호(변경 시) */
	private String password;
}

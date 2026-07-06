package egovframework.com.uss.umt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.com.uss.umt.service.EgovMypageService;
import egovframework.com.uss.umt.service.MypageVO;
import egovframework.com.utl.sim.service.EgovFileScrty;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 마이페이지(본인) — 회원정보 수정 + 비밀번호 변경.
 * 로그인 본인(세션 ESNTL_ID)만 접근/수정한다. userSe 에 따라 대상 테이블이 분기된다.
 * 공통컴포넌트 예제 환경에서는 데모 사용자(admin/USR)로 동작한다.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *  2026.07.01  Claude        마이페이지(본인) 기능 신규 — 포털에서 이식
 *   2026.07.02  구재호        Spring Boot + Thymeleaf + KRDS + 다국어(i18n) 전환
 * </pre>
 */
@Controller
public class EgovMypageController {

	@Resource(name = "mypageService")
	private EgovMypageService mypageService;

	/**
	 * 마이페이지 화면(탭: 회원정보 수정 / 비밀번호 변경).
	 * 예제 환경에서는 demoSe(GNR/USR/ENT)로 3유형 회원의 마이페이지를 각각 조회할 수 있다.
	 */
	@GetMapping("/uss/umt/mypage.do")
	public String mypage(@RequestParam(value = "demoSe", required = false) String demoSe,
			ModelMap model, HttpServletRequest request) {
		LoginVO loginVO = effectiveUser(demoSe, request);
		if (loginVO == null) {
			return "redirect:/examples";
		}
		model.addAttribute("myInfo", loadMyInfo(loginVO));
		model.addAttribute("demoSe", loginVO.getUserSe());
		model.addAttribute("loggedIn", isRealLogin(request));
		return "cmm/uss/umt/EgovMberMypage";
	}

	/** 본인 회원정보 수정 처리. */
	@PostMapping("/uss/umt/mypage/info.do")
	public String updateInfo(@RequestParam(value = "demoSe", required = false) String demoSe,
			MypageVO form, ModelMap model, HttpServletRequest request) {
		LoginVO loginVO = effectiveUser(demoSe, request);
		if (loginVO == null) {
			return "redirect:/examples";
		}

		// 세션 본인 정보로 식별자 고정(폼 위변조 방지)
		form.setUniqId(loginVO.getUniqId());
		form.setUserSe(loginVO.getUserSe());
		form.setUserId(loginVO.getId());
		mypageService.updateMyInfo(form);

		// 세션의 표시 이름 갱신(헤더 등 반영)
		loginVO.setName(form.getUserNm());
		Object sessionLogin = request.getSession().getAttribute("loginVO");
		if (sessionLogin instanceof LoginVO) {
			((LoginVO) sessionLogin).setName(form.getUserNm());
		}

		model.addAttribute("myInfo", loadMyInfo(loginVO));
		model.addAttribute("demoSe", loginVO.getUserSe());
		model.addAttribute("loggedIn", isRealLogin(request));
		model.addAttribute("activeTab", "info");
		model.addAttribute("resultMsg", "mypage.msg.info.success");
		return "cmm/uss/umt/EgovMberMypage";
	}

	/** 본인 비밀번호 변경 처리. */
	@PostMapping("/uss/umt/mypage/password.do")
	public String updatePassword(@RequestParam(value = "demoSe", required = false) String demoSe,
			@RequestParam("oldPassword") String oldPassword,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("newPassword2") String newPassword2,
			ModelMap model, HttpServletRequest request) throws Exception {

		LoginVO loginVO = effectiveUser(demoSe, request);
		if (loginVO == null) {
			return "redirect:/examples";
		}

		MypageVO key = new MypageVO();
		key.setUniqId(loginVO.getUniqId());
		key.setUserSe(loginVO.getUserSe());

		MypageVO current = mypageService.selectMyPassword(key);
		String encOld = EgovFileScrty.encryptPassword(oldPassword, loginVO.getId());

		String resultMsg;
		if (current == null || !encOld.equals(current.getPassword())) {
			resultMsg = "mypage.msg.pwd.fail.old";
		} else if (!newPassword.equals(newPassword2)) {
			resultMsg = "mypage.msg.pwd.fail.confirm";
		} else {
			key.setPassword(EgovFileScrty.encryptPassword(newPassword, loginVO.getId()));
			mypageService.updateMyPassword(key);
			resultMsg = "mypage.msg.pwd.success";
		}

		model.addAttribute("myInfo", loadMyInfo(loginVO));
		model.addAttribute("demoSe", loginVO.getUserSe());
		model.addAttribute("loggedIn", isRealLogin(request));
		model.addAttribute("activeTab", "password");
		model.addAttribute("resultMsg", resultMsg);
		return "cmm/uss/umt/EgovMberMypage";
	}

	/** 세션에 실제 로그인 사용자(loginVO)가 있는지 여부. */
	private boolean isRealLogin(HttpServletRequest request) {
		if (request.getSession(false) == null) {
			return false;
		}
		Object sessionLogin = request.getSession().getAttribute("loginVO");
		return sessionLogin instanceof LoginVO
				&& ((LoginVO) sessionLogin).getId() != null
				&& !((LoginVO) sessionLogin).getId().isEmpty();
	}

	/**
	 * 대상 회원 LoginVO 결정.
	 * <pre>
	 * 1) 실제 로그인 사용자가 있으면 항상 '본인'을 사용한다(demoSe는 무시 — 폼 위변조로 타 회원 수정 방지).
	 * 2) 비로그인(익명) 예제 브라우징 시에만 demoSe(GNR/USR/ENT)로 샘플 회원을 미리보기한다.
	 *    GNR=user1, USR=admin, ENT=bizapproved (shtdb 시드의 ESNTL_ID 기준).
	 * </pre>
	 */
	private LoginVO effectiveUser(String demoSe, HttpServletRequest request) {
		// 1) 실제 로그인 사용자 우선 — 본인만 조회/수정
		if (isRealLogin(request)) {
			return (LoginVO) request.getSession().getAttribute("loginVO");
		}
		// 2) 익명 예제 미리보기
		if (demoSe != null) {
			String se = demoSe.trim().toUpperCase();
			LoginVO vo = new LoginVO();
			if ("GNR".equals(se)) {
				vo.setUserSe("GNR");
				vo.setId("user1");
				vo.setUniqId("USRCNFRM_00000000010");
				vo.setName("홍길동");
				return vo;
			} else if ("ENT".equals(se)) {
				vo.setUserSe("ENT");
				vo.setId("bizapproved");
				vo.setUniqId("USRCNFRM_00000000011");
				vo.setName("주식회사 한글기업");
				return vo;
			} else if ("USR".equals(se)) {
				vo.setUserSe("USR");
				vo.setId("admin");
				vo.setUniqId("USRCNFRM_00000000000");
				vo.setName("관리자");
				return vo;
			}
		}
		return (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
	}

	/** 로그인 본인의 회원정보를 조회하되, 조회 실패 시 세션값으로 최소 구성한다. */
	private MypageVO loadMyInfo(LoginVO loginVO) {
		MypageVO key = new MypageVO();
		key.setUniqId(loginVO.getUniqId());
		key.setUserSe(loginVO.getUserSe());
		MypageVO info = mypageService.selectMyInfo(key);
		if (info == null) {
			info = new MypageVO();
			info.setUniqId(loginVO.getUniqId());
			info.setUserSe(loginVO.getUserSe());
			info.setUserId(loginVO.getId());
			info.setUserNm(loginVO.getName());
			info.setEmail(loginVO.getEmail());
		}
		return info;
	}
}

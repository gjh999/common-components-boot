package egovframework.com.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.service.EgovUserDetailsService;

/**
 *
 * @author 공통서비스 개발팀 서준식
 * @since 2011. 6. 25.
 * @version 1.0
 * @see
 *
 * <pre>
 * 개정이력(Modification Information)
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2011. 8. 12.    서준식        최초생성
 *  2026.06.17  구재호          Spring Boot + Thymeleaf 전환
 *
 *  </pre>
 */

public class EgovUserDetailsSessionServiceImpl extends EgovAbstractServiceImpl implements EgovUserDetailsService {

	/**
	 * 예제 데모: 로그인 없이도 예제 화면이 동작하도록, 세션에 loginVO 가 없으면 기본 데모 사용자(admin)를
	 * 데이터 계층에 제공한다. 이는 컨트롤러의 EgovUserDetailsHelper 판단(리다이렉트/uniqId)만 통과시키며,
	 * 화면 상단 로그인 표시는 Spring Security(SecurityContext) 기준(sec:authorize)이라 영향받지 않는다.
	 * → 강제 로그인 세션 없이 익명으로 예제 사용 + 실제 로그인/로그아웃도 정상 동작.
	 */
	private static LoginVO demoUser() {
		LoginVO vo = new LoginVO();
		vo.setId("admin");
		vo.setName("게스트");
		vo.setUniqId("USRCNFRM_00000000000");
		vo.setUserSe("USR");
		return vo;
	}

	@Override
	public Object getAuthenticatedUser() {
		if (RequestContextHolder.getRequestAttributes() == null) {
			return demoUser();
		}
		Object loginVO = RequestContextHolder.getRequestAttributes()
				.getAttribute("loginVO", RequestAttributes.SCOPE_SESSION);
		return loginVO != null ? loginVO : demoUser();
	}

	@Override
	public List<String> getAuthorities() {
		// 데모: 모든 예제 접근 가능하도록 관리자 권한 부여(데이터 계층 한정)
		List<String> listAuth = new ArrayList<String>();
		listAuth.add("ROLE_ADMIN");
		listAuth.add("ROLE_USER");
		return listAuth;
	}

	@Override
	public Boolean isAuthenticated() {
		// 데모: 항상 인증된 것으로 간주(기본 데모 사용자 제공) → 예제 화면이 익명이어도 동작
		return Boolean.TRUE;
	}

}

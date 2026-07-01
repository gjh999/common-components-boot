package egovframework.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import egovframework.com.cmm.service.impl.EgovUserDetailsSessionServiceImpl;
import egovframework.com.cmm.util.EgovUserDetailsHelper;

/**
 * 레거시 context-egovuserdetailshelper.xml 의 Boot 이관.
 * EgovUserDetailsHelper 는 static 필드 egovUserDetailsService 를 통해 인증정보를 제공하는데,
 * 이 빈을 생성하며 setter(=static 필드 세팅)가 호출되어야 한다. 누락 시
 * EgovUserDetailsHelper.isAuthenticated()/getAuthenticatedUser() 호출이 NPE 로 실패한다.
 * (com/* 레거시 공통컴포넌트 컨트롤러 다수가 이 헬퍼에 의존)
 *
 * @author 공통컴포넌트 Boot 전환
 */
@Configuration
public class EgovConfigAppUserDetailsHelper {

	@Bean
	public EgovUserDetailsHelper egovUserDetailsHelper() {
		EgovUserDetailsHelper egovUserDetailsHelper = new EgovUserDetailsHelper();
		egovUserDetailsHelper.setEgovUserDetailsService(new EgovUserDetailsSessionServiceImpl());
		return egovUserDetailsHelper;
	}
}

package egovframework.com.cmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 공통컴포넌트 예제 카탈로그.
 * Boot+Thymeleaf+KRDS로 제공되는 표준 공통컴포넌트를 분류별로 모아 보여주는 공개 인덱스 페이지.
 * 각 카드는 실제 동작 화면으로 연결되어 "예제와 함께 사용"할 수 있도록 한다.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자       수정내용
 *  -------    --------    ---------------------------
 *  2026.06.29  Claude       공통컴포넌트 예제 카탈로그 신규
 *   2026.07.02  구재호        Spring Boot + Thymeleaf + KRDS + 다국어(i18n) 전환
 * </pre>
 */
@Controller
public class EgovComponentCatalogController {

	@GetMapping({"/examples", "/components"})
	public String catalog() {
		return "cmm/examples/EgovComponentCatalog";
	}

	/**
	 * 사용 안내 + 구현 가이드.
	 * - 카탈로그를 로그인 없이 사용하는 방법 안내
	 * - 외부 인프라(메일/SMS/OAuth) 또는 배치 집계가 선행되어야 하는 "현재 미구현" 모듈의 구현 방법 설명
	 */
	@GetMapping({"/examples/guide", "/components/guide"})
	public String guide() {
		return "cmm/examples/EgovComponentGuide";
	}
}

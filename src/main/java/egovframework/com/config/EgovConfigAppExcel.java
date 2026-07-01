package egovframework.com.config;

import org.egovframe.rte.fdl.excel.EgovExcelService;
import org.egovframe.rte.fdl.excel.impl.EgovExcelServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 엑셀 처리 서비스(egovframe-rte-fdl-excel) 빈 설정.
 * 기념일관리(ans) 등에서 @Resource("excelZipService")로 주입하는 EgovExcelService 등록.
 *
 * @author 공통컴포넌트 Boot 전환
 */
@Configuration
public class EgovConfigAppExcel {

	@Bean(name = "excelZipService")
	public EgovExcelService excelZipService() {
		return new EgovExcelServiceImpl();
	}
}

package egovframework.com.config;

import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import egovframework.com.sym.bat.service.BatchScheduler;
import egovframework.com.sym.bat.service.EgovBatchSchdulService;

/**
 * 배치 스케줄러(sym/bat) 설정 — BatchScheduler 빈 등록.
 * BatchScheduler 는 내부에서 Quartz StdSchedulerFactory 로 Scheduler 를 생성하므로
 * 서비스/IdGnr 만 주입한다(자동 기동 없음 — 등록/스케줄 액션 시에만 사용).
 */
@Configuration
public class EgovConfigAppBatch {

	@Bean(name = "batchScheduler")
	public BatchScheduler batchScheduler(
			EgovBatchSchdulService egovBatchSchdulService,
			@Qualifier("egovBatchSchdulIdGnrService") EgovIdGnrService idgenService) {
		BatchScheduler batchScheduler = new BatchScheduler();
		batchScheduler.setEgovBatchSchdulService(egovBatchSchdulService);
		batchScheduler.setIdgenService(idgenService);
		return batchScheduler;
	}
}

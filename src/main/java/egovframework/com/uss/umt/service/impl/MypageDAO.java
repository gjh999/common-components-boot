package egovframework.com.uss.umt.service.impl;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import egovframework.com.uss.umt.service.MypageVO;

/**
 * 마이페이지(본인) 회원정보 데이터 접근 클래스.
 * userSe 분기는 매퍼 XML(&lt;if&gt;)에서 처리한다.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *  2026.07.01  Claude        마이페이지(본인) 기능 신규 — 포털에서 이식
 *   2026.07.02  구재호        Spring Boot + Thymeleaf + KRDS + 다국어(i18n) 전환
 * </pre>
 */
@Repository("mypageDAO")
public class MypageDAO extends EgovAbstractMapper {

	public MypageVO selectMyInfo(MypageVO vo) {
		return selectOne("mypageDAO.selectMyInfo", vo);
	}

	public void updateMyInfo(MypageVO vo) {
		update("mypageDAO.updateMyInfo", vo);
	}

	public MypageVO selectMyPassword(MypageVO vo) {
		return selectOne("mypageDAO.selectMyPassword", vo);
	}

	public void updateMyPassword(MypageVO vo) {
		update("mypageDAO.updateMyPassword", vo);
	}
}

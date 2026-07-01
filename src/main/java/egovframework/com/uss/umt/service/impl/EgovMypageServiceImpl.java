package egovframework.com.uss.umt.service.impl;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.com.uss.umt.service.EgovMypageService;
import egovframework.com.uss.umt.service.MypageVO;
import jakarta.annotation.Resource;

/**
 * 마이페이지(본인) 회원정보 조회/수정 비지니스 구현 클래스.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *  2026.07.01  Claude        마이페이지(본인) 기능 신규 — 포털에서 이식
 * </pre>
 */
@Service("mypageService")
public class EgovMypageServiceImpl extends EgovAbstractServiceImpl implements EgovMypageService {

	@Resource(name = "mypageDAO")
	private MypageDAO mypageDAO;

	@Override
	public MypageVO selectMyInfo(MypageVO vo) {
		return mypageDAO.selectMyInfo(vo);
	}

	@Override
	public void updateMyInfo(MypageVO vo) {
		mypageDAO.updateMyInfo(vo);
	}

	@Override
	public MypageVO selectMyPassword(MypageVO vo) {
		return mypageDAO.selectMyPassword(vo);
	}

	@Override
	public void updateMyPassword(MypageVO vo) {
		mypageDAO.updateMyPassword(vo);
	}
}

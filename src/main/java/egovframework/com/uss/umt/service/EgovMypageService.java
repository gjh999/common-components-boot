package egovframework.com.uss.umt.service;

/**
 * 마이페이지(본인) 회원정보 조회/수정 비지니스 인터페이스.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *  2026.07.01  Claude        마이페이지(본인) 기능 신규 — 포털에서 이식
 * </pre>
 */
public interface EgovMypageService {

	/** 로그인 본인의 회원정보를 조회한다. */
	MypageVO selectMyInfo(MypageVO vo);

	/** 로그인 본인의 회원정보를 수정한다. */
	void updateMyInfo(MypageVO vo);

	/** 로그인 본인의 현재 암호화된 비밀번호를 조회한다. */
	MypageVO selectMyPassword(MypageVO vo);

	/** 로그인 본인의 비밀번호를 변경한다. */
	void updateMyPassword(MypageVO vo);
}

package egovframework.com.cop.ncm.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.egovframe.rte.ptl.reactive.validation.EgovNullCheck;
import org.egovframe.rte.ptl.reactive.validation.EgovEmailCheck;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


/**
 * 명함정보 관리를 위한 모델 클래스
 * @author 공통서비스개발팀 이삼섭
 * @since 2009.06.01
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.3.28  이삼섭          최초 생성
 *   2026.07.02  구재호        Spring Boot + Thymeleaf + KRDS + 다국어(i18n) 전환
 *
 * </pre>
 */
@SuppressWarnings("serial")
public class NameCard implements Serializable {

    /** 주소 */
    @Size(max=100)
    private String adres = "";
    
    /** 지역번호 */
    @Size(max=4)
    @Pattern(regexp="^\\d*$", message="{validation.pattern.integer}")
    private String areaNo = "";
    
    /** 직급명 */
    @Size(max=60)
    private String clsfNm = "";
    
    /** 회사명 */
    @Size(max=60)
    private String cmpnyNm = "";
    
    /** 부서명 */
    @Size(max=60)
    private String deptNm = "";
    
    /** 이메일주소 */
    @EgovNullCheck
    @Size(max=50)
    @EgovEmailCheck
    private String emailAdres = "";
    
    /** 끝휴대폰번호 */
    @Size(max=4)
    @Pattern(regexp="^\\d*$", message="{validation.pattern.integer}")
    private String endMbtlNum = "";
    
    /** 끝전화번호 */
    @Size(max=4)
    @Pattern(regexp="^\\d*$", message="{validation.pattern.integer}")
    private String endTelNo = "";
    
    /** 외부사용자여부 */
    private String extrlUserAt = "";
    
    /** 최초등록자 아이디 */
    private String frstRegisterId = "";
    
    /** 최초등록시점 */
    private String frstRegisterPnttm = "";
    
    /** 식별번호 */
    private String idntfcNo = "";
    
    /** 최종수정자 아이디 */
    private String lastUpdusrId = "";
    
    /** 최종수정시점 */
    private String lastUpdusrPnttm = "";
    
    /** 휴대폰번호 */
    private String mbtlNum = "";
    
    /** 중간휴대폰번호 */
    @Size(max=4)
    @Pattern(regexp="^\\d*$", message="{validation.pattern.integer}")
    private String middleMbtlNum = "";
    
    /** 중간전화번호 */
    @Size(max=4)
    @Pattern(regexp="^\\d*$", message="{validation.pattern.integer}")
    private String middleTelNo = "";
    
    /** 국가번호 */
    private String nationNo = "";
    
    /** 명함아이디 */
    private String ncrdId = "";
    
    /** 명함대상자 아이디 */
    private String ncrdTrgterId = "";
    
    /** 이름 */
    @EgovNullCheck
    @Size(max=50)
    private String ncrdNm = "";
    
    /** 직위명 */
    @Size(max=60)
    private String ofcpsNm = "";
    
    /** 공개여부 */
    @EgovNullCheck
    private String othbcAt = "";
    
    /** 비고 */
    @Size(max=2500)
    private String remark = "";
    
    /** 전화번호 */
    private String telNo = "";

    /** 상세주소 */
    @Size(max=100)
    private String detailAdres = "";
    
    /** 우편번호 */
    private String zipCode = "";

    /**
     * adres attribute를 리턴한다.
     * 
     * @return the adres
     */
    public String getAdres() {
	return adres;
    }

    /**
     * adres attribute 값을 설정한다.
     * 
     * @param adres
     *            the adres to set
     */
    public void setAdres(String adres) {
	this.adres = adres;
    }

    /**
     * areaNo attribute를 리턴한다.
     * 
     * @return the areaNo
     */
    public String getAreaNo() {
	return areaNo;
    }

    /**
     * areaNo attribute 값을 설정한다.
     * 
     * @param areaNo
     *            the areaNo to set
     */
    public void setAreaNo(String areaNo) {
	this.areaNo = areaNo;
    }

    /**
     * clsfNm attribute를 리턴한다.
     * 
     * @return the clsfNm
     */
    public String getClsfNm() {
	return clsfNm;
    }

    /**
     * clsfNm attribute 값을 설정한다.
     * 
     * @param clsfNm
     *            the clsfNm to set
     */
    public void setClsfNm(String clsfNm) {
	this.clsfNm = clsfNm;
    }

    /**
     * cmpnyNm attribute를 리턴한다.
     * 
     * @return the cmpnyNm
     */
    public String getCmpnyNm() {
	return cmpnyNm;
    }

    /**
     * cmpnyNm attribute 값을 설정한다.
     * 
     * @param cmpnyNm
     *            the cmpnyNm to set
     */
    public void setCmpnyNm(String cmpnyNm) {
	this.cmpnyNm = cmpnyNm;
    }

    /**
     * deptNm attribute를 리턴한다.
     * 
     * @return the deptNm
     */
    public String getDeptNm() {
	return deptNm;
    }

    /**
     * deptNm attribute 값을 설정한다.
     * 
     * @param deptNm
     *            the deptNm to set
     */
    public void setDeptNm(String deptNm) {
	this.deptNm = deptNm;
    }

    /**
     * emailAdres attribute를 리턴한다.
     * 
     * @return the emailAdres
     */
    public String getEmailAdres() {
	return emailAdres;
    }

    /**
     * emailAdres attribute 값을 설정한다.
     * 
     * @param emailAdres
     *            the emailAdres to set
     */
    public void setEmailAdres(String emailAdres) {
	this.emailAdres = emailAdres;
    }

    /**
     * endMbtlNum attribute를 리턴한다.
     * 
     * @return the endMbtlNum
     */
    public String getEndMbtlNum() {
	return endMbtlNum;
    }

    /**
     * endMbtlNum attribute 값을 설정한다.
     * 
     * @param endMbtlNum
     *            the endMbtlNum to set
     */
    public void setEndMbtlNum(String endMbtlNum) {
	this.endMbtlNum = endMbtlNum;
    }

    /**
     * endTelNo attribute를 리턴한다.
     * 
     * @return the endTelNo
     */
    public String getEndTelNo() {
	return endTelNo;
    }

    /**
     * endTelNo attribute 값을 설정한다.
     * 
     * @param endTelNo
     *            the endTelNo to set
     */
    public void setEndTelNo(String endTelNo) {
	this.endTelNo = endTelNo;
    }

    /**
     * extrlUserAt attribute를 리턴한다.
     * 
     * @return the extrlUserAt
     */
    public String getExtrlUserAt() {
	return extrlUserAt;
    }

    /**
     * extrlUserAt attribute 값을 설정한다.
     * 
     * @param extrlUserAt
     *            the extrlUserAt to set
     */
    public void setExtrlUserAt(String extrlUserAt) {
	this.extrlUserAt = extrlUserAt;
    }

    /**
     * frstRegisterId attribute를 리턴한다.
     * 
     * @return the frstRegisterId
     */
    public String getFrstRegisterId() {
	return frstRegisterId;
    }

    /**
     * frstRegisterId attribute 값을 설정한다.
     * 
     * @param frstRegisterId
     *            the frstRegisterId to set
     */
    public void setFrstRegisterId(String frstRegisterId) {
	this.frstRegisterId = frstRegisterId;
    }

    /**
     * frstRegisterPnttm attribute를 리턴한다.
     * 
     * @return the frstRegisterPnttm
     */
    public String getFrstRegisterPnttm() {
	return frstRegisterPnttm;
    }

    /**
     * frstRegisterPnttm attribute 값을 설정한다.
     * 
     * @param frstRegisterPnttm
     *            the frstRegisterPnttm to set
     */
    public void setFrstRegisterPnttm(String frstRegisterPnttm) {
	this.frstRegisterPnttm = frstRegisterPnttm;
    }

    /**
     * idntfcNo attribute를 리턴한다.
     * 
     * @return the idntfcNo
     */
    public String getIdntfcNo() {
	return idntfcNo;
    }

    /**
     * idntfcNo attribute 값을 설정한다.
     * 
     * @param idntfcNo
     *            the idntfcNo to set
     */
    public void setIdntfcNo(String idntfcNo) {
	this.idntfcNo = idntfcNo;
    }

    /**
     * lastUpdusrId attribute를 리턴한다.
     * 
     * @return the lastUpdusrId
     */
    public String getLastUpdusrId() {
	return lastUpdusrId;
    }

    /**
     * lastUpdusrId attribute 값을 설정한다.
     * 
     * @param lastUpdusrId
     *            the lastUpdusrId to set
     */
    public void setLastUpdusrId(String lastUpdusrId) {
	this.lastUpdusrId = lastUpdusrId;
    }

    /**
     * lastUpdusrPnttm attribute를 리턴한다.
     * 
     * @return the lastUpdusrPnttm
     */
    public String getLastUpdusrPnttm() {
	return lastUpdusrPnttm;
    }

    /**
     * lastUpdusrPnttm attribute 값을 설정한다.
     * 
     * @param lastUpdusrPnttm
     *            the lastUpdusrPnttm to set
     */
    public void setLastUpdusrPnttm(String lastUpdusrPnttm) {
	this.lastUpdusrPnttm = lastUpdusrPnttm;
    }

    /**
     * mbtlNum attribute를 리턴한다.
     * 
     * @return the mbtlNum
     */
    public String getMbtlNum() {
	return mbtlNum;
    }

    /**
     * mbtlNum attribute 값을 설정한다.
     * 
     * @param mbtlNum
     *            the mbtlNum to set
     */
    public void setMbtlNum(String mbtlNum) {
	this.mbtlNum = mbtlNum;
    }

    /**
     * middleMbtlNum attribute를 리턴한다.
     * 
     * @return the middleMbtlNum
     */
    public String getMiddleMbtlNum() {
	return middleMbtlNum;
    }

    /**
     * middleMbtlNum attribute 값을 설정한다.
     * 
     * @param middleMbtlNum
     *            the middleMbtlNum to set
     */
    public void setMiddleMbtlNum(String middleMbtlNum) {
	this.middleMbtlNum = middleMbtlNum;
    }

    /**
     * middleTelNo attribute를 리턴한다.
     * 
     * @return the middleTelNo
     */
    public String getMiddleTelNo() {
	return middleTelNo;
    }

    /**
     * middleTelNo attribute 값을 설정한다.
     * 
     * @param middleTelNo
     *            the middleTelNo to set
     */
    public void setMiddleTelNo(String middleTelNo) {
	this.middleTelNo = middleTelNo;
    }

    /**
     * nationNo attribute를 리턴한다.
     * 
     * @return the nationNo
     */
    public String getNationNo() {
	return nationNo;
    }

    /**
     * nationNo attribute 값을 설정한다.
     * 
     * @param nationNo
     *            the nationNo to set
     */
    public void setNationNo(String nationNo) {
	this.nationNo = nationNo;
    }

    /**
     * ncrdId attribute를 리턴한다.
     * 
     * @return the ncrdId
     */
    public String getNcrdId() {
	return ncrdId;
    }

    /**
     * ncrdId attribute 값을 설정한다.
     * 
     * @param ncrdId
     *            the ncrdId to set
     */
    public void setNcrdId(String ncrdId) {
	this.ncrdId = ncrdId;
    }

    /**
     * ncrdTrgterId attribute를 리턴한다.
     * 
     * @return the ncrdTrgterId
     */
    public String getNcrdTrgterId() {
	return ncrdTrgterId;
    }

    /**
     * ncrdTrgterId attribute 값을 설정한다.
     * 
     * @param ncrdTrgterId
     *            the ncrdTrgterId to set
     */
    public void setNcrdTrgterId(String ncrdTrgterId) {
	this.ncrdTrgterId = ncrdTrgterId;
    }

    /**
     * ncrdNm attribute를 리턴한다.
     * 
     * @return the ncrdNm
     */
    public String getNcrdNm() {
	return ncrdNm;
    }

    /**
     * ncrdNm attribute 값을 설정한다.
     * 
     * @param ncrdNm
     *            the ncrdNm to set
     */
    public void setNcrdNm(String ncrdNm) {
	this.ncrdNm = ncrdNm;
    }

    /**
     * ofcpsNm attribute를 리턴한다.
     * 
     * @return the ofcpsNm
     */
    public String getOfcpsNm() {
	return ofcpsNm;
    }

    /**
     * ofcpsNm attribute 값을 설정한다.
     * 
     * @param ofcpsNm
     *            the ofcpsNm to set
     */
    public void setOfcpsNm(String ofcpsNm) {
	this.ofcpsNm = ofcpsNm;
    }

    /**
     * othbcAt attribute를 리턴한다.
     * 
     * @return the othbcAt
     */
    public String getOthbcAt() {
	return othbcAt;
    }

    /**
     * othbcAt attribute 값을 설정한다.
     * 
     * @param othbcAt
     *            the othbcAt to set
     */
    public void setOthbcAt(String othbcAt) {
	this.othbcAt = othbcAt;
    }

    /**
     * remark attribute를 리턴한다.
     * 
     * @return the remark
     */
    public String getRemark() {
	return remark;
    }

    /**
     * remark attribute 값을 설정한다.
     * 
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
	this.remark = remark;
    }

    /**
     * telNo attribute를 리턴한다.
     * 
     * @return the telNo
     */
    public String getTelNo() {
	return telNo;
    }

    /**
     * telNo attribute 값을 설정한다.
     * 
     * @param telNo
     *            the telNo to set
     */
    public void setTelNo(String telNo) {
	this.telNo = telNo;
    }

    /**
     * detailAdres attribute를 리턴한다.
     * 
     * @return the detailAdres
     */
    public String getDetailAdres() {
	return detailAdres;
    }

    /**
     * detailAdres attribute 값을 설정한다.
     * 
     * @param detailAdres
     *            the detailAdres to set
     */
    public void setDetailAdres(String detailAdres) {
	this.detailAdres = detailAdres;
    }

    /**
     * zipCode attribute를 리턴한다.
     * 
     * @return the zipCode
     */
    public String getZipCode() {
	return zipCode;
    }

    /**
     * zipCode attribute 값을 설정한다.
     * 
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    /**
     * toString 메소드를 대치한다.
     */
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }
}

# 공통컴포넌트 DB 컬럼 한글명 매핑

> `DATABASE/<dbms>/all_ccm_ddl_*.sql` 6종 DBMS DDL의 인라인 한글 논리명 주석에서 추출한 매핑표입니다.
> 물리 컬럼명(영문 약어) → 한글 논리명. 명명 표준은 전자정부 공통표준 용어/단어 규칙을 따릅니다.


## IDS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| TABLE_NAME | 대상 테이블명 |
| NEXT_ID | 다음 ID 값 |

## COMTECOPSEQ

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| TABLE_NAME | 대상 테이블명 |
| NEXT_ID | 다음 ID 값 |

## TB_CMMN_CL_CODE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CL_CODE | 분류코드 |
| CL_CODE_NM | 분류코드명 |
| CL_CODE_DC | 분류코드 설명 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_CMMN_CODE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CODE_ID | 코드ID |
| CODE_ID_NM | 코드ID명 |
| CODE_ID_DC | 코드ID 설명 |
| USE_AT | 사용여부(Y/N) |
| CL_CODE | 분류코드 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_CMMN_DETAIL_CODE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CODE_ID | 코드ID |
| CODE | 상세코드 |
| CODE_NM | 상세코드명 |
| CODE_DC | 상세코드 설명 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_ORGNZT_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ORGNZT_ID | 조직ID |
| ORGNZT_NM | 조직명 |
| ORGNZT_DC | 조직 설명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_AUTHOR_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| AUTHOR_CODE | 권한코드 |
| AUTHOR_NM | 권한명 |
| AUTHOR_DC | 권한 설명 |
| AUTHOR_CREAT_DE | 생성일자 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_AUTHOR_GROUP_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| GROUP_ID | 그룹ID |
| GROUP_NM | 그룹명 |
| GROUP_CREAT_DE | 생성일자 |
| GROUP_DC | 그룹 설명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_EMPLYR_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| EMPLYR_ID | 사용자ID |
| ORGNZT_ID | 조직ID |
| USER_NM | 사용자명 |
| PASSWORD | 비밀번호(해시) |
| EMPL_NO | 사번 |
| IHIDNUM | 주민등록번호 |
| SEXDSTN_CODE | 성별코드 |
| BRTHDY | 생년월일 |
| FXNUM | 팩스 |
| HOUSE_ADRES | 자택주소 |
| PASSWORD_HINT | 비밀번호 힌트 |
| PASSWORD_CNSR | 비밀번호 정답 |
| HOUSE_END_TELNO | 자택전화 끝번호 |
| AREA_NO | 지역번호 |
| DETAIL_ADRES | 상세주소 |
| ZIP | 우편번호 |
| OFFM_TELNO | 사무실전화 |
| MBTLNUM | 휴대전화 |
| EMAIL_ADRES | 이메일 |
| OFCPS_NM | 직책명 |
| HOUSE_MIDDLE_TELNO | 자택전화 중간번호 |
| GROUP_ID | 그룹ID |
| PSTINST_CODE | 소속기관코드 |
| EMPLYR_STTUS_CODE | 사용자상태코드 |
| ESNTL_ID | 고유ID |
| CRTFC_DN_VALUE | 인증DN |
| SBSCRB_DE | 가입일시 |
| OCCP_TY | 직업유형 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_GNRL_MBER

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| MBER_ID | 회원ID |
| PASSWORD | 비밀번호(해시) |
| PASSWORD_HINT | 비밀번호 힌트 |
| PASSWORD_CNSR | 비밀번호 정답 |
| IHIDNUM | 주민등록번호 |
| MBER_NM | 회원명 |
| ZIP | 우편번호 |
| ADRES | 주소 |
| AREA_NO | 지역번호 |
| MBER_STTUS | 회원상태코드 |
| DETAIL_ADRES | 상세주소 |
| END_TELNO | 전화 끝번호 |
| MBTLNUM | 휴대전화 |
| GROUP_ID | 그룹ID |
| MBER_FXNUM | 팩스번호 |
| MBER_EMAIL_ADRES | 이메일주소 |
| MIDDLE_TELNO | 전화 중간번호 |
| TELNO | 전화번호 |
| SBSCRB_DE | 가입일시 |
| SEXDSTN_CODE | 성별코드 |
| ESNTL_ID | 고유ID |
| OCCP_TY | 직업유형 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_ENTRPRS_MBER

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ENTRPRS_MBER_ID | 기업회원ID |
| ENTRPRS_SE_CODE | 기업구분코드 |
| BIZRNO | 사업자등록번호 |
| JURIRNO | 법인등록번호 |
| CMPNY_NM | 회사명 |
| CXFC | 대표자명 |
| ZIP | 우편번호 |
| ADRES | 주소 |
| ENTRPRS_MIDDLE_TELNO | 전화 중간번호 |
| FXNUM | 팩스 |
| INDUTY_CODE | 업종코드 |
| APPLCNT_NM | 신청자명 |
| APPLCNT_IHIDNUM | 신청자 주민등록번호 |
| SBSCRB_DE | 가입일시 |
| ENTRPRS_MBER_STTUS | 회원상태코드 |
| ENTRPRS_MBER_PASSWORD | 비밀번호(해시) |
| ENTRPRS_MBER_PASSWORD_HINT | 비밀번호 힌트 |
| ENTRPRS_MBER_PASSWORD_CNSR | 비밀번호 정답 |
| GROUP_ID | 그룹ID |
| DETAIL_ADRES | 상세주소 |
| ENTRPRS_END_TELNO | 전화 끝번호 |
| AREA_NO | 지역번호 |
| APPLCNT_EMAIL_ADRES | 신청자 이메일 |
| TELNO | 전화번호 |
| ESNTL_ID | 고유ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_BBS_MASTER

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BBS_ID | 게시판ID |
| BBS_NM | 게시판명 |
| BBS_INTRCN | 게시판 소개 |
| BBS_TY_CODE | 게시판 유형코드 |
| BBS_ATTRB_CODE | 게시판 속성코드 |
| REPLY_POSBL_AT | 답글 가능(Y/N) |
| FILE_ATCH_POSBL_AT | 파일첨부 가능(Y/N) |
| ATCH_POSBL_FILE_NUMBER | 첨부가능 파일 수 |
| ATCH_POSBL_FILE_SIZE | 첨부가능 총 용량(단위: 시스템 정의) |
| USE_AT | 사용여부(Y/N) |
| TMPLAT_ID | 템플릿ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_BBS_USE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BBS_ID | 게시판ID |
| TRGET_ID | 사용대상ID |
| USE_AT | 사용여부(Y/N) |
| REGIST_SE_CODE | 등록구분코드 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_BBS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NTT_ID | 게시물ID |
| BBS_ID | 게시판ID |
| NTT_NO | 게시물 번호(정렬/표시용) |
| NTT_SJ | 제목 |
| NTT_CN | 내용 |
| ANSWER_AT | 답변글 여부(Y/N) |
| PARNTSCTT_NO | 부모글 번호 |
| ANSWER_LC | 답변 계층(레벨) |
| SORT_ORDR | 정렬순서 |
| RDCNT | 조회수 |
| USE_AT | 사용여부(Y/N) |
| NTCE_BGNDE | 공지 시작일시 |
| NTCE_ENDDE | 공지 종료일시 |
| NTCR_ID | 게시자ID |
| NTCR_NM | 게시자명 |
| PASSWORD | 비밀번호(해시) |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_TMPLAT_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| TMPLAT_ID | 템플릿ID |
| TMPLAT_NM | 템플릿명 |
| TMPLAT_COURS | 템플릿COURS |
| TMPLAT_SE_CODE | 템플릿구분상세코드 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_FAQ_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| FAQ_ID | FAQID |
| QESTN_SJ | 질문제목 |
| QESTN_CN | 질문내용 |
| ANSWER_CN | 답변내용 |
| RDCNT | 조회수 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_QA_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QA_ID | 질의응답ID |
| QESTN_SJ | 질문제목 |
| QESTN_CN | 질문내용 |
| WRITNG_PASSWORD | 작성비밀번호(해시) |
| AREA_NO | 지역번호 |
| MIDDLE_TELNO | 전화 중간번호 |
| END_TELNO | 전화 끝번호 |
| EMAIL_ADRES | 이메일 |
| EMAIL_ANSWER_AT | 이메일답변여부 |
| WRTER_NM | WRTER명 |
| WRITNG_DE | 작성일자 |
| RDCNT | 조회수 |
| QNA_PROCESS_STTUS_CODE | 질의응답처리상태상세코드 |
| ANSWER_CN | 답변내용 |
| ANSWER_DE | 답변일자 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_RESTDE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| RESTDE_NO | 휴일번호 |
| RESTDE_DE | 휴일일자 |
| RESTDE_NM | 휴일명 |
| RESTDE_DC | 휴일설명 |
| RESTDE_SE_CODE | 휴일구분상세코드 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_SCHDUL_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| SCHDUL_ID | 일정ID |
| SCHDUL_SE | 일정구분코드 |
| SCHDUL_DEPT_ID | 부서ID |
| SCHDUL_KND_CODE | 일정종류코드 |
| SCHDUL_BEGINDE | 시작일시 |
| SCHDUL_ENDDE | 종료일시 |
| SCHDUL_NM | 일정명 |
| SCHDUL_CN | 일정 내용 |
| SCHDUL_PLACE | 장소 |
| SCHDUL_IPCR_CODE | 중요도코드 |
| SCHDUL_CHARGER_ID | 담당자ID |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| REPTIT_SE_CODE | 반복구분코드 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_LOGIN_LOG

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| LOG_ID | 로그ID |
| CONECT_MTHD | 접속방식 |
| CONECT_ID | 접속ID |
| CONECT_IP | 접속IP |
| ERROR_OCCRRNC_AT | 오류발생여부 |
| ERROR_CODE | 오류상세코드 |
| CREAT_DT | 생성시각 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_SYS_LOG

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| REQUST_ID | 요청ID |
| OCCRRNC_DE | 발생일자 |
| SVC_NM | 봉사명 |
| METHOD_NM | METHOD명 |
| PROCESS_SE_CODE | 처리구분상세코드 |
| PROCESS_TIME | 처리시간 |
| RQESTER_ID | RQESTERID |
| RQESTER_IP | RQESTERIP |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_CONECT_LOG

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| LOG_ID | 로그ID |
| SRVC_NM | 서비스명 |
| METHOD_NM | METHOD명 |
| OCCRRNC_DE | 발생일자 |
| CREAT_CO | 생성수 |
| UPDT_CO | 갱신수 |
| RDCNT | 조회수 |
| DELETE_CO | 삭제수 |
| OUTPT_CO | OUTPT수 |
| ERROR_CO | 오류수 |
| CONECT_ID | 접속ID |
| CONECT_IP | 접속IP |
| CONECT_MTHD | 접속방식 |
| ERROR_OCCRRNC_AT | 오류발생여부 |
| ERROR_CODE | 오류상세코드 |
| CREAT_DT | 생성시각 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_LOGIN_POLICY

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| EMPLYR_ID | 사용자ID |
| IP_INFO | IP정보 |
| DPLCT_PERM_AT | DPLCTPERM여부 |
| LMTT_AT | LMTT여부 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_PROGRM_CHANGE_DTLS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| PROGRM_FILE_NM | 프로그램파일명 |
| REQUST_NO | 요청번호 |
| PROGRM_KOREAN_NM | 프로그램KOREAN명 |
| RQESTER_ID | RQESTERID |
| CHANGE_REQUST_CN | 변경요청내용 |
| REQUST_PROCESS_CN | 요청처리내용 |
| OPETR_ID | OPETRID |
| PROCESS_STTUS_CODE | 처리상태상세코드 |
| PROCESS_DE | 처리일자 |
| REQUST_DE | 요청일자 |
| REQUST_SJ | 요청제목 |

## TB_ROLES_HIERARCHY

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| PARNTS_ROLE | 부모롤 |
| CHLDRN_ROLE | 자식롤 |

## TB_ROLE_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ROLE_CODE | 역할코드 |
| ROLE_NM | 역할명 |
| ROLE_PTTRN | 롤PTTRN |
| ROLE_DC | 역할설명 |
| ROLE_TY | 역할유형 |
| ROLE_SORT | 역할정렬 |
| ROLE_CREAT_DE | 롤생성일자 |

## TB_AUTHOR_ROLE_RELATE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| AUTHOR_CODE | 권한코드 |
| ROLE_CODE | 역할코드 |
| CREAT_DT | 생성시각 |

## TB_ZIP

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ZIP | 우편번호 |
| SN | 일련번호 |
| CTPRVN_NM | 시도명 |
| SIGNGU_NM | 시군구명 |
| EMD_NM | 읍면동명 |
| LI_BULD_NM | 리건물명 |
| LNBR_DONG_HO | 지번동호 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_BANNER

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BANNER_ID | 배너ID |
| BANNER_NM | 배너명 |
| LINK_URL | 연계URL |
| BANNER_IMAGE | 배너이미지 |
| BANNER_DC | 배너설명 |
| REFLCT_AT | REFLCT여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| BANNER_IMAGE_FILE | 배너이미지파일 |
| SORT_ORDR | 정렬순서 |
| BANNER_TY | 배너유형 |
| POPUP_LEFT | 팝업LEFT |
| POPUP_TOP | 팝업TOP |
| POPUP_WIDTH | 팝업너비 |
| POPUP_HEIGHT | 팝업HEIGHT |
| POPUP_GROUP_AT | 팝업그룹여부 |
| EXPSR_BGNDE | 노출시작일자 |
| EXPSR_ENDDE | 노출종료일자 |

## TB_INDVDL_INFO_POLICY

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| INDVDL_INFO_POLICY_ID | 개인정보정책ID |
| INDVDL_INFO_POLICY_CN | 개인정보정책내용 |
| INDVDL_INFO_POLICY_AGRE_AT | 개인정보정책동의여부 |
| VER | 버전 |
| APLC_DE | 응용일자 |
| REPRSNT_AT | REPRSNT여부 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| INDVDL_INFO_POLICY_NM | 개인정보정책명 |

## TB_PROGRM_LIST

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| PROGRM_FILE_NM | 프로그램파일명 |
| PROGRM_STRE_PATH | 프로그램STRE경로 |
| PROGRM_KOREAN_NM | 프로그램KOREAN명 |
| PROGRM_DC | 프로그램설명 |
| URL | URL |

## TB_MENU_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| MENU_NM | 메뉴명 |
| PROGRM_FILE_NM | 프로그램파일명 |
| MENU_NO | 메뉴번호 |
| UPPER_MENU_NO | UPPER메뉴번호 |
| MENU_ORDR | 메뉴순서 |
| MENU_DC | 메뉴설명 |
| RELATE_IMAGE_PATH | 관련이미지경로 |
| RELATE_IMAGE_NM | 관련이미지명 |

## TB_MENU_CREAT_DTLS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| MENU_NO | 메뉴번호 |
| AUTHOR_CODE | 권한코드 |
| MAPNG_CREAT_ID | MAPNG생성ID |

## TB_QUSTNR_TMPLAT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| QUSTNR_TMPLAT_TY | 설문템플릿유형 |
| QUSTNR_TMPLAT_DC | 설문템플릿설명 |
| QUSTNR_TMPLAT_PATH_NM | 설문템플릿경로명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| QUSTNR_TMPLAT_IMAGE_INFO | 설문템플릿이미지정보 |

## TB_QESTNR_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| QESTNR_ID | QESTNRID |
| QUSTNR_SJ | 설문제목 |
| QUSTNR_PURPS | 설문목적 |
| QUSTNR_WRITNG_GUIDANCE_CN | 설문작성안내내용 |
| QUSTNR_TRGET | 설문대상 |
| QUSTNR_BGNDE | 설문시작일자 |
| QUSTNR_ENDDE | 설문종료일자 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_QUSTNR_QESITM

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QESTNR_ID | QESTNRID |
| QUSTNR_QESITM_ID | 설문QESITMID |
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| QESTN_SN | 질문일련번호 |
| QESTN_TY_CODE | 질문유형상세코드 |
| QESTN_CN | 질문내용 |
| MXMM_CHOISE_CO | MXMMCHOISE수 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_QUSTNR_IEM

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| QESTNR_ID | QESTNRID |
| QUSTNR_QESITM_ID | 설문QESITMID |
| QUSTNR_IEM_ID | 설문항목ID |
| IEM_SN | 항목일련번호 |
| IEM_CN | 항목내용 |
| ETC_ANSWER_AT | 기타답변여부 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_QUSTNR_RESPOND_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| QESTNR_ID | QESTNRID |
| QUSTNR_RESPOND_ID | 설문응답ID |
| SEXDSTN_CODE | 성별코드 |
| OCCP_TY_CODE | 직업유형상세코드 |
| RESPOND_NM | 응답명 |
| BRTHDY | 생년월일 |
| AREA_NO | 지역번호 |
| MIDDLE_TELNO | 전화 중간번호 |
| END_TELNO | 전화 끝번호 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_QUSTNR_RSPNS_RESULT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| QUSTNR_RSPNS_RESULT_ID | 설문응답결과ID |
| QESTNR_ID | QESTNRID |
| QUSTNR_QESITM_ID | 설문QESITMID |
| QUSTNR_TMPLAT_ID | 설문템플릿ID |
| RESPOND_ANSWER_CN | 응답답변내용 |
| ETC_ANSWER_CN | 기타답변내용 |
| RESPOND_NM | 응답명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| QUSTNR_IEM_ID | 설문항목ID |

## TB_STPLAT_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| USE_STPLAT_ID | 이용약관ID |
| USE_STPLAT_NM | 이용약관명 |
| USE_STPLAT_CN | 이용약관 내용 |
| INFO_PROVD_AGRE_CN | 정보제공 동의 내용 |
| VER | 버전 |
| APLC_DE | 응용일자 |
| REPRSNT_AT | REPRSNT여부 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_CTSNN_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CTSNN_ID | 경조사ID |
| USER_ID | 사용자아이디 |
| CTSNN_CODE | 경조사상세코드 |
| REQST_DE | REQST일자 |
| CTSNN_NM | 경조사명 |
| TRGTER_NM | 대상자명 |
| BRTHDY | 생년월일 |
| OCCRRNC_DE | 발생일자 |
| RELATE | 관련 |
| RM | RM |
| SANCTNER_ID | SANCTNERID |
| CONFM_AT | 승인여부 |
| SANCTN_DT | 결재일시 |
| RETURN_RESN | RETURN사유 |
| INFRML_SANCTN_ID | INFRML결재ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_RSS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| RSS_ID | RSSID |
| TRGET_SVC_NM | 대상서비스명 |
| TRGET_SVC_TABLE | 대상서비스TABLE |
| TRGET_SVC_LIST_CO | 대상서비스목록수 |
| HDER_TITLE | 헤더제목 |
| HDER_LINK | 헤더링크 |
| HDER_DC | 헤더설명 |
| HDER_TAG | 헤더태그 |
| HDER_ETC | 헤더기타 |
| BDT_TITLE | 본문제목 |
| BDT_LINK | 본문링크 |
| BDT_DC | 본문설명 |
| BDT_TAG | 본문태그 |
| BDT_ETC_TAG | 본문기타태그 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_NTFC_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NTCN_NO | 알림번호 |
| NTCN_SJ | 알림제목 |
| NTCN_CN | 알림내용 |
| NTCN_TM | 알림시각 |
| BH_NTCN_INTRVL | BH알림INTRVL |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_INTNET_SVC

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| INTNET_SVC_ID | 인터넷서비스ID |
| INTNET_SVC_NM | 인터넷서비스명 |
| INTNET_SVC_DC | 인터넷서비스설명 |
| REFLCT_AT | REFLCT여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_RECOMEND_SITE_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| RECOMEND_SITE_ID | 추천사이트ID |
| RECOMEND_SITE_URL | 추천사이트URL |
| RECOMEND_SITE_NM | 추천사이트명 |
| RECOMEND_SITE_DC | 추천사이트설명 |
| RECOMEND_RESN_CN | 추천사유내용 |
| RECOMEND_CONFM_AT | 추천승인여부 |
| CONFM_DE | 승인일자 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_ROUGHMAP

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ROUGHMAP_ID | 약도ID |
| ROUGHMAPSJ | ROUGHMAPSJ |
| ROUGHMAPADDRESS | ROUGHMAPADDRESS |
| LA | 위도 |
| LO | 경도 |
| MARKERLA | MARKERLA |
| MARKERLO | MARKERLO |
| INFOWINDOW | 말풍선 |
| ZOOMLEVEL | ZOOMLEVEL |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_UNITY_LINK

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| UNITY_LINK_ID | 통합링크ID |
| UNITY_LINK_SE_CODE | 통합링크구분상세코드 |
| UNITY_LINK_NM | 통합링크명 |
| UNITY_LINK_URL | 통합링크URL |
| UNITY_LINK_DC | 통합링크설명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_SITE_LIST

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| SITE_ID | 사이트ID |
| SITE_URL | 사이트URL |
| SITE_NM | 사이트명 |
| SITE_DC | 사이트설명 |
| SITE_THEMA_CL_CODE | 사이트THEMACL상세코드 |
| ACTVTY_AT | 활성여부 |
| USE_AT | 사용여부(Y/N) |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_POPUP_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| POPUP_ID | 팝업ID |
| POPUP_SJ_NM | 팝업제목명 |
| FILE_URL | 파일URL |
| POPUP_VRTICL_LC | 팝업세로위치 |
| POPUP_WIDTH_LC | 팝업너비위치 |
| POPUP_VRTICL_SIZE | 팝업세로크기 |
| POPUP_WIDTH_SIZE | 팝업너비크기 |
| NTCE_BGNDE | 공지 시작일시 |
| NTCE_ENDDE | 공지 종료일시 |
| STOPVEW_SETUP_AT | STOPVEW설정여부 |
| NTCE_AT | 게시여부 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_WIKI_BKMK

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| WIKI_BKMK_ID | 위키북마크ID |
| USER_ID | 사용자아이디 |
| WIKI_BKMK_NM | 위키북마크명 |
| FRST_REGIST_PNTTM | 최초등록시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |
| LAST_UPDUSR_ID | 최종수정자ID |

## TB_EVENT_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| EVENT_ID | 행사ID |
| EVENT_SE | 행사구분 |
| EVENT_NM | 행사명 |
| EVENT_PURPS | 행사목적 |
| EVENT_BGNDE | 행사시작일자 |
| EVENT_ENDDE | 행사종료일자 |
| EVENT_AUSPC_INSTT_NM | 행사AUSPC기관명 |
| EVENT_MNGT_INSTT_NM | 행사관리기관명 |
| EVENT_PLACE | 행사장소 |
| EVENT_CN | 행사내용 |
| CT_OCCRRNC_AT | 법원발생여부 |
| PARTCPT_CT | PARTCPT법원 |
| PSNCPA | PSNCPA |
| REFRN_URL | REFRNURL |
| RCEPT_BGNDE | RCEPT시작일자 |
| RCEPT_ENDDE | RCEPT종료일자 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_RWARD_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| RWARD_ID | 포상ID |
| RWARDWNR_ID | RWARDWNRID |
| RWARD_CODE | 포상상세코드 |
| RWARD_DE | 포상일자 |
| RWARD_NM | 포상명 |
| PBLEN_CN | PBLEN내용 |
| SANCTNER_ID | SANCTNERID |
| CONFM_AT | 승인여부 |
| SANCTN_DT | 결재일시 |
| RETURN_RESN | RETURN사유 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| INFRML_SANCTN_ID | INFRML결재ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_NEWS_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NEWS_ID | 뉴스ID |
| NEWS_SJ | 뉴스제목 |
| NEWS_CN | 뉴스내용 |
| NEWS_ORIGIN | 뉴스ORIGIN |
| NTCE_DE | 게시일자 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_MAIN_IMAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| IMAGE_ID | 이미지ID |
| IMAGE_NM | 이미지명 |
| IMAGE | 이미지 |
| IMAGE_FILE | 이미지파일 |
| IMAGE_DC | 이미지설명 |
| REFLCT_AT | REFLCT여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_LOGIN_SCRIN_IMAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| IMAGE_ID | 이미지ID |
| IMAGE_NM | 이미지명 |
| IMAGE | 이미지 |
| IMAGE_FILE | 이미지파일 |
| IMAGE_DC | 이미지설명 |
| REFLCT_AT | REFLCT여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_MTG_PLACE_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| MTGRUM_ID | 회의실ID |
| MTGRUM_NM | 회의실명 |
| OPN_BEGIN_TM | 개방시작시각 |
| OPN_END_TM | 개방종료시각 |
| ACEPTNC_POSBL_NMPR | 수용가능인원 |
| LC_SE | 위치구분 |
| LC_DETAIL | 위치DETAIL |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_WORD_DICARY_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| WORD_ID | 단어ID |
| WORD_NM | 단어명 |
| ENG_NM | 영문명 |
| WORD_DC | 단어설명 |
| SYNONM | SYNONM |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_INDVDL_PGE_CNTNTS

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CNTNTS_ID | 콘텐츠ID |
| CNTNTS_NM | 콘텐츠명 |
| CNTC_URL | 접촉URL |
| CNTNTS_USE_AT | 콘텐츠사용여부 |
| CNTNTS_LINK_URL | 콘텐츠링크URL |
| CNTNTS_DC | 콘텐츠설명 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_HPCM_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| HPCM_ID | 도움말ID |
| HPCM_SE_CODE | 도움말구분상세코드 |
| HPCM_DFN | 도움말정의 |
| HPCM_DC | 도움말설명 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_COMMUTE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| WRKTM_ID | WRKTMID |
| EMPLYR_ID | 사용자ID |
| ORGNZT_ID | 조직ID |
| WRKT_DT | WRKT일시 |
| WRK_START_TIME | 작업START시간 |
| WRK_END_TIME | 작업종료시간 |
| WRK_HOURS | 작업시간 |
| OVTMWRK_HOURS | OVTMWRK시간 |
| WRK_START_STATUS | 작업STARTSTATUS |
| WRK_END_STATUS | 작업종료STATUS |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ADMINISTRATION_WORD

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ADMINIST_WORD_ID | 행정단어ID |
| ADMINIST_WORD_NM | 행정단어명 |
| ADMINIST_WORD_ENG_NM | 행정단어영문명 |
| ADMINIST_WORD_ABRV_NM | 행정단어약어명 |
| THEMA_RELM | THEMARELM |
| WORD_SE | 단어구분 |
| RELATE_STD_WORD | 관련표준단어 |
| ADMINIST_WORD_DFN | 행정단어정의 |
| ADMINIST_WORD_DC | 행정단어설명 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_NOTE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NOTE_ID | 쪽지ID |
| NOTE_SJ | 쪽지제목 |
| NOTE_CN | 쪽지내용 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_NOTE_TRNSMIT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NOTE_TRNSMIT_ID | 쪽지송신ID |
| NOTE_ID | 쪽지ID |
| TRNSMITER_ID | TRNSMITERID |
| DELETE_AT | 삭제여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_NOTE_RECPTN

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NOTE_RECPTN_ID | 쪽지수신ID |
| NOTE_ID | 쪽지ID |
| NOTE_TRNSMIT_ID | 쪽지송신ID |
| RCVER_ID | 수화자ID |
| READNG_AT | READNG여부 |
| OPEN_YN | 개봉여부 |
| RECPTN_SE | 수신구분 |
| DELETE_AT | 삭제여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_INDVDL_YRYC_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| OCCRRNC_YEAR | 발생연도 |
| USER_ID | 사용자아이디 |
| YRYC_OCCRRNC_CO | 연차발생수 |
| USE_YRYC_CO | 사용연차수 |
| REMNDR_YRYC_CO | REMNDR연차수 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ANNVRSRY_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ANNVRSRY_ID | 기념일ID |
| USER_ID | 사용자아이디 |
| ANNVRSRY_SE | 기념일구분 |
| ANNVRSRY_NM | 기념일명 |
| ANNVRSRY | 기념일 |
| CLDR_SE | 달력구분 |
| ANNVRSRY_NTCN_SETUP | 기념일알림설정 |
| ANNVRSRY_NTCN_BGNDE | 기념일알림시작일자 |
| MEMO | 메모 |
| REPTIT_AT | REPTIT여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_MTG_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| MTG_ID | 회의ID |
| MTG_NM | 회의명 |
| MTG_MTR_CN | 회의원동기내용 |
| MTG_SN | 회의일련번호 |
| MTG_CO | 회의수 |
| MTG_DE | 회의일자 |
| MTG_PLACE | 회의장소 |
| MTG_BEGIN_TM | 회의시작시각 |
| MTG_END_TM | 회의종료시각 |
| CLSDR_MTG_AT | CLSDR회의여부 |
| READNG_BGNDE | READNG시작일자 |
| READNG_AT | READNG여부 |
| MTG_RESULT_CN | 회의결과내용 |
| MTG_RESULT_ENNC | 회의결과암호 |
| ETC_MATTER | 기타MATTER |
| MNGT_DEPT_ID | 관리부서ID |
| MNAER_ID | 담당자ID |
| MNAER_DEPT_ID | 담당자부서ID |
| MTG_AT | 회의여부 |
| NONATDRN_CO | NONATDRN수 |
| ATDRN_CO | ATDRN수 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_RECENT_SRCHWRD_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| SRCHWRD_MANAGE_ID | 검색어MANAGEID |
| SRCHWRD_MANAGE_NM | 검색어MANAGE명 |
| SRCHWRD_CONECT_URL | 검색어접속URL |
| USER_SEARCH_AT | 사용자SEARCH여부 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_RECENT_SRCHWRD

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| SRCHWRD_ID | 검색어ID |
| SRCHWRD_MANAGE_ID | 검색어MANAGEID |
| SRCHWRD_NM | 검색어명 |
| SRCHWRD_CO | 검색어수 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_EVENT_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| EVENT_ID | 행사ID |
| BSNS_YEAR | 용무연도 |
| BSNS_CODE | 용무코드 |
| EVENT_SVC_BGNDE | 행사서비스시작일자 |
| EVENT_SVC_ENDDE | 행사서비스종료일자 |
| SVC_USE_NMPR_CO | 봉사사용국가유공자수 |
| CHARGER_NM | 담당자명 |
| EVENT_CN | 행사내용 |
| EVENT_TY_CODE | 행사유형상세코드 |
| PRPARETG_CN | PRPARETG내용 |
| EVENT_CONFM_AT | 행사승인여부 |
| EVENT_CONFM_DE | 행사승인일자 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_VCATN_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| APPLCNT_ID | APPLCNTID |
| VCATN_SE | VCATN구분 |
| OCCRRNC_YEAR | 발생연도 |
| BGNDE | 시작일자 |
| ENDDE | 종료일자 |
| REQST_DE | REQST일자 |
| VCATN_RESN | VCATN사유 |
| NOON_SE | NOON구분 |
| SANCTNER_ID | SANCTNERID |
| CONFM_AT | 승인여부 |
| SANCTN_DT | 결재일시 |
| RETURN_RESN | RETURN사유 |
| INFRML_SANCTN_ID | INFRML결재ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BNDT_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BNDT_ID | 당직ID |
| BNDT_DE | 당직일자 |
| RM | RM |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BNDT_DIARY

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BNDT_ID | 당직ID |
| BNDT_DE | 당직일자 |
| RM | RM |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BNDT_CECK_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BNDT_ID | 당직ID |
| BNDT_DE | 당직일자 |
| RM | RM |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ONLINE_POLL_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| POLL_ID | 투표ID |
| POLL_NM | 투표명 |
| POLL_BGNDE | 투표시작일자 |
| POLL_ENDDE | 투표종료일자 |
| POLL_KND | 투표종류 |
| POLL_DSUSE_ENNC | 투표폐기암호 |
| POLL_ATMC_DSUSE_ENNC | 투표ATMC폐기암호 |
| QESITM_CN | QESITM내용 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ONLINE_POLL_IEM

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| POLL_ID | 투표ID |
| POLL_IEM_ID | 투표항목ID |
| POLL_IEM_NM | 투표항목명 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ONLINE_MANUAL

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ONLINE_MNL_ID | 온라인매뉴얼ID |
| ONLINE_MNL_NM | 온라인매뉴얼명 |
| ONLINE_MNL_SE_CODE | 온라인매뉴얼구분상세코드 |
| ONLINE_MNL_DFN | 온라인매뉴얼정의 |
| ONLINE_MNL_DC | 온라인매뉴얼설명 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_CPYRHT_INFO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CPYRHT_ID | 저작권ID |
| CPYRHT_PRTC_POLICY_CN | 저작권보호정책내용 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_CNSLT_LIST

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| CNSLT_ID | 컨설팅ID |
| CNSLT_SJ | 컨설팅제목 |
| CNSLT_CN | 컨설팅내용 |
| OTHBC_AT | 외부공개여부 |
| EMAIL_ADRES | 이메일 |
| EMAIL_ANSWER_AT | 이메일답변여부 |
| AREA_NO | 지역번호 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BATCH_OPERT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BATCH_OPERT_ID | 배치작업ID |
| BATCH_OPERT_NM | 배치작업명 |
| BATCH_PROGRM | 배치프로그램 |
| PARAMTR | PARAMTR |
| USE_AT | 사용여부(Y/N) |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BATCH_SCHDUL

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BATCH_SCHDUL_ID | 배치일정ID |
| BATCH_OPERT_ID | 배치작업ID |
| EXECUT_CYCLE | 실행주기 |
| EXECUT_SCHDUL_DE | 실행일정일자 |
| EXECUT_SCHDUL_HOUR | 실행일정HOUR |
| EXECUT_SCHDUL_MNT | 실행일정MNT |
| EXECUT_SCHDUL_SECND | 실행일정SECND |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_BATCH_RESULT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| BATCH_RESULT_ID | 배치결과ID |
| BATCH_SCHDUL_ID | 배치일정ID |
| BATCH_OPERT_ID | 배치작업ID |
| PARAMTR | PARAMTR |
| STTUS | 상태 |
| ERROR_INFO | 오류정보 |
| EXECUT_BEGIN_TM | 실행시작시각 |
| EXECUT_END_TM | 실행종료시각 |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_NCRD

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| NCRD_ID | 명함ID |
| NM | 명 |
| NCRD_TRGTER_ID | 명함대상자ID |
| OTHBC_AT | 외부공개여부 |
| EXTRL_USER_AT | EXTRL사용자여부 |
| CMPNY_NM | 회사명 |
| DEPT_NM | 부서명 |
| OFCPS_NM | 직책명 |
| IDNTFC_NO | IDNTFC번호 |
| FRST_MBTLNUM | 최초휴대전화 |
| MIDDLE_MBTLNUM | MIDDLE휴대전화 |
| END_MBTLNUM | 종료휴대전화 |
| EMAIL_ADRES | 이메일 |
| ADRES | 주소 |
| ZIP_CODE | 우편번호코드 |
| REMARK | REMARK |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_DAM_KNO_IFM

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| KNWLDG_ID | 지식ID |
| KNWLDG_NM | 지식명 |
| KNWLDG_CN | 지식내용 |
| KNWLDG_TY_CODE | 지식유형상세코드 |
| KNWLDG_EVL | 지식평가 |
| OTHBC_AT | 외부공개여부 |
| EVL_DE | 평가일자 |
| ATCH_FILE_ID | 첨부파일 묶음ID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_ADBK_MANAGE

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ADBK_ID | 주소록ID |
| ADBK_NM | 주소록명 |
| OTHBC_SCOPE | 외부공개SCOPE |
| USE_AT | 사용여부(Y/N) |
| WRTER_ID | WRTERID |
| TRGET_ORGNZT_ID | 대상ORGNZTID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_COMMENT

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| ANSWER_NO | 답변번호 |
| NTT_ID | 게시물ID |
| BBS_ID | 게시판ID |
| WRTER_ID | WRTERID |
| WRTER_NM | WRTER명 |
| ANSWER | 답변 |
| PASSWORD | 비밀번호(해시) |
| USE_AT | 사용여부(Y/N) |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

## TB_MEMO_TODO

| 물리 컬럼명 | 한글 논리명 |
|-------------|-------------|
| TODO_ID | 할일ID |
| TODO_SJ | 할일제목 |
| TODO_CN | 할일내용 |
| TODO_BEGIN_TIME | 할일시작시간 |
| TODO_END_TIME | 할일종료시간 |
| WRTER_ID | WRTERID |
| FRST_REGISTER_ID | 최초등록자ID |
| FRST_REGIST_PNTTM | 최초등록시각 |
| LAST_UPDUSR_ID | 최종수정자ID |
| LAST_UPDT_PNTTM | 최종수정시각 |

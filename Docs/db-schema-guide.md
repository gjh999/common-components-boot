# 공통컴포넌트 DB 스키마 가이드

전자정부 표준프레임워크 공통컴포넌트(Spring Boot 전환본)의 데이터베이스 명명·구성 표준과 DBMS별 산출물 안내입니다.

## 1. 명명 표준

- **테이블**: `TB_` 접두 + `SNAKE_CASE` (예: `TB_CMMN_CODE`, `TB_BBS_MASTER`)
- **컬럼**: 전자정부 공통표준 **용어/단어 규칙** 기반 영문 약어명 (예: `EMPLYR_ID`, `FRST_REGIST_PNTTM`)
  - 물리 컬럼명 ↔ 한글 논리명 매핑은 [`db-컬럼-한글명-매핑.md`](db-컬럼-한글명-매핑.md) 참조
- **감사 컬럼 4종**: 등록자 `FRST_REGISTER_ID` · 등록일시 `FRST_REGIST_PNTTM` · 수정자 `LAST_UPDUSR_ID` · 수정일시 `LAST_UPDT_PNTTM`

## 2. 런타임 DB (개발/데모)

- 내장 **HSQLDB** — 별도 설치 없이 애플리케이션 기동 시 자동 로드
- 스키마+시드: `src/main/resources/db/shtdb.sql`
- 데모 계정: `admin`/`1`, 예제는 로그인 없이(익명) 실제 DB와 연동되어 동작

## 3. 운영 DDL/DML (6종 DBMS)

`DATABASE/<dbms>/` 아래에 DBMS별로 동봉합니다.

| DBMS | DDL | DML |
|------|-----|-----|
| Altibase | `DATABASE/altibase/all_ccm_ddl_altibase.sql` | `all_ccm_data_altibase.sql` |
| CUBRID | `DATABASE/cubrid/all_ccm_ddl_cubrid.sql` | `all_ccm_data_cubrid.sql` |
| MySQL | `DATABASE/mysql/all_ccm_ddl_mysql.sql` | `all_ccm_data_mysql.sql` |
| Oracle | `DATABASE/oracle/all_ccm_ddl_oracle.sql` | `all_ccm_data_oracle.sql` |
| PostgreSQL | `DATABASE/postgresql/all_ccm_ddl_postgresql.sql` | `all_ccm_data_postgresql.sql` |
| Tibero | `DATABASE/tibero/all_ccm_ddl_tibero.sql` | `all_ccm_data_tibero.sql` |

### 현황

- **테이블 수**: 6종 DBMS 모두 **87 테이블**(정합 일치)
- **DDL 주석**: 전 컬럼에 **한글 논리명 인라인 주석** 부여
  - 예: `EMPLYR_ID VARCHAR(20) NOT NULL PRIMARY KEY,  -- 사용자ID`
- **DML 컬럼명**: 모든 INSERT에 **컬럼명 명시**(미명시 0건, 6종 전량)
- **정합**: DDL이 생성하는 테이블과 DML이 시드하는 테이블 일치(공통코드·채번·회원·게시판·로그 등 foundation 테이블 포함)

## 4. MyBatis 매퍼

- 위치: `src/main/resources/egovframework/mapper/com/`
- DBMS 7종 대응: HSQL(기본) + Altibase · CUBRID · MySQL · Oracle · PostgreSQL · Tibero
- 접속 DBMS에 따라 매퍼가 분기되어 동일 기능이 각 DBMS 문법으로 동작

## 5. 파괴적 변경 주의

`DROP TABLE`/`DROP COLUMN`/`TRUNCATE` 등 데이터 손실을 포함하는 변경은 **반드시 사전 백업 후** 진행하십시오.
`ADD COLUMN`/`CREATE TABLE` 등 추가(비파괴) 변경은 백업이 필요하지 않습니다.

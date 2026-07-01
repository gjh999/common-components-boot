# DATABASE — 운영 DB용 DDL/DATA (6 DBMS)

> **중요**: 실행 중인 Boot 앱은 이 폴더의 파일을 **자동 실행하지 않습니다.**
> 앱은 기동 시 **인메모리 HSQL**(`src/main/resources/db/shtdb.sql` + `all-legacy-schema-hsql.sql`)로 구동됩니다.
> 이 폴더는 **PostgreSQL/MySQL/Oracle/Tibero/CUBRID/Altibase 등 실제 운영 DB에 배포할 때 쓰는 DDL/DATA**입니다.

각 DBMS 폴더(`postgresql/`, `mysql/`, `oracle/`, `tibero/`, `cubrid/`, `altibase/`)에는 다음 3종이 있습니다.

| 파일 | 내용 | 언제 사용 |
|---|---|---|
| **`all_ccm_ddl_<dbms>.sql`** | **표준화 테이블 정본** — Boot로 재구축한 공통컴포넌트의 `TB_`/UPPER_SNAKE + 감사컬럼(FRST_REGIST_PNTTM 등) 테이블. **앱의 MyBatis 매퍼가 실제 참조하는 이름**입니다. | 운영 배포 시 **이걸 사용**(앱이 동작하는 표준 스키마) |
| **`all_ccm_data_<dbms>.sql`** | 위 표준화 테이블의 시드 데이터 | `all_ccm_ddl` 실행 후 |
| **`legacy_full_schema_<dbms>.sql`** | **JSP 원본 전체 스키마 참조본** — eGov 공통컴포넌트 176개 원본 테이블(`COMTN*`/`COMTC*` 레거시 이름, **아직 이식 안 된 모듈 포함**). "모든 테이블 이관" 요청으로 JSP `script/ddl`을 통합·중복제거한 것. | 원본 전체 스키마가 필요하거나, 아직 표준화 안 한 모듈을 원본 이름으로 쓸 때 **참조용** |

## 요약
- **실제 앱이 쓰는 것 = `all_ccm_ddl_*`** (+ 인메모리 HSQL). 표준화된 `TB_` 이름.
- **`legacy_full_schema_*`** = 원본 JSP 전체 스키마의 완전 이관 **참조본**(레거시 `COMTN*` 이름, 미이식 포함).
- 두 세트는 **이름 규칙이 다릅니다**(표준=`TB_`, 레거시=`COMTN*`). 같은 개념의 테이블이 양쪽에 다른 이름으로 있을 수 있습니다(예: `TB_BBS_MASTER` ↔ `COMTNBBSMASTER`).

---
name: sql-convention
description: >-
  전자정부 표준프레임워크 SQL 작성 규칙(sql-rule)에 맞춰 쿼리를 작성·정비할 때 사용한다.
  SQL 키워드 대문자, 키워드 우측정렬('T'/'E' 기준), 앞쪽 콤마(leading comma), 컬럼 1줄 1개,
  별칭 AS 필수·테이블 별칭 A/B/C, SELECT * 금지(명시 컬럼), /* */ 주석(-- 금지), 바인드변수(#{}),
  인라인뷰 최대 3단계를 포함한다. MyBatis 매퍼 XML·SQL 작성/리뷰/통일 시 사용.
---

# sql-convention — 전자정부 표준프레임워크 SQL 작성 규칙

> 출처: eGovFramework 공식 문서 `egovframe-runtime/persistence-layer/sql-rule.md`
> (https://github.com/eGovFramework/egovframe-docs)

## 0. 핵심 원칙 (요약 체크리스트)
- [ ] **키워드 대문자** (SELECT/FROM/WHERE/AND/INSERT/UPDATE/DELETE 등). 변수·컬럼은 UI 네이밍룰.
- [ ] **키워드 우측정렬**: SELECT/FROM/WHERE/AND 를 SELECT의 **`T`** 열에 맞춰 우측정렬.
- [ ] **앞쪽 콤마(leading comma)**: 콤마를 줄 앞에 두고, 콤마 뒤 한 칸 띄움.
- [ ] **컬럼 1줄에 1개** (SELECT/INSERT/UPDATE 대상 컬럼).
- [ ] **별칭 AS 필수**: 컬럼 별칭은 반드시 `AS`. 테이블 별칭은 순차 대문자 `A, B, C…`.
- [ ] **`SELECT *` 금지**: 애플리케이션에서 쓰는 컬럼만 명시.
- [ ] **주석 `/* */`** 사용, **`--` 금지**. 주석은 SQL 구문 위에.
- [ ] **바인드 변수**: WHERE 비교값은 전부 바인드 변수(MyBatis `#{}`).
- [ ] **공백만 사용(TAB 금지)**, 가로 80칼럼 권장·최대 120.
- [ ] **인라인뷰 최대 3단계**(권장 2단계).
- [ ] WHERE절: **조인조건 먼저, 조회조건 나중**. DELETE는 **WHERE 필수**.

## 1. SELECT — 우측정렬 + 앞쪽 콤마
`SELECT`(6자)의 `T`가 6열 → 이후 키워드를 6열에 우측정렬.
```sql
/* 게시물 목록 조회 */
SELECT  A.NTT_ID            AS nttId
      , A.NTT_SJ            AS nttSj
      , A.NTCR_NM           AS ntcrNm
      , A.RDCNT             AS rdcnt
      , A.FRST_REGIST_PNTTM AS frstRegistPnttm
  FROM  TB_BBS         A
      , TB_BBS_MASTER  B
 WHERE  A.BBS_ID = B.BBS_ID          /* 조인조건 먼저 */
   AND  A.USE_AT = 'Y'               /* 조회조건 나중 */
   AND  A.BBS_ID = #{bbsId}          /* 비교값은 바인드변수 */
 ORDER  BY A.NTT_ID DESC
```
- `SELECT` 다음 첫 컬럼은 같은 줄, 2번째부터 **앞쪽 콤마**.
- 컬럼 별칭은 `AS` + 카멜케이스(결과 매핑용). `*` 사용 금지.

## 2. INSERT — INSERT의 `T` 기준 정렬, 여는 괄호 뒤 바로 컬럼
```sql
/* 게시물 등록 */
INSERT  INTO TB_BBS
      ( NTT_ID
      , BBS_ID
      , NTT_SJ
      , NTT_CN
      , FRST_REGIST_PNTTM
      , FRST_REGISTER_ID )
VALUES  ( #{nttId}
        , #{bbsId}
        , #{nttSj}
        , #{nttCn}
        , #{frstRegistPnttm}
        , #{frstRegisterId} )
```
- `INTO/VALUES/괄호/콤마`는 INSERT의 `T`(6열) 기준 정렬. 여는 괄호 `(` 뒤 첫 컬럼 붙임, 닫는 괄호는 여는 괄호 열에 정렬.

## 3. UPDATE — UPDATE의 `E` 기준 정렬
```sql
/* 게시물 수정 */
UPDATE  TB_BBS
   SET  NTT_SJ          = #{nttSj}
      , NTT_CN          = #{nttCn}
      , LAST_UPDT_PNTTM = #{lastUpdtPnttm}
      , LAST_UPDUSR_ID  = #{lastUpdusrId}
 WHERE  BBS_ID = #{bbsId}
   AND  NTT_ID = #{nttId}
```
- `SET/WHERE/AND/콤마`는 UPDATE의 `E`(6열) 기준 정렬. 첫 컬럼 외 앞쪽 콤마.

## 4. DELETE — DELETE의 끝 `E` 기준 정렬, WHERE 필수
```sql
/* 게시물 논리삭제 대신 물리삭제 예 */
DELETE
  FROM  TB_BBS
 WHERE  BBS_ID = #{bbsId}
   AND  NTT_ID = #{nttId}
```
- **WHERE 절 생략 금지**(전체 삭제 방지).

## 5. MyBatis 매퍼 적용 요령
- `resultType`/`resultMap`으로 컬럼→카멜 매핑(위 `mapUnderscoreToCamelCase` 사용 시 별칭 생략 가능하나, 규칙상 명시적 `AS`+컬럼 나열 권장).
- 동적 SQL은 `<if>`/`<where>`/`<foreach>` 사용, 비교값은 `#{}`(바인드). `${}`(치환)는 인젝션 위험 — 컬럼·정렬키 등 불가피할 때만.
- `<![CDATA[ ... ]]>` 안에서도 위 포맷 유지. 부등호(`<`,`>`)는 CDATA 또는 `&lt;`/`&gt;`.

## 6. 자체 점검
- 위반 탐지: `scripts/sql-convention-check.sh <경로>` — `SELECT *`·`--` 주석·소문자 키워드·TAB 검출(읽기전용).
- 기존 대량 매퍼를 한 번에 재포맷하면 동작 중 쿼리를 깨뜨릴 위험이 크므로, **신규/수정 쿼리부터 규칙 적용**하고 기존은 모듈 단위로 점진 정비를 권장.

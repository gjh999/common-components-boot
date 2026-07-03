# 전자정부 표준프레임워크 SQL 작성 규칙 (요약·정리)

> 출처: eGovFramework 공식 문서 **`egovframe-runtime/persistence-layer/sql-rule.md`**
> https://github.com/eGovFramework/egovframe-docs/blob/master/egovframe-runtime/persistence-layer/sql-rule.md
> 본 문서는 공식 규칙을 실무 적용 관점에서 요약·예시화한 것입니다. 원문을 최종 기준으로 삼으세요.

## 1. 공통 서식
| 항목 | 규칙 |
|------|------|
| 키워드 | **대문자** 작성 원칙. 변수(바인드)·컬럼은 UI 네이밍룰 |
| 가로 길이 | **80칼럼 권장, 최대 120칼럼** |
| 들여쓰기 | **공백(SPACE)만**, TAB 금지 |
| 콤마 | **앞쪽 콤마**(줄 앞), 콤마 뒤 한 칸 |
| 별칭 | 컬럼 별칭 **`AS` 필수**, 테이블 별칭 **순차 대문자 A/B/C** |
| 전체컬럼 | **`SELECT *` 금지** — 사용 컬럼만 명시 |
| 주석 | **`/* */` 사용**, `--` 금지. 주석은 SQL 위 |
| 비교값 | WHERE 비교값은 **바인드 변수**(MyBatis `#{}`) |
| 인라인뷰 | 최대 **3단계**(권장 2) |

## 2. 정렬 기준
- **SELECT**: `SELECT/FROM/WHERE/AND` 를 `SELECT`의 **`T`(6열)** 에 우측정렬
- **INSERT**: `INTO/VALUES/괄호/콤마` 를 `INSERT`의 **`T`** 기준 정렬
- **UPDATE**: `SET/FROM/WHERE/AND/콤마` 를 `UPDATE`의 **`E`** 기준 정렬
- **DELETE**: `FROM/WHERE/AND/콤마` 를 `DELETE`의 끝 **`E`** 기준 정렬, **WHERE 필수**
- WHERE절: **조인조건 → 조회조건** 순

## 3. 예시
### SELECT
```sql
/* 게시물 목록 조회 */
SELECT  A.NTT_ID            AS nttId
      , A.NTT_SJ            AS nttSj
      , A.FRST_REGIST_PNTTM AS frstRegistPnttm
  FROM  TB_BBS        A
      , TB_BBS_MASTER B
 WHERE  A.BBS_ID = B.BBS_ID
   AND  A.USE_AT = 'Y'
   AND  A.BBS_ID = #{bbsId}
```
### INSERT / UPDATE / DELETE
```sql
INSERT  INTO TB_BBS
      ( NTT_ID, BBS_ID, NTT_SJ )
VALUES  ( #{nttId}, #{bbsId}, #{nttSj} )
```
```sql
UPDATE  TB_BBS
   SET  NTT_SJ = #{nttSj}
      , NTT_CN = #{nttCn}
 WHERE  BBS_ID = #{bbsId}
   AND  NTT_ID = #{nttId}
```
```sql
DELETE
  FROM  TB_BBS
 WHERE  BBS_ID = #{bbsId}
   AND  NTT_ID = #{nttId}
```

## 4. 적용 지침(대량 기존 코드)
- 신규/수정 쿼리는 처음부터 이 규칙으로 작성한다.
- 기존 운영 매퍼(수천 구문)를 **일괄 재포맷하면 동작을 깨뜨릴 위험**이 크므로, **모듈 단위로 점진 정비 + 회귀 확인**을 원칙으로 한다.
- 위반 탐지는 `sql-convention` 스킬의 `scripts/sql-convention-check.sh` 사용(읽기전용).

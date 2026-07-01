# 전자정부 표준프레임워크 공통컴포넌트 (Spring Boot + Thymeleaf + KRDS)

![java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![springboot](https://img.shields.io/badge/Spring%20Boot-3.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![krds](https://img.shields.io/badge/KRDS-Design%20System-1A4F8B?style=for-the-badge)
![egovframe](https://img.shields.io/badge/eGovFrame-5.0-1A4F8B?style=for-the-badge)

> 전자정부 표준프레임워크 **공통컴포넌트(JSP/WAR)** 를 **Spring Boot + Thymeleaf(JAR)** 로 전환하고,
> **KRDS(Korea Design System)** 디자인과 **다국어(한국어/English)** 를 적용한 프로젝트입니다.
> 공통컴포넌트를 **예제와 함께 바로 사용**할 수 있도록 구성했습니다.

## 빠른 시작
```bash
mvn clean package -DskipTests
java -Dfile.encoding=UTF-8 -jar target/egovframe-boot-common-components-5.0.0.jar --server.port=38080
```
접속: **http://localhost:38080** · 예제 카탈로그: **http://localhost:38080/examples** · 관리자 `admin`/`1`

## 제공 현황
### ✅ 코어 공통컴포넌트 (Boot+Thymeleaf+KRDS+i18n+TB_표준화·7종 DBMS 매퍼 완비)
게시판(공지/갤러리/자료실·답글·첨부)·게시판마스터·템플릿 · FAQ·Q&A·설문조사·배너(메인/팝업/푸터·게시기간)
· 회원관리(3유형 통합)·업무사용자·권한·롤·그룹·사용자구분 안내
· 공통코드(분류/공통/상세)·우편번호·메뉴목록/생성·프로그램(변경요청 워크플로)
· 접속로그·시스템로그·접속통계 · 휴일/달력 · 약관/개인정보처리방침(통합·푸터 모달)·로그인정책·사용자부재
· 로그인(세션) · KRDS 컴포넌트 예시 · **예제 카탈로그(`/examples`)**

### 🔶 확장/주변 모듈 (이식 진행 대상)
스마트에디터·댓글·커뮤니티·통지·SMS·이메일 · 디지털콘텐츠관리(dam) · 배치(bat)·SSO(ssi)·보안고급(drm/pki)
· 시스템 모니터링(서버/네트워크/백업) · 코드·로그·통계 확장 등 — eGov 공통컴포넌트 풀셋.
원본은 `_legacy_jsp_src/`(JSP/WAR)에 보존되어 있으며, 모듈별로 **TB_표준화→매퍼(7종)→Thymeleaf+KRDS 전환**으로 이식한다.

## 표준
- **DB**: 테이블 `TB_`+snake_case·감사컬럼 4종, 매퍼 7종 DBMS(hsql 기본, postgresql/mysql/oracle/tibero/cubrid/altibase), 내장 HSQL 런타임(`db/shtdb.sql`).
- **화면**: Thymeleaf + 공식 KRDS(로컬, CDN 미사용), Bootstrap 프레임워크 미사용(`bi-*` 아이콘만), Pretendard GOV.
- **i18n**: `message-ui_{ko,en}.properties` 키 정합.
- **빌드/실행**: Java 17 · Maven 3.9.9 · 포트 38080.

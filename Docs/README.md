# Docs — 공통컴포넌트 레퍼런스 문서

전자정부 표준프레임워크 공통컴포넌트(Spring Boot + Thymeleaf + KRDS) 전환 프로젝트의 규칙·가이드·전환 참고 문서 모음입니다.

## 데이터베이스
- [db-schema-guide.md](db-schema-guide.md) — DB 명명 표준, 6종 DBMS DDL/DML 현황, 매퍼
- [db-컬럼-한글명-매핑.md](db-컬럼-한글명-매핑.md) — 물리 컬럼명 ↔ 한글 논리명 매핑(87테이블·1,002컬럼)

## 명명·표준 규칙 (전자정부 공통표준)
- [용어규칙.md](용어규칙.md) · [용어규칙_1~4.md](.) — 물리명 ↔ 논리명 용어 사전
- [단어규칙.md](단어규칙.md) — 단어(약어) ↔ 한글 사전
- [도메인규칙.md](도메인규칙.md) — 도메인(데이터 타입) 규칙

## KRDS (Korea Design System)
- [krds-적용-가이드.md](krds-적용-가이드.md)
- [krds-uiux-가이드라인(2025.08).md](krds-uiux-가이드라인(2025.08).md) · [요약](krds-uiux-가이드라인(2025.08)-요약.md)
- [krds-uiux-자체검증-체크리스트.md](krds-uiux-자체검증-체크리스트.md) · [요약](krds-uiux-자체검증-체크리스트-요약.md)

## eGov 설정 전환 (XML → Java Config / Boot)
- [configuration-setting-bean-regist.md](configuration-setting-bean-regist.md)
- context-*-convert.md — aspect / common / datasource / idgen / mapper / properties / transaction / validator / whitelist
- [context-hierarchy.md](context-hierarchy.md) · [context-aspect.md](context-aspect.md)

## 기여
- [CONTRIBUTING.md](CONTRIBUTING.md) · [CONTRIBUTE_README.md](CONTRIBUTE_README.md)

## 스크린샷
- [screenshots/](screenshots/) — README 화면 미리보기 이미지

## SQL 코드 컨벤션
- [sql-코드컨벤션.md](sql-코드컨벤션.md) — 전자정부 SQL 작성 규칙(sql-rule 기반)

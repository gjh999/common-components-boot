#!/usr/bin/env bash
# eGov SQL 작성 규칙 위반 탐지(읽기전용). 사용법: bash sql-convention-check.sh <경로>
# 검출: SELECT * / '--' 주석 / 소문자 키워드 / TAB 들여쓰기
# (리포팅 스크립트 — grep 무매칭(exit1)에 중단되지 않도록 set -e 미사용)
ROOT="${1:-.}"

echo "== eGov SQL convention check: $ROOT =="

sel_star=$(grep -rhicE "select[[:space:]]+\*" "$ROOT" --include="*.xml" --include="*.sql" 2>/dev/null | awk '{s+=$1} END{print s+0}')
echo "[SELECT *] 금지 위반(명시 컬럼 사용해야): $sel_star"

dash=$(grep -rhc -- "--" "$ROOT" --include="*.xml" --include="*.sql" 2>/dev/null | awk '{s+=$1} END{print s+0}')
echo "[-- 주석] 금지 위반(/* */ 사용해야): $dash"

lower=$(grep -rhicE "(^|[[:space:]>])(select|from|where|insert|update|delete)[[:space:]]" "$ROOT" --include="*.xml" --include="*.sql" 2>/dev/null | awk '{s+=$1} END{print s+0}')
lowerU=$(grep -rhcE "(^|[[:space:]>])(SELECT|FROM|WHERE|INSERT|UPDATE|DELETE)[[:space:]]" "$ROOT" --include="*.xml" --include="*.sql" 2>/dev/null | awk '{s+=$1} END{print s+0}')
echo "[소문자 키워드] 대문자여야 (대문자 $lowerU / 소문자포함 라인 $lower)"

tabs=$(grep -rlP "\t" "$ROOT" --include="*.xml" --include="*.sql" 2>/dev/null | wc -l)
echo "[TAB 들여쓰기] 공백만 허용 — TAB 포함 파일수: $tabs"

echo "== 완료 (수치가 0에 가까울수록 규칙 준수) =="

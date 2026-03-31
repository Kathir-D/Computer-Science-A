#!/usr/bin/env bash

set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT_DIR"

COURSE_ROOT="courses/CS22526"

usage() {
  cat <<'EOF'
Usage:
  scripts/labs-java.sh compile-all
  scripts/labs-java.sh compile-unit <UnitName>
  scripts/labs-java.sh compile-file <PathToJavaFile>
  scripts/labs-java.sh run <FullyQualifiedClassName>
  scripts/labs-java.sh clean

Examples:
  scripts/labs-java.sh compile-all
  scripts/labs-java.sh compile-unit Unit12
  scripts/labs-java.sh compile-file courses/CS22526/Labs/Unit5/PartList.java
  scripts/labs-java.sh run CS22526.Labs.Unit12.PQTestRunner
  scripts/labs-java.sh clean
EOF
}

compile_all() {
  (
    cd "courses"
    javac \
      CS22526/Labs/Unit1/*.java \
      CS22526/Labs/Unit2/*.java \
      CS22526/Labs/Unit3/*.java \
      CS22526/Labs/Unit4/*.java \
      CS22526/Labs/Unit5/*.java \
      CS22526/Labs/Unit6/*.java \
      CS22526/Labs/Unit7/*.java \
      CS22526/Labs/Unit8/*.java \
      CS22526/Labs/Unit8/BJ/*.java \
      CS22526/Labs/Unit9/*.java \
      CS22526/Labs/Unit10/*.java \
      CS22526/Labs/Unit11/*.java \
      CS22526/Labs/Unit12/*.java
  )
}

compile_file() {
  local file_path="${1:-}"
  if [[ -z "$file_path" ]]; then
    echo "Missing Java file path." >&2
    exit 1
  fi

  if [[ ! -f "$file_path" ]]; then
    echo "File not found: $file_path" >&2
    exit 1
  fi

  if [[ "$file_path" != *.java ]]; then
    echo "Expected a .java file: $file_path" >&2
    exit 1
  fi

  javac -cp courses -sourcepath courses "$file_path"
}

compile_unit() {
  local unit="${1:-}"
  if [[ -z "$unit" ]]; then
    echo "Missing unit. Example: Unit12" >&2
    exit 1
  fi

  if [[ "$unit" == "Unit8" ]]; then
    (
      cd "courses"
      javac CS22526/Labs/Unit8/*.java CS22526/Labs/Unit8/BJ/*.java
    )
  else
    (
      cd "courses"
      javac "CS22526/Labs/${unit}"/*.java
    )
  fi
}

clean_classes() {
  rm -f "${COURSE_ROOT}"/Labs/Unit1/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit2/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit3/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit4/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit5/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit6/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit7/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit8/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit8/BJ/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit9/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit10/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit11/*.class
  rm -f "${COURSE_ROOT}"/Labs/Unit12/*.class
}

command="${1:-}"

case "$command" in
  compile-all)
    compile_all
    ;;
  compile-unit)
    compile_unit "${2:-}"
    ;;
  compile-file)
    compile_file "${2:-}"
    ;;
  run)
    if [[ -z "${2:-}" ]]; then
      echo "Missing class name." >&2
      exit 1
    fi
    java -cp courses "${2}"
    ;;
  clean)
    clean_classes
    ;;
  *)
    usage
    exit 1
    ;;
esac

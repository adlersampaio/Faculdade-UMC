#!/usr/bin/env bash
# Compila e executa os testes das regras de calculo (Linux / macOS).
# Uso: ./testar.sh
set -e
cd "$(dirname "$0")"

mkdir -p build
javac -encoding UTF-8 -d build src/Funcionario.java teste/TesteFuncionario.java
java -cp build TesteFuncionario

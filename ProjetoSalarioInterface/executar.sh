#!/usr/bin/env bash
# Compila e executa a aplicacao da folha de pagamento (Linux / macOS).
# Uso: ./executar.sh
set -e
cd "$(dirname "$0")"

echo "Compilando..."
mkdir -p build
javac -encoding UTF-8 -d build src/*.java

echo "Abrindo a janela da folha de pagamento..."
java -cp build FormFuncionario

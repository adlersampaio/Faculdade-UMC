@echo off
REM Compila e executa a aplicacao da folha de pagamento (Windows).
cd /d "%~dp0"

echo Compilando...
if not exist build mkdir build
javac -encoding UTF-8 -d build src\*.java
if errorlevel 1 goto erro

echo Abrindo a janela da folha de pagamento...
java -cp build FormFuncionario
goto fim

:erro
echo.
echo Erro na compilacao. Verifique se o JDK esta instalado (javac -version).
pause

:fim

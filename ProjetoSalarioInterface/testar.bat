@echo off
REM Compila e executa os testes das regras de calculo (Windows).
cd /d "%~dp0"

if not exist build mkdir build
javac -encoding UTF-8 -d build src\Funcionario.java teste\TesteFuncionario.java
if errorlevel 1 goto erro

java -cp build TesteFuncionario
pause
goto fim

:erro
echo.
echo Erro na compilacao. Verifique se o JDK esta instalado (javac -version).
pause

:fim

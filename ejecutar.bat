@echo off
REM Script para compilar y ejecutar el programa en Windows

setlocal enabledelayedexpansion

REM Cambiar al directorio del proyecto
cd /d "%~dp0"

echo.
echo ========================================
echo   COMPILADOR - LAMBORGHINI DEALER
echo ========================================
echo.

REM Crear directorio bin si no existe
if not exist bin mkdir bin

echo [1/3] Compilando archivos...
echo.

cd src
for /r %%f in (*.java) do (
    javac -d ../bin -encoding UTF-8 "%%f" >nul 2>&1
)

if %ERRORLEVEL% neq 0 (
    echo.
    echo ERROR: La compilacion fallo.
    pause
    exit /b 1
)

echo.
echo [2/3] Compilacion exitosa!
echo.

cd ..

echo [3/3] Ejecutando programa...
echo.
echo ========================================
echo.

java -cp bin edu.divana.rojas.Main

if %ERRORLEVEL% neq 0 (
    echo.
    echo ERROR: Fallo durante la ejecucion.
    pause
    exit /b 1
)

endlocal

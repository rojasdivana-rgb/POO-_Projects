@echo off
chcp 65001 > nul
cls

echo ========================================
echo   SISTEMA DE VENTAS LAMBORGHINI
echo ========================================
echo.

REM Cambiar al directorio del script
cd /d "%~dp0"

REM Crear directorio out si no existe
if not exist out mkdir out

echo [1/3] Compilando archivos...
echo.

REM Compilar todos los archivos Java
javac -d out -encoding UTF-8 -sourcepath java/src java/src/edudivanarojas/actividad1/Main.java java/src/edudivanarojas/actividad1/model/*.java java/src/edudivanarojas/actividad1/repository/*.java java/src/edudivanarojas/actividad1/process/ventas/*.java java/src/edudivanarojas/actividad1/process/reportes/*.java java/src/edudivanarojas/actividad1/ui/*.java java/src/edudivanarojas/actividad1/utils/*.java

if errorlevel 1 (
    echo.
    echo ERROR: La compilacion fallo.
    pause
    exit /b 1
)

echo.
echo [2/3] Compilacion exitosa!
echo.
echo [3/3] Ejecutando programa...
echo.
echo ========================================
echo.

REM Ejecutar el programa
java -cp out edudivanarojas.actividad1.Main

if errorlevel 1 (
    echo.
    echo ERROR: Fallo durante la ejecucion.
    pause
    exit /b 1
)

pause

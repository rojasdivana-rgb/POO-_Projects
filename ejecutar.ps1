# Script para compilar y ejecutar el sistema de ventas Lamborghini

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "  SISTEMA DE VENTAS LAMBORGHINI" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

# Obtener el directorio del script
$scriptPath = Split-Path -Parent -Path $MyInvocation.MyCommand.Definition
Set-Location $scriptPath

# Crear directorio bin si no existe
if (-not (Test-Path "bin")) {
    New-Item -ItemType Directory -Name "bin" | Out-Null
}

Write-Host "[1/3] Compilando archivos..." -ForegroundColor Yellow
Write-Host ""

# Obtener todos los archivos Java recursivamente
$allJavaFiles = Get-ChildItem -Path "src" -Filter "*.java" -Recurse

if ($allJavaFiles.Count -eq 0) {
    Write-Host "ERROR: No se encontraron archivos Java en src/" -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}

# Compilar todos los archivos - pasar como array para evitar problemas con espacios
& javac -d bin -encoding UTF-8 @($allJavaFiles.FullName)

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: La compilacion fallo." -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}

Write-Host ""
Write-Host "[2/3] Compilacion exitosa!" -ForegroundColor Green
Write-Host ""
Write-Host "[3/3] Ejecutando programa..." -ForegroundColor Yellow
Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

# Ejecutar el programa
java -cp bin edudivanarojas.actividad1.Main

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: Fallo durante la ejecucion." -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}
Write-Host ""

# Ejecutar el programa
& java -cp "$outputDir" edudivanarojas.actividad1.Main

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: Fallo durante la ejecucion." -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}

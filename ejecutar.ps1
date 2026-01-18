# Script para compilar y ejecutar el programa en PowerShell

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "  COMPILADOR - LAMBORGHINI DEALER" -ForegroundColor Cyan
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

Push-Location "src"

# Compilar todos los archivos
$files = @(
    "edu/divana/rojas/Main.java",
    "edu/divana/rojas/model/Auto.java",
    "edu/divana/rojas/model/Cliente.java", 
    "edu/divana/rojas/model/Venta.java",
    "edu/divana/rojas/repository/AutoRepository.java",
    "edu/divana/rojas/repository/VentaRepository.java",
    "edu/divana/rojas/process/ventas/VentaProcess.java",
    "edu/divana/rojas/process/reportes/ReporteVentasProcess.java",
    "edu/divana/rojas/ui/CLI.java",
    "edu/divana/rojas/utils/FechaUtil.java"
)

$compilationCommand = "javac -d ../bin -encoding UTF-8 $($files -join ' ')"
Invoke-Expression $compilationCommand

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: La compilacion fallo." -ForegroundColor Red
    Pop-Location
    Read-Host "Presione Enter para salir"
    exit 1
}

Pop-Location

Write-Host ""
Write-Host "[2/3] Compilacion exitosa!" -ForegroundColor Green
Write-Host ""
Write-Host "[3/3] Ejecutando programa..." -ForegroundColor Yellow
Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

# Ejecutar el programa
java -cp bin edu.divana.rojas.Main

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: Fallo durante la ejecucion." -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}

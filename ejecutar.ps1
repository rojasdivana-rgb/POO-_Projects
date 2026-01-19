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
    "edu/carlos/castillo/actividad1/Main.java",
    "edu/carlos/castillo/actividad1/model/Auto.java",
    "edu/carlos/castillo/actividad1/model/Cliente.java", 
    "edu/carlos/castillo/actividad1/model/Venta.java",
    "edu/carlos/castillo/actividad1/repository/AutoRepository.java",
    "edu/carlos/castillo/actividad1/repository/VentaRepository.java",
    "edu/carlos/castillo/actividad1/process/ventas/VentaProcess.java",
    "edu/carlos/castillo/actividad1/process/reportes/ReporteVentasProcess.java",
    "edu/carlos/castillo/actividad1/ui/MainUI.java",
    "edu/carlos/castillo/actividad1/utils/FechaUtil.java"
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
java -cp bin edu.carlos.castillo.actividad1.Main

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "ERROR: Fallo durante la ejecucion." -ForegroundColor Red
    Read-Host "Presione Enter para salir"
    exit 1
}

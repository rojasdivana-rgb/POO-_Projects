#!/bin/bash

# Script para compilar y ejecutar el programa en Linux/Mac

echo "========================================"
echo "  COMPILADOR - LAMBORGHINI DEALER"
echo "========================================"
echo ""

cd "$(dirname "$0")"

# Crear directorio bin si no existe
mkdir -p bin

echo "[1/3] Compilando archivos..."
echo ""

cd src
find . -name "*.java" -print0 | xargs -0 javac -d ../bin -encoding UTF-8

if [ $? -ne 0 ]; then
    echo ""
    echo "ERROR: La compilación falló."
    read -p "Presione Enter para salir"
    exit 1
fi

echo ""
echo "[2/3] Compilación exitosa!"
echo ""

cd ..

echo "[3/3] Ejecutando programa..."
echo ""
echo "========================================"
echo ""

java -cp bin edu.divana.rojas.Main

if [ $? -ne 0 ]; then
    echo ""
    echo "ERROR: Falló durante la ejecución."
    read -p "Presione Enter para salir"
    exit 1
fi

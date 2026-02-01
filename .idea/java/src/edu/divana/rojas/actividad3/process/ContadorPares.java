package edu.divana.rojas.actividad3.process;

import java.util.List;

public class ContadorPares {

    // Método que cuenta cuántos números pares hay en una lista
    public static int contarNumerosPares(List<Integer> numeros) {
        // Si la lista es nula o está vacía, regresamos 0
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }

        int contador = 0; // Variable para llevar la cuenta de pares
        for (Integer num : numeros) { // Recorremos cada número de la lista
            if (num % 2 == 0) { // Verificamos si el número es par
                contador++; // Incrementamos el contador si es par
            }
        }
        return contador; // Devolvemos la cantidad de números pares encontrados
    }
}
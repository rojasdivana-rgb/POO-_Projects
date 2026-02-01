package edu.divana.rojas.actividad3.process;

import java.util.List;

public class ContadorPares {

    public static int contarNumerosPares(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }

        int contador = 0;
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }}

package edu.divana.rojas.actividad3.process;

public class ContadorVocales {
    public static int contarVocales(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        int contador = 0;
        String minus = texto.toLowerCase();

        for (char c : minus.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }
}

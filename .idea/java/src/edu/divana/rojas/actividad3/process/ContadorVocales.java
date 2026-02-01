package edu.divana.rojas.actividad3.process;

public class ContadorVocales {

    // Método que cuenta cuántas vocales hay en un texto
    public static int contarVocales(String texto) {
        // Si el texto es nulo o vacío, regresamos 0
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        int contador = 0; // Variable para llevar la cuenta de vocales
        String minus = texto.toLowerCase(); // Convertimos todo a minúsculas

        // Recorremos cada carácter del texto
        for (char c : minus.toCharArray()) {
            // Si el carácter está dentro de "aeiou", es vocal
            if ("aeiou".indexOf(c) != -1) {
                contador++; // Incrementamos el contador
            }
        }

        return contador; // Devolvemos la cantidad de vocales encontradas
    }
}
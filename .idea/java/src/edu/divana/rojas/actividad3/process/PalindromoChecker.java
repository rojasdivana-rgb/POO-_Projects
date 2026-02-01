package edu.divana.rojas.actividad3.process;

public class PalindromoChecker {

    // Método que verifica si un texto es palíndromo ignorando mayúsculas
    public static boolean esPalindromoIgnorandoMayusculas(String texto) {
        // Si el texto es nulo, no puede ser palíndromo
        if (texto == null) return false;

        // Convertimos todo a minúsculas para ignorar diferencias de mayúsculas
        texto = texto.toLowerCase();

        int i = 0;                  // Índice inicial
        int j = texto.length() - 1; // Índice final

        // Comparamos caracteres desde los extremos hacia el centro
        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false; // Si hay diferencia, no es palíndromo
            }
            i++; // Avanzamos desde el inicio
            j--; // Retrocedemos desde el final
        }

        // Si todas las comparaciones fueron iguales, es palíndromo
        return true;
    }
}
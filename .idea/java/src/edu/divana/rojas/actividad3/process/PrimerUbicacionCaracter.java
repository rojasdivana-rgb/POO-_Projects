package edu.divana.rojas.actividad3.process;

public class PrimerUbicacionCaracter {

    // Método que devuelve la primera posición de un carácter en un texto
    public static int primeraPosicionDeCaracter(String texto, char caracter) {
        // Si el texto es nulo, devolvemos -1
        if (texto == null) {
            return -1;
        }

        int posicion = 0; // Índice inicial
        // Recorremos el texto carácter por carácter
        while (posicion < texto.length()) {
            // Si encontramos el carácter buscado, devolvemos su posición
            if (texto.charAt(posicion) == caracter) {
                return posicion;
            }
            posicion++; // Avanzamos al siguiente índice
        }

        // Si no se encontró el carácter, devolvemos -1
        return -1;
    }
}
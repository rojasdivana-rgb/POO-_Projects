package edu.divana.rojas.actividad3.process;

public class PrimerUbicacionCaracter {
    public static int primeraPosicionDeCaracter(String texto, char caracter) {
        if (texto == null) {
            return -1;
        }

        int posicion = 0;
        while (posicion < texto.length()) {
            if (texto.charAt(posicion) == caracter) {
                return posicion;
            }
            posicion++;
        }

        return -1;
    }
}

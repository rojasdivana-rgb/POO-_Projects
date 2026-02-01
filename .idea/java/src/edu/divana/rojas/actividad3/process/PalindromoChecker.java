package edu.divana.rojas.actividad3.process;

public class PalindromoChecker {
    public static boolean esPalindromoIgnorandoMayusculas(String texto) {
        if (texto == null) return false;

        texto = texto.toLowerCase();

        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }}

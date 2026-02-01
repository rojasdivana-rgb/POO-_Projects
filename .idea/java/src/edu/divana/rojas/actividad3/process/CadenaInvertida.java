package edu.divana.rojas.actividad3.process;

public class CadenaInvertida {
    //Devuelve el String invertido carácter por carácter.
     //No utiliza ningún método reverse().
     //@param texto cadena a invertir
     //@return la cadena invertida

    public static String invertir(String texto) {
        if (texto == null) {
            return null;           // o "" según convención del ejercicio
        }

        if (texto.isEmpty() || texto.length() == 1) {
            return texto;
        }

        StringBuilder resultado = new StringBuilder();

        // Recorremos desde el final hacia el principio
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }
}

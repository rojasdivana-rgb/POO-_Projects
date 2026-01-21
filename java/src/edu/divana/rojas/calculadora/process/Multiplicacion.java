package edu.divana.rojas.calculadora.process;

/**
 * Clase que realiza la multiplicación mediante sumas sucesivas.
 */
public class Multiplicacion {
    /**
     * Calcula el producto de dos números usando únicamente la clase Suma.
     * @param n1 Multiplicando.
     * @param n2 Multiplicador (debe ser entero para el bucle).
     * @return El producto total.
     */
    public static double realizarOperacion(double n1, double n2) {
        double resultado = 0;
        for (int i = 0; i < n2; i++) {
            resultado = Suma.realizarOperacion(resultado, n1);
        }
        return resultado;
    }
}

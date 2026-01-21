package edu.divana.rojas.calculadora.process;

/**
 * Clase que realiza la división mediante restas sucesivas.
 */
public class Division {
    /**
     * Calcula el cociente de una división entera.
     *
     * @param n1 Dividendo.
     * @param n2 Divisor.
     * @return Cantidad de veces que n2 cabe en n1.
     */
    public static double realizarOperacion(double n1, double n2) {
        double cociente = 0;
        double residuo = n1;
        while (residuo >= n2) {
            residuo = Resta.realizarOperacion(residuo, n2);
            cociente = Suma.realizarOperacion(cociente, 1);
        }
        return cociente;
    }
}
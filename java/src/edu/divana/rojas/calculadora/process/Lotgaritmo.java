package edu.divana.rojas.calculadora.process;

/**
 * Clase para calcular el logaritmo mediante multiplicaciones sucesivas.
 */
public class Lotgaritmo {
    /**
     * Calcula el logaritmo entero.
     * @param base Base del logaritmo.
     * @param argumento Número al que se le aplica el logaritmo.
     * @return El exponente al que hay que elevar la base para llegar al argumento.
     */
    public static double realizarOperacion(double base, double argumento) {
        double conteo = 0;
        double acumulado = 1;
        while (acumulado < argumento) {
            acumulado = Multiplicacion.realizarOperacion(acumulado, base);
            conteo = Suma.realizarOperacion(conteo, 1);
        }
        return conteo;
    }
}
package edu.divana.rojas.calculadora.process;

/**
 * Clase que realiza la potencia mediante multiplicaciones sucesivas.
 */
public class Potencia {
    /**
     * Calcula la potencia de un número.
     * @param base Base.
     * @param exponente Exponente.
     * @return El resultado de base^exponente.
     */
    public static double realizarOperacion(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}


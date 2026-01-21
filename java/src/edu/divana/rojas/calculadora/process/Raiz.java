package edu.divana.rojas.calculadora.process;

/**
 * Clase para calcular la raíz cuadrada por aproximación entera.
 */
public class Raiz {
    /**
     * Encuentra la raíz cuadrada (índice 2) de un número.
     * @param indice El grado de la raíz (ej. 2 para cuadrada).
     * @param radicando El número al que se le busca la raíz.
     * @return La raíz positiva más cercana (entera).
     */
    public static double realizarOperacion(double indice, double radicando) {
        double aproximacion = 0;
        while (Potencia.realizarOperacion(aproximacion, indice) <= radicando) {
            aproximacion = Suma.realizarOperacion(aproximacion, 1);
        }
        return Resta.realizarOperacion(aproximacion, 1);
    }
}


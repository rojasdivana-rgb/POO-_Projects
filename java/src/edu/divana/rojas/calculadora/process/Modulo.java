package edu.divana.rojas.calculadora.process;

/**
 * Clase que realiza la operación de módulo (residuo).
 */
public class Modulo {
    /**
     * Calcula el residuo de la división de dos números.
     * @param n1 Dividendo.
     * @param n2 Divisor.
     * @return El residuo de n1 / n2.
     */
    public static double realizarOperacion(double n1, double n2) {
        double cociente = Division.realizarOperacion(n1, n2);
        double producto = Multiplicacion.realizarOperacion(cociente, n2);
        return Resta.realizarOperacion(n1, producto);
    }
}


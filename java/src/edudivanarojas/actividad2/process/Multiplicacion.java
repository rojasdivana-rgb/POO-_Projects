package edudivanarojas.actividad2.process;

/**
 * Clase que realiza la operación de multiplicación aritmética.
 * Implementa la multiplicación usando suma repetida.
 */
public class Multiplicacion {
    /**
     * Realiza la multiplicación de dos números usando suma repetida.
     * No utiliza el operador * directamente, sino que suma el multiplicando
     * varias veces.
     *
     * @param a el multiplicando
     * @param b el multiplicador
     * @return el producto de a × b
     */
    // Multiplicación usando suma repetida
    public static double realizarOperacion(double a, double b) {
        // Convertir a enteros para facilitar la multiplicación
        long multiplicando = (long) a;
        long multiplicador = (long) b;
        double resultado = 0;

        // Manejar casos negativos
        boolean esNegativo = (multiplicando < 0) ^ (multiplicador < 0);
        multiplicando = Math.abs(multiplicando);
        multiplicador = Math.abs(multiplicador);

        // Usar el menor para realizar menos iteraciones
        if (multiplicador < multiplicando) {
            long temp = multiplicador;
            multiplicador = multiplicando;
            multiplicando = temp;
        }

        // Sumar 'multiplicando' veces el multiplicador
        for (long i = 0; i < multiplicador; i++) {
            resultado = Suma.realizarOperacion(resultado, multiplicando);
        }

        return esNegativo ? Resta.realizarOperacion(0, resultado) : resultado;
    }
}

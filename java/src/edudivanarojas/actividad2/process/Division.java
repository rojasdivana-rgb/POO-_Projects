package edudivanarojas.actividad2.process;

/**
 * Clase que realiza la operación de división aritmética.
 * Implementa la división usando resta repetida.
 */
public class Division {
    /**
     * Realiza la división de dos números usando resta repetida.
     * No utiliza el operador / directamente, sino que resta el divisor
     * del dividendo repetidamente hasta que sea menor que el divisor.
     *
     * @param dividendo el dividendo (numerador)
     * @param divisor el divisor (denominador)
     * @return el cociente de dividendo ÷ divisor
     * @throws ArithmeticException si el divisor es cero
     */
    // División usando resta repetida
    public static double realizarOperacion(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        double resultado = 0;
        boolean esNegativo = (dividendo < 0) ^ (divisor < 0);
        dividendo = Math.abs(dividendo);
        divisor = Math.abs(divisor);

        // Restar el divisor del dividendo hasta que sea menor que el divisor
        while (dividendo >= divisor) {
            dividendo = Resta.realizarOperacion(dividendo, divisor);
            resultado = Suma.realizarOperacion(resultado, 1);
        }

        return esNegativo ? Resta.realizarOperacion(0, resultado) : resultado;
    }
}

package edudivanarojas.actividad2.process;

/**
 * Clase que realiza la operación de módulo (residuo de la división).
 * Implementa el módulo usando división y multiplicación.
 */
public class Modulo {
    /**
     * Calcula el residuo (módulo) de la división de dos números.
     * Formula: residuo = dividendo - (divisor × (dividendo ÷ divisor))
     *
     * @param dividendo el dividendo
     * @param divisor el divisor
     * @return el residuo de la división
     * @throws ArithmeticException si el divisor es cero
     */
    // Módulo usando división y multiplicación
    public static double realizarOperacion(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede calcular módulo de cero");
        }

        // residuo = dividendo - (divisor * (dividendo / divisor))
        double cociente = Division.realizarOperacion(dividendo, divisor);
        double producto = Multiplicacion.realizarOperacion(divisor, cociente);
        double residuo = Resta.realizarOperacion(dividendo, producto);

        return residuo;
    }
}

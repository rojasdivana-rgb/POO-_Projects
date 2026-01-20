package edudivanarojas.actividad2.process;

/**
 * Clase que realiza la operación de potencia (exponenciación).
 * Implementa la potencia usando multiplicación repetida.
 */
public class Potencia {
    /**
     * Calcula la potencia de un número elevado a un exponente.
     * Para exponentes positivos, multiplica la base repetidamente.
     * Para exponentes negativos, calcula 1 / (base^n).
     *
     * @param base el número base
     * @param exponente la potencia a la que se eleva la base
     * @return el resultado de base elevado a exponente
     */
    // Potencia usando multiplicación repetida
    public static double realizarOperacion(double base, double exponente) {
        long exp = (long) exponente;

        // Casos especiales
        if (exp == 0) {
            return 1;
        }

        if (exp < 0) {
            // Para exponentes negativos: base^(-n) = 1 / (base^n)
            double potenciaPositiva = realizarOperacion(base, Resta.realizarOperacion(0, exp));
            return Division.realizarOperacion(1, potenciaPositiva);
        }

        double resultado = 1;
        for (long i = 0; i < exp; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }

        return resultado;
    }
}

package edudivanarojas.actividad2.process;

/**
 * Clase que calcula el logaritmo de un número en una base específica.
 * Implementa el logaritmo usando división repetida.
 * Calcula: log_base(x) = y donde base^y = x
 */
public class Logaritmo {
    /**
     * Calcula el logaritmo de un número en una base específica.
     * Divide x por la base repetidamente hasta que el valor sea menor que la base.
     *
     * @param base la base del logaritmo (debe ser mayor a 0 y diferente de 1)
     * @param x el número del cual se calcula el logaritmo (debe ser mayor a 0)
     * @return el logaritmo de x en la base especificada
     * @throws ArithmeticException si base es menor o igual a 0, base es 1, o x es menor o igual a 0
     */
    // Logaritmo: log_base(x) = y donde base^y = x
    // Se calcula dividiendo x por la base repetidamente hasta obtener un valor cercano a 1
    public static double realizarOperacion(double base, double x) {
        if (base <= 0 || base == 1 || x <= 0) {
            throw new ArithmeticException("Base debe ser > 0 y != 1, x debe ser > 0");
        }

        double resultado = 0;
        double valor = x;

        // Dividir por la base hasta que el valor sea menor que la base
        while (valor >= base) {
            valor = Division.realizarOperacion(valor, base);
            resultado = Suma.realizarOperacion(resultado, 1);
        }

        // Para mayor precisión, se podría añadir la parte fraccionaria
        // pero para este ejercicio solo retornamos la parte entera
        return resultado;
    }
}

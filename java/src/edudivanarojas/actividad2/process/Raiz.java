package edudivanarojas.actividad2.process;

/**
 * Clase que calcula la raíz enésima de un número.
 * Implementa el cálculo usando búsqueda binaria.
 */
public class Raiz {
    /**
     * Calcula la raíz enésima de un número usando búsqueda binaria.
     * Por ejemplo: raíz cuadrada (índice=2), raíz cúbica (índice=3), etc.
     *
     * @param indice el índice de la raíz (2 para cuadrada, 3 para cúbica, etc.)
     * @param x el número del cual se calcula la raíz
     * @return la raíz enésima del número x (valor positivo)
     * @throws ArithmeticException si se intenta calcular raíz par de número negativo
     */
    // Raíz usando búsqueda binaria (iterativa)
    // indice es el índice de la raíz (2 para cuadrada, 3 para cúbica, etc.)
    // x es el número del cual se calcula la raíz
    public static double realizarOperacion(double indice, double x) {
        if (x < 0 && indice % 2 == 0) {
            throw new ArithmeticException("No se puede calcular raíz par de número negativo");
        }

        if (x == 0) {
            return 0;
        }

        boolean esNegativo = x < 0;
        x = Math.abs(x);

        // Búsqueda binaria para encontrar la raíz
        double bajo = 0;
        double alto = x;
        double resultado = 0;

        // Iteraciones para mayor precisión
        for (int i = 0; i < 100; i++) {
            resultado = Division.realizarOperacion(Suma.realizarOperacion(bajo, alto), 2);
            double potencia = Potencia.realizarOperacion(resultado, indice);

            if (potencia < x) {
                bajo = resultado;
            } else if (potencia > x) {
                alto = resultado;
            } else {
                break;
            }
        }

        return esNegativo ? Resta.realizarOperacion(0, resultado) : resultado;
    }
}

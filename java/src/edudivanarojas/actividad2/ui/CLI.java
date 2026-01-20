package edudivanarojas.actividad2.ui;

import java.util.Scanner;

import edudivanarojas.actividad2.process.Division;
import edudivanarojas.actividad2.process.Logaritmo;
import edudivanarojas.actividad2.process.Modulo;
import edudivanarojas.actividad2.process.Multiplicacion;
import edudivanarojas.actividad2.process.Potencia;
import edudivanarojas.actividad2.process.Raiz;
import edudivanarojas.actividad2.process.Resta;
import edudivanarojas.actividad2.process.Suma;

/**
 * Clase que implementa la interfaz de línea de comandos (CLI) para la calculadora.
 * Proporciona un menú interactivo al usuario para realizar operaciones aritméticas.
 */
public class CLI {
    private boolean continuar;

    /**
     * Constructor de la clase CLI.
     * Inicializa el estado de la aplicación para que continúe mostrado el menú.
     */
    public CLI() {
        this.continuar = true;
    }

    /**
     * Muestra el menú principal y gestiona la interacción del usuario.
     * Utiliza try-with-resources para garantizar que el Scanner se cierre automáticamente.
     * Permite al usuario seleccionar una operación del menú y ejecutarla repetidamente.
     */
    public void mostrarMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                System.out.println("\n======== CALCULADORA ARITMÉTICA ========");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Módulo (Residuo)");
                System.out.println("6. Potencia");
                System.out.println("7. Raíz");
                System.out.println("8. Logaritmo");
                System.out.println("9. Salir");
                System.out.print("\nSelecciona una operación (1-9): ");

                int opcion = leerEntero(scanner);

                switch (opcion) {
                    case 1 -> realizarSuma(scanner);
                    case 2 -> realizarResta(scanner);
                    case 3 -> realizarMultiplicacion(scanner);
                    case 4 -> realizarDivision(scanner);
                    case 5 -> realizarModulo(scanner);
                    case 6 -> realizarPotencia(scanner);
                    case 7 -> realizarRaiz(scanner);
                    case 8 -> realizarLogaritmo(scanner);
                    case 9 -> {
                        System.out.println("\n¡Gracias por usar la calculadora!");
                        continuar = false;
                    }
                    default -> System.out.println("Opción inválida. Intenta nuevamente.");
                }
            }
        }
    }

    private void realizarSuma(Scanner scanner) {
        /**
         * Realiza la operación de suma solicitando dos números al usuario.
         * @param scanner el Scanner para leer entrada del usuario
         */
        System.out.print("Ingresa el primer número: ");
        double a = leerDouble(scanner);
        System.out.print("Ingresa el segundo número: ");
        double b = leerDouble(scanner);
        double resultado = Suma.realizarOperacion(a, b);
        System.out.println("\nResultado: " + a + " + " + b + " = " + resultado);
    }

    private void realizarResta(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        double a = leerDouble(scanner);
        System.out.print("Ingresa el segundo número: ");
        double b = leerDouble(scanner);
        double resultado = Resta.realizarOperacion(a, b);
        System.out.println("\nResultado: " + a + " - " + b + " = " + resultado);
    }

    private void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        double a = leerDouble(scanner);
        System.out.print("Ingresa el segundo número: ");
        double b = leerDouble(scanner);
        double resultado = Multiplicacion.realizarOperacion(a, b);
        System.out.println("\nResultado: " + a + " × " + b + " = " + resultado);
    }

    private void realizarDivision(Scanner scanner) {
        System.out.print("Ingresa el dividendo: ");
        double dividendo = leerDouble(scanner);
        System.out.print("Ingresa el divisor: ");
        double divisor = leerDouble(scanner);
        if (divisor == 0) {
            System.out.println("\nError: No se puede dividir entre cero.");
            return;
        }
        double resultado = Division.realizarOperacion(dividendo, divisor);
        System.out.println("\nResultado: " + dividendo + " ÷ " + divisor + " = " + resultado);
    }

    private void realizarModulo(Scanner scanner) {
        System.out.print("Ingresa el dividendo: ");
        double dividendo = leerDouble(scanner);
        System.out.print("Ingresa el divisor: ");
        double divisor = leerDouble(scanner);
        if (divisor == 0) {
            System.out.println("\nError: No se puede calcular módulo de cero.");
            return;
        }
        double resultado = Modulo.realizarOperacion(dividendo, divisor);
        System.out.println("\nResultado: " + dividendo + " mod " + divisor + " = " + resultado);
    }

    private void realizarPotencia(Scanner scanner) {
        System.out.print("Ingresa la base: ");
        double base = leerDouble(scanner);
        System.out.print("Ingresa el exponente: ");
        double exponente = leerDouble(scanner);
        double resultado = Potencia.realizarOperacion(base, exponente);
        System.out.println("\nResultado: " + base + "^" + exponente + " = " + resultado);
    }

    private void realizarRaiz(Scanner scanner) {
        System.out.print("Ingresa el índice de la raíz (2=cuadrada, 3=cúbica, etc.): ");
        double indice = leerDouble(scanner);
        System.out.print("Ingresa el número: ");
        double numero = leerDouble(scanner);
        try {
            double resultado = Raiz.realizarOperacion(indice, numero);
            System.out.println("\nResultado: Raíz " + (int)indice + " de " + numero + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    private void realizarLogaritmo(Scanner scanner) {
        System.out.print("Ingresa la base del logaritmo: ");
        double base = leerDouble(scanner);
        System.out.print("Ingresa el número: ");
        double numero = leerDouble(scanner);
        try {
            double resultado = Logaritmo.realizarOperacion(base, numero);
            System.out.println("\nResultado: log_" + base + "(" + numero + ") = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    /**
     * Lee un número decimal del usuario.
     * Valida la entrada y solicita reintentar si es inválida.
     * @param scanner el Scanner para leer entrada del usuario
     * @return el número decimal leído
     */
    private double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Entrada inválida. Intenta nuevamente: ");
        }
        return scanner.nextDouble();
    }

    /**
     * Lee un número entero del usuario.
     * Valida la entrada y solicita reintentar si es inválida.
     * @param scanner el Scanner para leer entrada del usuario
     * @return el número entero leído
     */
    private int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Entrada inválida. Intenta nuevamente: ");
        }
        return scanner.nextInt();
    }
}

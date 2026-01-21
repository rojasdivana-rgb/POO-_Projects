package edu.divana.rojas.calculadora.ui;

import java.util.Scanner;
import edu.divana.rojas.calculadora.process.*;

/**
 * Interfaz de línea de comandos para interactuar con el usuario.
 */
public class CLI {
    /**
     * Despliega el menú en consola, captura los datos del usuario
     * y ejecuta las operaciones llamando a las clases del paquete process.
     */
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA JAVA ---");
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
            System.out.println("5. Módulo\n6. Potencia\n7. Logaritmo\n8. Raíz");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print("Primer número: ");
                double n1 = scanner.nextDouble();
                System.out.print("Segundo número: ");
                double n2 = scanner.nextDouble();

                double res = 0;
                switch(opcion) {
                    case 1: res = Suma.realizarOperacion(n1, n2); break;
                    case 2: res = Resta.realizarOperacion(n1, n2); break;
                    case 3: res = Multiplicacion.realizarOperacion(n1, n2); break;
                    case 4: res = Division.realizarOperacion(n1, n2); break;
                    case 5: res = Modulo.realizarOperacion(n1, n2); break;
                    case 6: res = Potencia.realizarOperacion(n1, n2); break;
                    case 7: res = Logaritmo.realizarOperacion(n1, n2); break;
                    case 8: res = Raiz.realizarOperacion(n1, n2); break;
                }
                System.out.println("Resultado: " + res);
            }
        } while (opcion != 0);
        scanner.close();
    }
}

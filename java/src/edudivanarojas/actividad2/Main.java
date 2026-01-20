package edudivanarojas.actividad2;

import edudivanarojas.actividad2.ui.CLI;

/**
 * Clase principal de la aplicación Calculadora Aritmética.
 * Inicia la interfaz de línea de comandos (CLI) para interactuar con el usuario.
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia de CLI y muestra el menú principal.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.mostrarMenu();
    }
}

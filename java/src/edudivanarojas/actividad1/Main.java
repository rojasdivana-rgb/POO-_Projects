package edudivanarojas.actividad1;

import edudivanarojas.actividad1.ui.CLI;

/**
 * Clase principal de la aplicación del Sistema de Ventas Lamborghini.
 * Inicia la interfaz de línea de comandos (CLI) para la gestión de ventas de
 * vehículos.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * Crea una instancia de CLI e inicia el menú principal.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.iniciar();
    }
}

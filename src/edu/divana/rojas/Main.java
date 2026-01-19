package edu.divana.rojas;

import edu.divana.rojas.ui.CLI;

/**
 * Clase principal del sistema de ventas de Lamborghini.
 * Punto de entrada de la aplicación que inicia la interfaz CLI.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class Main {
    /**
     * Método main que inicia la aplicación.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CLI interfaz = new CLI();
        interfaz.iniciar();
    }
}

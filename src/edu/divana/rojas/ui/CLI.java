package edu.divana.rojas.ui;

import edu.divana.rojas.model.Auto;
import edu.divana.rojas.model.Cliente;
import edu.divana.rojas.model.Venta;
import edu.divana.rojas.process.reportes.ReporteVentasProcess;
import edu.divana.rojas.process.ventas.VentaProcess;
import edu.divana.rojas.repository.AutoRepository;
import edu.divana.rojas.repository.VentaRepository;
import java.util.List;
import java.util.Scanner;

/**
 * Interfaz de línea de comandos (CLI) para el sistema de ventas de Lamborghini.
 * Gestiona la interacción del usuario con el sistema, incluyendo:
 * - Procesamiento de nuevas ventas
 * - Visualización de catálogo de vehículos
 * - Generación de reportes de ventas
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class CLI {
    /** Scanner para leer entrada del usuario */
    private final Scanner scanner;
    /** Repositorio de vehículos disponibles */
    private final AutoRepository autoRepository;
    /** Repositorio de ventas realizadas */
    private final VentaRepository ventaRepository;
    /** Proceso para gestionar ventas */
    private final VentaProcess ventaProcess;
    /** Proceso para generar reportes de ventas */
    private final ReporteVentasProcess reporteProcess;

    /**
     * Constructor de la interfaz CLI.
     * Inicializa los componentes necesarios para la gestión del sistema.
     */
    public CLI() {
        this.scanner = new Scanner(System.in);
        this.autoRepository = new AutoRepository();
        this.ventaRepository = new VentaRepository();
        this.ventaProcess = new VentaProcess(ventaRepository);
        this.reporteProcess = new ReporteVentasProcess();
    }

    /**
     * Inicia el ciclo principal de la interfaz CLI.
     * Muestra el menú principal y procesa las opciones del usuario.
     */
    public void iniciar() {
        boolean salir = false;
        try (scanner) {
            while (!salir) {
                mostrarMenuPrincipal();
                int opcion = leerOpcion();

                switch (opcion) {
                    case 1 -> procesarNuevaVenta();
                    case 2 -> mostrarTodasLasVentas();
                    case 3 -> mostrarCatalogo();
                    case 4 -> {
                        salir = true;
                        System.out.println("¡Gracias por usar el sistema!");
                    }
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            }
        }
    }

    /**
     * Muestra el menú principal de opciones del sistema.
     */
    private void mostrarMenuPrincipal() {
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE VENTAS LAMBORGHINI     ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║ 1. Comprar                            ║");
        System.out.println("║ 2. Ver Todas las Ventas               ║");
        System.out.println("║ 3. Ver Catálogo de Vehículos          ║");
        System.out.println("║ 4. Salir                              ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Procesa una nueva venta.
     * Captura datos del cliente, permite seleccionar vehículos y genera el ticket.
     */
    private void procesarNuevaVenta() {
        System.out.println("\n--- NUEVA VENTA ---");
        Cliente cliente = capturarDatosCliente();

        ventaProcess.iniciarVenta(cliente);

        boolean agregarMas = true;
        while (agregarMas) {
            mostrarCatalogo();
            System.out.print("Ingrese el ID del vehículo a agregar (0 para finalizar): ");
            int idAuto = leerNumero();

            if (idAuto == 0) {
                agregarMas = false;
            } else {
                Auto auto = autoRepository.obtenerPorId(idAuto);
                if (auto != null) {
                    ventaProcess.agregarAutoAVenta(auto);
                    System.out.println("✓ Vehículo agregado: " + auto.getModelo());
                } else {
                    System.out.println("✗ Vehículo no encontrado.");
                }
            }
        }

        Venta ventaActual = ventaProcess.obtenerVentaActual();
        if (ventaActual != null && !ventaActual.getAutos().isEmpty()) {
            reporteProcess.generarTicketVenta(ventaActual);
            ventaProcess.finalizarVenta();
            System.out.println("✓ Venta guardada exitosamente.");
        } else {
            System.out.println("✗ No se agregaron vehículos a la venta.");
        }
    }

    /**
     * Captura los datos del cliente desde la entrada del usuario.
     *
     * @return objeto Cliente con los datos ingresados
     */
    private Cliente capturarDatosCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Cliente(nombre, apellido, telefono, email, "");
    }

    /**
     * Muestra el catálogo de vehículos disponibles en formato tabla.
     */
    private void mostrarCatalogo() {
        List<Auto> autos = autoRepository.obtenerTodos();
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ ID │ Modelo               │ Año  │ Motor        │ Potencia │ Velocidad │ Precio      │");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");

        for (Auto auto : autos) {
            System.out.printf("║ %-2d │ %-20s │ %-4d │ %-12s │ %-8s │ %-9d │ $%-10.2f │\n",
                auto.getId(),
                auto.getModelo().substring(0, Math.min(20, auto.getModelo().length())),
                auto.getAño(),
                auto.getMotor().substring(0, Math.min(12, auto.getMotor().length())),
                auto.getPotencia(),
                auto.getVelocidadMax(),
                auto.getPrecio());
        }

        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    /**
     * Muestra todas las ventas realizadas con su información detallada.
     */
    private void mostrarTodasLasVentas() {
        List<Venta> ventas = ventaRepository.obtenerTodas();
        reporteProcess.generarReporteVentas(ventas);
    }

    /**
     * Lee una opción de menú desde la entrada del usuario.
     *
     * @return número de opción seleccionada, o -1 si hay error
     */
    private int leerOpcion() {
        try {
            int opcion = scanner.nextInt();
            scanner.nextLine();
            return opcion;
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    /**
     * Lee un número desde la entrada del usuario.
     *
     * @return número ingresado, o -1 si hay error
     */
    private int leerNumero() {
        try {
            int numero = scanner.nextInt();
            scanner.nextLine();
            return numero;
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }
}

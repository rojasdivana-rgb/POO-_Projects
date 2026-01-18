package edu.divana.rojas.ui;

import java.util.List;
import java.util.Scanner;

import edu.divana.rojas.model.Auto;
import edu.divana.rojas.model.Cliente;
import edu.divana.rojas.model.Venta;
import edu.divana.rojas.process.reportes.ReporteVentasProcess;
import edu.divana.rojas.process.ventas.VentaProcess;
import edu.divana.rojas.repository.AutoRepository;
import edu.divana.rojas.repository.VentaRepository;

public class CLI {
    private final Scanner scanner;
    private final AutoRepository autoRepository;
    private final VentaRepository ventaRepository;
    private final VentaProcess ventaProcess;
    private final ReporteVentasProcess reporteProcess;

    public CLI() {
        this.scanner = new Scanner(System.in);
        this.autoRepository = new AutoRepository();
        this.ventaRepository = new VentaRepository();
        this.ventaProcess = new VentaProcess(ventaRepository);
        this.reporteProcess = new ReporteVentasProcess();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenuPrincipal();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    procesarNuevaVenta();
                    break;
                case 2:
                    mostrarTodasLasVentas();
                    break;
                case 3:
                    mostrarCatalogo();
                    break;
                case 4:
                    salir = true;
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

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

    private void mostrarTodasLasVentas() {
        List<Venta> ventas = ventaRepository.obtenerTodas();
        reporteProcess.generarReporteVentas(ventas);
    }

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

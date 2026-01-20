package edudivanarojas.actividad1.ui;

import java.util.List;
import java.util.Scanner;

import edudivanarojas.actividad1.model.Auto;
import edudivanarojas.actividad1.model.Cliente;
import edudivanarojas.actividad1.model.Venta;
import edudivanarojas.actividad1.process.reportes.ReporteVentasProcess;
import edudivanarojas.actividad1.process.ventas.VentaProcess;
import edudivanarojas.actividad1.repository.AutoRepository;
import edudivanarojas.actividad1.repository.VentaRepository;

/**
 * Clase que implementa la interfaz de línea de comandos (CLI) del sistema de
 * ventas.
 * Gestiona la interacción con el usuario y coordina las operaciones de compra y
 * consulta.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class CLI {
    private final Scanner scanner;
    private final AutoRepository autoRepository;
    private final VentaRepository ventaRepository;
    private final VentaProcess ventaProcess;
    private final ReporteVentasProcess reporteProcess;

    /**
     * Constructor que inicializa la CLI con sus dependencias.
     * Crea instancias de los repositorios y procesos necesarios.
     */
    public CLI() {
        this.scanner = new Scanner(System.in);
        this.autoRepository = new AutoRepository();
        this.ventaRepository = new VentaRepository();
        this.ventaProcess = new VentaProcess(ventaRepository);
        this.reporteProcess = new ReporteVentasProcess();
    }

    /**
     * Inicia la ejecución del menú principal.
     * Mantiene un bucle activo hasta que el usuario elige salir.
     */
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
                    System.out.println("✓ ¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("✗ Opción no válida. Intente nuevamente.");
            }
        }
    }

    /**
     * Muestra el menú principal con las opciones disponibles.
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
     * Captura datos del cliente, permite seleccionar vehículos y finaliza la venta.
     */
    private void procesarNuevaVenta() {
        System.out.println("\n✓ --- NUEVA VENTA ---");
        Cliente cliente = capturarDatosCliente();

        ventaProcess.iniciarVenta(cliente);

        boolean agregarMas = true;
        while (agregarMas) {
            System.out.println();
            mostrarCatalogo();
            System.out.print("Ingrese el ID del vehículo a agregar (0 para finalizar): ");
            int idAuto = leerNumero();

            if (idAuto == 0) {
                agregarMas = false;
            } else if (idAuto > 0) {
                Auto auto = autoRepository.obtenerPorId(idAuto);
                if (auto != null) {
                    ventaProcess.agregarAutoAVenta(auto);
                    System.out.println("✓ Vehículo agregado: " + auto.getModelo());
                } else {
                    System.out.println("✗ Vehículo no encontrado.");
                }
            } else {
                System.out.println("✗ Opción inválida. Ingrese un ID válido.");
            }
        }

        Venta ventaActual = ventaProcess.obtenerVentaActual();
        if (ventaActual != null && !ventaActual.getAutos().isEmpty()) {
            ventaProcess.finalizarVenta();
            List<Venta> ventas = ventaRepository.obtenerTodas();
            if (!ventas.isEmpty()) {
                Venta ventaGuardada = ventas.get(ventas.size() - 1);
                reporteProcess.generarTicketVenta(ventaGuardada);
                System.out.println("✓ Venta guardada exitosamente.");
            }
        } else {
            System.out.println("✗ No se agregaron vehículos a la venta.");
        }
    }

    /**
     * Captura los datos personales del cliente.
     *
     * @return Objeto Cliente con los datos ingresados
     */
    private Cliente capturarDatosCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Cliente(nombre, telefono, email);
    }

    /**
     * Muestra el catálogo completo de vehículos disponibles.
     */
    private void mostrarCatalogo() {
        List<Auto> autos = autoRepository.obtenerTodos();
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      CATÁLOGO DE LAMBORGHINI                              ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════╣");

        for (Auto auto : autos) {
            System.out.printf("║ [%2d] %-18s (%d) - %d HP - $%-12.2f ║\n",
                    auto.getId(),
                    auto.getModelo(),
                    auto.getAño(),
                    auto.getPotenciaHP(),
                    auto.getPrecio());
        }

        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
    }

    /**
     * Muestra todas las ventas registradas en el sistema.
     */
    private void mostrarTodasLasVentas() {
        List<Venta> ventas = ventaRepository.obtenerTodas();
        reporteProcess.generarReporteVentas(ventas);
    }

    /**
     * Lee una opción numérica del usuario.
     * Retorna -1 si la entrada es inválida.
     *
     * @return Número entero ingresado o -1 si hay error
     */
    private int leerOpcion() {
        try {
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                return -1;
            }
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * Lee un número entero del usuario.
     * Retorna -1 si la entrada es inválida.
     *
     * @return Número entero ingresado o -1 si hay error
     */
    private int leerNumero() {
        try {
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                return -1;
            }
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }
}

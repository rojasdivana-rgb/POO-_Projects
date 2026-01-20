package edudivanarojas.actividad1.process.reportes;

import java.util.List;

import edudivanarojas.actividad1.model.Auto;
import edudivanarojas.actividad1.model.Venta;
import edudivanarojas.actividad1.utils.FechaUtil;

/**
 * Clase que gestiona la generación de reportes y tickets de ventas.
 * Proporciona métodos para mostrar información detallada y resumida de las
 * transacciones.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class ReporteVentasProcess {

    /**
     * Genera y muestra un ticket detallado de una venta.
     * Incluye información del cliente, vehículos comprados y total de la venta.
     *
     * @param venta Venta para la cual se generará el ticket
     */
    public void generarTicketVenta(Venta venta) {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                       TICKET DE VENTA LAMBORGHINI                           ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ ID Venta: %-63d ║\n", venta.getIdVenta());
        System.out.printf("║ Cliente: %-66s ║\n", venta.getCliente().getNombre());
        System.out.printf("║ Fecha: %-68s ║\n", FechaUtil.formatearFecha(venta.getFecha()));
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ VEHÍCULOS SELECCIONADOS:                                                    ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");

        List<Auto> autos = venta.getAutos();
        for (Auto auto : autos) {
            System.out.printf("║ ✓ %-18s (%d) - %d HP - $%-12.2f ║\n",
                    auto.getModelo(),
                    auto.getAño(),
                    auto.getPotenciaHP(),
                    auto.getPrecio());
        }

        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ TOTAL:%62s$%.2f ║\n", "", venta.getTotal());
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝\n");
    }

    /**
     * Muestra un resumen breve de una venta específica.
     *
     * @param venta Venta cuya información se mostrará
     */
    public void mostrarResumenVenta(Venta venta) {
        System.out.println("\n--- RESUMEN DE VENTA ---");
        System.out.println("Cliente: " + venta.getCliente().getNombre());
        System.out.println("Cantidad de vehículos: " + venta.getAutos().size());
        System.out.printf("Total: $%.2f\n", venta.getTotal());
        System.out.println("Fecha: " + FechaUtil.formatearFecha(venta.getFecha()));
    }

    /**
     * Genera un reporte con el listado de todas las ventas registradas.
     * Muestra un mensaje si no hay ventas disponibles.
     *
     * @param ventas Lista de todas las ventas a reportar
     */
    public void generarReporteVentas(List<Venta> ventas) {
        if (ventas.isEmpty()) {
            System.out.println("✗ No hay ventas registradas.");
            return;
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    REPORTE DE TODAS LAS VENTAS                   ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");

        for (Venta venta : ventas) {
            System.out.printf("║ ID: %d | Cliente: %-35s$%.2f ║\n",
                    venta.getIdVenta(),
                    venta.getCliente().getNombre().substring(0, Math.min(25, venta.getCliente().getNombre().length())),
                    venta.getTotal());
        }

        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
    }
}

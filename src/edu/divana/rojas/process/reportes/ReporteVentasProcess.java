package edu.divana.rojas.process.reportes;

import edu.divana.rojas.model.Auto;
import edu.divana.rojas.model.Venta;
import edu.divana.rojas.utils.FechaUtil;
import java.util.List;

/**
 * Procesa la generación de reportes y tickets de venta.
 * Crea documentos formateados para mostrar información de ventas individuales y colectivas.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class ReporteVentasProcess {

    /**
     * Genera y muestra el ticket de venta para una venta específica.
     * Incluye información del cliente, vehículos y total.
     * @param venta venta para la cual generar el ticket
     */
    public void generarTicketVenta(Venta venta) {
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     TICKET DE VENTA LAMBORGHINI                  ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ ID Venta: %-55d ║\n", venta.getIdVenta());
        System.out.printf("║ Cliente: %-55s ║\n", venta.getCliente().getNombreCompleto());
        System.out.printf("║ Fecha: %-56s ║\n", FechaUtil.formatoCompleto(venta.getFecha()));
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.println("║ VEHÍCULOS SELECCIONADOS:                                       ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");

        List<Auto> autos = venta.getAutos();
        for (Auto auto : autos) {
            System.out.printf("║ • %s$%.2f            ║\n", auto.getModelo().substring(0, Math.min(40, auto.getModelo().length())), auto.getPrecio());
        }

        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ TOTAL: %-55s$%.2f ║\n", "", venta.getTotal());
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
    }

    /**
     * Muestra un resumen compacto de una venta específica.
     * @param venta venta para la cual mostrar el resumen
     */
    public void mostrarResumenVenta(Venta venta) {
        System.out.println("\n--- RESUMEN DE VENTA ---");
        System.out.println("Cliente: " + venta.getCliente().getNombreCompleto());
        System.out.println("Teléfono: " + venta.getCliente().getTelefono());
        System.out.println("Email: " + venta.getCliente().getEmail());
        System.out.println("Cantidad de vehículos: " + venta.getAutos().size());
        System.out.printf("Total: $%.2f\n", venta.getTotal());
        System.out.println("Fecha: " + FechaUtil.formatoCompleto(venta.getFecha()));
    }

    /**
     * Genera y muestra un reporte completo de todas las ventas.
     * Si no hay ventas, muestra un mensaje indicándolo.
     * @param ventas lista de ventas a reportar
     */
    public void generarReporteVentas(List<Venta> ventas) {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
            return;
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    REPORTE DE TODAS LAS VENTAS                   ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");

        for (Venta venta : ventas) {
            System.out.printf("║ ID: %d | Cliente: %-35s$%.2f ║\n", 
                venta.getIdVenta(), 
                venta.getCliente().getNombreCompleto().substring(0, Math.min(25, venta.getCliente().getNombreCompleto().length())),
                venta.getTotal());
        }

        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
    }
}

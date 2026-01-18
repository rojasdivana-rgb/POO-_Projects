package actividad1.process.reportes;

import java.util.List;

import actividad1.model.Auto;
import actividad1.model.Venta;
import actividad1.utils.FechaUtil;

public class ReporteVentasProcess {

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

    public void mostrarResumenVenta(Venta venta) {
        System.out.println("\n--- RESUMEN DE VENTA ---");
        System.out.println("Cliente: " + venta.getCliente().getNombreCompleto());
        System.out.println("Teléfono: " + venta.getCliente().getTelefono());
        System.out.println("Email: " + venta.getCliente().getEmail());
        System.out.println("Cantidad de vehículos: " + venta.getAutos().size());
        System.out.printf("Total: $%.2f\n", venta.getTotal());
        System.out.println("Fecha: " + FechaUtil.formatoCompleto(venta.getFecha()));
    }

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

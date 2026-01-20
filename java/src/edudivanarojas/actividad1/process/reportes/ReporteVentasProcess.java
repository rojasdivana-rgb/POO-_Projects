package edudivanarojas.actividad1.process.reportes;

import java.util.List;
import edudivanarojas.actividad1.model.Auto;
import edudivanarojas.actividad1.model.Venta;
import edudivanarojas.actividad1.utils.FechaUtil;

public class ReporteVentasProcess {

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

    public void mostrarResumenVenta(Venta venta) {
        System.out.println("\n--- RESUMEN DE VENTA ---");
        System.out.println("Cliente: " + venta.getCliente().getNombre());
        System.out.println("Cantidad de vehículos: " + venta.getAutos().size());
        System.out.printf("Total: $%.2f\n", venta.getTotal());
        System.out.println("Fecha: " + FechaUtil.formatearFecha(venta.getFecha()));
    }

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

package edu.divana.rojas.process.ventas;

import edu.divana.rojas.model.Auto;
import edu.divana.rojas.model.Cliente;
import edu.divana.rojas.model.Venta;
import edu.divana.rojas.repository.VentaRepository;

public class VentaProcess {
    private final VentaRepository ventaRepository;
    private Venta ventaActual;

    public VentaProcess(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public void iniciarVenta(Cliente cliente) {
        this.ventaActual = new Venta(0, cliente);
    }

    public void agregarAutoAVenta(Auto auto) {
        if (ventaActual != null) {
            ventaActual.agregarAuto(auto);
        }
    }

    public void eliminarAutoDeVenta(int idAuto) {
        if (ventaActual != null) {
            ventaActual.eliminarAuto(idAuto);
        }
    }

    public Venta obtenerVentaActual() {
        return ventaActual;
    }

    public void finalizarVenta() {
        if (ventaActual != null && !ventaActual.getAutos().isEmpty()) {
            ventaRepository.guardarVenta(ventaActual);
        }
    }

    public void cancelarVenta() {
        ventaActual = null;
    }
}

package edu.divana.rojas.process.ventas;

import edu.divana.rojas.model.Auto;
import edu.divana.rojas.model.Cliente;
import edu.divana.rojas.model.Venta;
import edu.divana.rojas.repository.VentaRepository;

/**
 * Procesa las operaciones relacionadas con ventas.
 * Gestiona el ciclo completo de una venta: inicio, agregación de vehículos y finalización.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class VentaProcess {
    /** Repositorio para guardar las ventas */
    private final VentaRepository ventaRepository;
    /** Venta actualmente en proceso */
    private Venta ventaActual;

    /**
     * Constructor del proceso de ventas.
     * @param ventaRepository repositorio para persistencia de ventas
     */
    public VentaProcess(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    /**
     * Inicia una nueva venta con un cliente específico.
     * @param cliente cliente que realiza la compra
     */
    public void iniciarVenta(Cliente cliente) {
        this.ventaActual = new Venta(0, cliente);
    }

    /**
     * Agrega un vehículo a la venta actualmente en proceso.
     * @param auto vehículo a agregar
     */
    public void agregarAutoAVenta(Auto auto) {
        if (ventaActual != null) {
            ventaActual.agregarAuto(auto);
        }
    }

    /**
     * Elimina un vehículo de la venta actualmente en proceso.
     * @param idAuto identificador del vehículo a eliminar
     */
    public void eliminarAutoDeVenta(int idAuto) {
        if (ventaActual != null) {
            ventaActual.eliminarAuto(idAuto);
        }
    }

    /**
     * Obtiene la venta que se encuentra en proceso.
     * @return venta actualmente en proceso
     */
    public Venta obtenerVentaActual() {
        return ventaActual;
    }

    /**
     * Finaliza la venta actualmente en proceso y la guarda en el repositorio.
     * Solo se guarda si hay vehículos en la venta.
     */
    public void finalizarVenta() {
        if (ventaActual != null && !ventaActual.getAutos().isEmpty()) {
            ventaRepository.guardarVenta(ventaActual);
        }
    }

    /**
     * Cancela la venta actualmente en proceso sin guardarla.
     */
    public void cancelarVenta() {
        ventaActual = null;
    }
}

package edudivanarojas.actividad1.process.ventas;

import edudivanarojas.actividad1.model.Auto;
import edudivanarojas.actividad1.model.Cliente;
import edudivanarojas.actividad1.model.Venta;
import edudivanarojas.actividad1.repository.VentaRepository;

/**
 * Clase que gestiona el proceso de creación y finalización de ventas.
 * Controla el flujo de trabajo para agregar autos a una venta y guardarla en el
 * repositorio.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class VentaProcess {
    private final VentaRepository ventaRepository;
    private Venta ventaActual;

    /**
     * Constructor que inicializa el proceso de ventas con un repositorio.
     *
     * @param ventaRepository Repositorio donde se guardarán las ventas
     */
    public VentaProcess(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    /**
     * Inicia una nueva venta para un cliente específico.
     *
     * @param cliente Cliente que realiza la compra
     */
    public void iniciarVenta(Cliente cliente) {
        this.ventaActual = new Venta(0, cliente);
    }

    /**
     * Agrega un vehículo a la venta en curso.
     *
     * @param auto Vehículo a agregar a la venta
     */
    public void agregarAutoAVenta(Auto auto) {
        if (ventaActual != null) {
            ventaActual.agregarAuto(auto);
        }
    }

    /**
     * Finaliza la venta actual y la guarda en el repositorio.
     * Solo guarda si la venta tiene al menos un vehículo.
     */
    public void finalizarVenta() {
        if (ventaActual != null && !ventaActual.getAutos().isEmpty()) {
            ventaRepository.guardarVenta(ventaActual);
            ventaActual = null;
        }
    }

    /**
     * Obtiene la venta actual en proceso.
     *
     * @return Venta actual o null si no hay venta en proceso
     */
    public Venta obtenerVentaActual() {
        return ventaActual;
    }
}

package edudivanarojas.actividad1.repository;

import java.util.ArrayList;
import java.util.List;

import edudivanarojas.actividad1.model.Venta;

/**
 * Repositorio que gestiona el almacenamiento de ventas realizadas.
 * Proporciona operaciones CRUD básicas para las ventas.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class VentaRepository {
    private final List<Venta> ventas;
    private int contadorVentas;

    /**
     * Constructor que inicializa el repositorio de ventas.
     * Establece el contador inicial de ventas en 1000.
     */
    public VentaRepository() {
        this.ventas = new ArrayList<>();
        this.contadorVentas = 1000;
    }

    /**
     * Guarda una nueva venta en el repositorio.
     * Asigna automáticamente un ID único a la venta.
     *
     * @param venta Venta a guardar
     */
    public void guardarVenta(Venta venta) {
        venta.setIdVenta(++contadorVentas);
        ventas.add(venta);
    }

    /**
     * Obtiene todas las ventas registradas.
     *
     * @return Lista con copia de todas las ventas
     */
    public List<Venta> obtenerTodas() {
        return new ArrayList<>(ventas);
    }

    /**
     * Busca una venta por su identificador.
     *
     * @param id Identificador de la venta a buscar
     * @return Venta encontrada o null si no existe
     */
    public Venta obtenerPorId(int id) {
        for (Venta venta : ventas) {
            if (venta.getIdVenta() == id) {
                return venta;
            }
        }
        return null;
    }

    /**
     * Obtiene la cantidad total de ventas registradas.
     *
     * @return Número de ventas en el repositorio
     */
    public int obtenerCantidad() {
        return ventas.size();
    }
}

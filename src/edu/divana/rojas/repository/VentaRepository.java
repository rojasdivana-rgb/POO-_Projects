package edu.divana.rojas.repository;

import java.util.ArrayList;
import java.util.List;

import edu.divana.rojas.model.Venta;

/**
 * Repositorio para la gestión de ventas.
 * Almacena y proporciona acceso a todas las ventas realizadas en el sistema.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class VentaRepository {
    /** Lista de todas las ventas realizadas */
    private final List<Venta> ventas;
    /** Contador para generar identificadores únicos de venta */
    private int contadorVentas;

    /**
     * Constructor que inicializa el repositorio de ventas.
     */
    public VentaRepository() {
        this.ventas = new ArrayList<>();
        this.contadorVentas = 1000;
    }

    /**
     * Guarda una nueva venta en el repositorio.
     * Asigna automáticamente un identificador único a la venta.
     * @param venta venta a guardar
     */
    public void guardarVenta(Venta venta) {
        contadorVentas++;
        venta.setIdVenta(contadorVentas);
        ventas.add(venta);
    }

    /**
     * Obtiene todas las ventas registradas.
     * @return copia de la lista de todas las ventas
     */
    public List<Venta> obtenerTodas() {
        return new ArrayList<>(ventas);
    }

    /**
     * Busca una venta por su identificador.
     * @param id identificador de la venta
     * @return la venta si existe, null en caso contrario
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
     * @return número de ventas
     */
    public int obtenerCantidad() {
        return ventas.size();
    }
}

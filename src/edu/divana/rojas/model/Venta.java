package edu.divana.rojas.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una venta de vehículos en el sistema.
 * Contiene información del cliente, vehículos vendidos, fecha y total de la venta.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class Venta {
    /** Identificador único de la venta */
    private int idVenta;
    /** Cliente que realiza la compra */
    private Cliente cliente;
    /** Lista de vehículos incluidos en la venta */
    private final List<Auto> autos;
    /** Fecha y hora en que se realizó la venta */
    private final LocalDateTime fecha;
    /** Total de la venta en dólares */
    private double total;

    /**
     * Constructor de la venta.
     *
     * @param idVenta identificador de la venta
     * @param cliente cliente que realiza la compra
     */
    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.autos = new ArrayList<>();
        this.fecha = LocalDateTime.now();
        this.total = 0.0;
    }

    /**
     * Obtiene el identificador de la venta.
     * @return id de la venta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Establece el identificador de la venta.
     * @param idVenta id a establecer
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Obtiene el cliente de la venta.
     * @return cliente que realizó la compra
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente de la venta.
     * @param cliente cliente a establecer
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la lista de vehículos vendidos.
     * @return copia de la lista de vehículos
     */
    public List<Auto> getAutos() {
        return new ArrayList<>(autos);
    }

    /**
     * Agrega un vehículo a la venta y recalcula el total.
     * @param auto vehículo a agregar
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
        calcularTotal();
    }

    /**
     * Elimina un vehículo de la venta por su id.
     * @param idAuto identificador del vehículo a eliminar
     */
    public void eliminarAuto(int idAuto) {
        autos.removeIf(auto -> auto.getId() == idAuto);
        calcularTotal();
    }

    /**
     * Obtiene la fecha y hora de la venta.
     * @return fecha y hora de realización
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Obtiene el total de la venta.
     * @return total en dólares
     */
    public double getTotal() {
        return total;
    }

    /**
     * Calcula el total de la venta sumando los precios de todos los vehículos.
     */
    private void calcularTotal() {
        this.total = 0.0;
        for (Auto auto : autos) {
            this.total += auto.getPrecio();
        }
    }

    /**
     * Retorna una representación textual de la venta.
     * @return descripción de la venta en formato texto
     */
    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", cliente=" + cliente +
                ", autos=" + autos +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}

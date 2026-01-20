package edudivanarojas.actividad1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una venta en el sistema.
 * Contiene la información del cliente, los vehículos vendidos y la fecha de la
 * venta.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class Venta {
    private int idVenta;
    private Cliente cliente;
    private final List<Auto> autos;
    private LocalDateTime fecha;

    /**
     * Constructor que crea una nueva venta para un cliente específico.
     *
     * @param idVenta Identificador único de la venta
     * @param cliente Cliente que realiza la compra
     */
    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.autos = new ArrayList<>();
        this.fecha = LocalDateTime.now();
    }

    /**
     * Obtiene el identificador de la venta.
     *
     * @return ID de la venta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Establece el identificador de la venta.
     *
     * @param idVenta Nuevo ID de la venta
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Obtiene el cliente de la venta.
     *
     * @return Objeto Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente de la venta.
     *
     * @param cliente Nuevo cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la lista de vehículos vendidos.
     *
     * @return Lista de autos incluidos en la venta
     */
    public List<Auto> getAutos() {
        return autos;
    }

    /**
     * Agrega un vehículo a la venta.
     *
     * @param auto Vehículo a agregar
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Obtiene la fecha y hora de la venta.
     *
     * @return LocalDateTime de la venta
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha y hora de la venta.
     *
     * @param fecha Nueva fecha y hora
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Calcula el precio total de la venta.
     *
     * @return Total de la venta (suma de precios de todos los vehículos)
     */
    public double getTotal() {
        double total = 0;
        for (Auto auto : autos) {
            total += auto.getPrecio();
        }
        return total;
    }

    /**
     * Devuelve una representación en string de la venta.
     *
     * @return String con información resumida de la venta
     */
    @Override
    public String toString() {
        return String.format("Venta ID: %d | Cliente: %s | Total: $%.2f | Vehículos: %d",
                idVenta, cliente.getNombre(), getTotal(), autos.size());
    }
}

package edudivanarojas.actividad1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una venta de vehículos.
 * Contiene información sobre el cliente, los vehículos vendidos y la fecha de la venta.
 * 
 * @author Edu Divana Rojas
 * @version 1.0
 */
public class Venta {
    private int idVenta;
    private Cliente cliente;
    private final List<Auto> autos;
    private LocalDateTime fecha;

    /**
     * Constructor para crear una nueva venta.
     * 
     * @param idVenta identificador único de la venta
     * @param cliente cliente que realiza la compra
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
     * @return el ID de la venta
     */
    public int getIdVenta() { return idVenta; }

    /**
     * Establece el identificador de la venta.
     * 
     * @param idVenta el nuevo ID de la venta
     */
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }

    /**
     * Obtiene el cliente asociado a la venta.
     * 
     * @return el cliente que realizó la compra
     */
    public Cliente getCliente() { return cliente; }

    /**
     * Establece el cliente para la venta.
     * 
     * @param cliente el nuevo cliente
     */
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    /**
     * Obtiene la lista de vehículos vendidos.
     * 
     * @return lista de autos incluidos en la venta
     */
    public List<Auto> getAutos() { return autos; }

    /**
     * Agrega un vehículo a la venta.
     * 
     * @param auto el vehículo a agregar
     */
    public void agregarAuto(Auto auto) { autos.add(auto); }

    /**
     * Obtiene la fecha y hora de la venta.
     * 
     * @return la fecha de la venta
     */
    public LocalDateTime getFecha() { return fecha; }

    /**
     * Establece la fecha y hora de la venta.
     * 
     * @param fecha la nueva fecha de la venta
     */
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    /**
     * Calcula el monto total de la venta sumando los precios de todos los vehículos.
     * 
     * @return el monto total de la venta
     */
    public double getTotal() {
        double total = 0;
        for (Auto auto : autos) {
            total += auto.getPrecio();
        }
        return total;
    }

    /**
     * Retorna una representación en texto de la venta con información resumida.
     * 
     * @return cadena con ID, cliente, total y cantidad de vehículos
     */
    @Override
    public String toString() {
        return String.format("Venta ID: %d | Cliente: %s | Total: $%.2f | Vehículos: %d",
                idVenta, cliente.getNombre(), getTotal(), autos.size());
    }
}

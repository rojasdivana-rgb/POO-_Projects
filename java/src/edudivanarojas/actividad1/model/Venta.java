package edudivanarojas.actividad1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private Cliente cliente;
    private final List<Auto> autos;
    private LocalDateTime fecha;

    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.autos = new ArrayList<>();
        this.fecha = LocalDateTime.now();
    }

    public int getIdVenta() { return idVenta; }
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<Auto> getAutos() { return autos; }
    public void agregarAuto(Auto auto) { autos.add(auto); }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public double getTotal() {
        double total = 0;
        for (Auto auto : autos) {
            total += auto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("Venta ID: %d | Cliente: %s | Total: $%.2f | Vehículos: %d",
                idVenta, cliente.getNombre(), getTotal(), autos.size());
    }
}

package edu.divana.rojas.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private Cliente cliente;
    private final List<Auto> autos;
    private final LocalDateTime fecha;
    private double total;

    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.autos = new ArrayList<>();
        this.fecha = LocalDateTime.now();
        this.total = 0.0;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Auto> getAutos() {
        return new ArrayList<>(autos);
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
        calcularTotal();
    }

    public void eliminarAuto(int idAuto) {
        autos.removeIf(auto -> auto.getId() == idAuto);
        calcularTotal();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    private void calcularTotal() {
        this.total = 0.0;
        for (Auto auto : autos) {
            this.total += auto.getPrecio();
        }
    }

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

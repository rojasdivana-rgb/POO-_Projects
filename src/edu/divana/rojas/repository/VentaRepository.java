package edu.divana.rojas.repository;

import java.util.ArrayList;
import java.util.List;

import edu.divana.rojas.model.Venta;

public class VentaRepository {
    private final List<Venta> ventas;
    private int contadorVentas;

    public VentaRepository() {
        this.ventas = new ArrayList<>();
        this.contadorVentas = 1000;
    }

    public void guardarVenta(Venta venta) {
        contadorVentas++;
        venta.setIdVenta(contadorVentas);
        ventas.add(venta);
    }

    public List<Venta> obtenerTodas() {
        return new ArrayList<>(ventas);
    }

    public Venta obtenerPorId(int id) {
        for (Venta venta : ventas) {
            if (venta.getIdVenta() == id) {
                return venta;
            }
        }
        return null;
    }

    public int obtenerCantidad() {
        return ventas.size();
    }
}

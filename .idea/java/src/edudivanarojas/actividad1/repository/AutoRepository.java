package edudivanarojas.actividad1.repository;

import java.util.ArrayList;
import java.util.List;

import edudivanarojas.actividad1.model.Auto;

public class AutoRepository {
    private final List<Auto> autos;

    public AutoRepository() {
        this.autos = new ArrayList<>();
        inicializarCatalogo();
    }

    private void inicializarCatalogo() {
        autos.add(new Auto(1, "Revuelto", "Lamborghini", 645000.00, "Amarillo", 2024, "V12 híbrido", "1001 hp", 350, "Superdeportivo híbrido"));
        autos.add(new Auto(2, "Revuelto", "Lamborghini", 645000.00, "Rojo", 2024, "V12 híbrido", "1001 hp", 350, "Superdeportivo híbrido"));
        autos.add(new Auto(3, "Revuelto", "Lamborghini", 645000.00, "Negro", 2024, "V12 híbrido", "1001 hp", 350, "Superdeportivo híbrido"));
        
        autos.add(new Auto(4, "Huracan Sterrato", "Lamborghini", 267000.00, "Blanco", 2024, "V10", "640 hp", 325, "Superdeportivo todo terreno"));
        autos.add(new Auto(5, "Huracan Sterrato", "Lamborghini", 267000.00, "Gris", 2023, "V10", "640 hp", 325, "Superdeportivo todo terreno"));
        
        autos.add(new Auto(6, "Urus S", "Lamborghini", 232000.00, "Negro", 2024, "V8", "666 hp", 305, "SUV deportivo"));
        autos.add(new Auto(7, "Urus S", "Lamborghini", 232000.00, "Blanco", 2024, "V8", "666 hp", 305, "SUV deportivo"));
        
        autos.add(new Auto(8, "LM002", "Lamborghini", 185000.00, "Naranja", 2022, "V12", "580 hp", 290, "SUV clásico"));
        autos.add(new Auto(9, "Aventador SVJ", "Lamborghini", 530000.00, "Amarillo", 2021, "V12", "759 hp", 349, "Superdeportivo V12"));
        autos.add(new Auto(10, "Countach LPI 800-4", "Lamborghini", 448000.00, "Rojo", 2022, "V12 híbrido", "803 hp", 350, "Superdeportivo retro"));
    }

    public List<Auto> obtenerTodos() {
        return new ArrayList<>(autos);
    }

    public Auto obtenerPorId(int id) {
        for (Auto auto : autos) {
            if (auto.getId() == id) {
                return auto;
            }
        }
        return null;
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void eliminarAuto(int id) {
        autos.removeIf(auto -> auto.getId() == id);
    }

    public int obtenerCantidad() {
        return autos.size();
    }
}



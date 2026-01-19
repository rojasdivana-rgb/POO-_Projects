package edu.divana.rojas.repository;

import java.util.ArrayList;
import java.util.List;

import edu.divana.rojas.model.Auto;

/**
 * Repositorio para la gestión de vehículos.
 * Almacena y proporciona acceso a los automóviles disponibles en el catálogo.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class AutoRepository {
    /** Lista de vehículos disponibles en el catálogo */
    private final List<Auto> autos;

    /**
     * Constructor que inicializa el repositorio con el catálogo de vehículos.
     */
    public AutoRepository() {
        this.autos = new ArrayList<>();
        inicializarCatalogo();
    }

    /**
     * Inicializa el catálogo con los vehículos Lamborghini disponibles.
     */
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

    /**
     * Obtiene todos los vehículos del catálogo.
     * @return copia de la lista de todos los vehículos
     */
    public List<Auto> obtenerTodos() {
        return new ArrayList<>(autos);
    }

    /**
     * Busca un vehículo por su identificador.
     * @param id identificador del vehículo
     * @return el vehículo si existe, null en caso contrario
     */
    public Auto obtenerPorId(int id) {
        for (Auto auto : autos) {
            if (auto.getId() == id) {
                return auto;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo vehículo al catálogo.
     * @param auto vehículo a agregar
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Elimina un vehículo del catálogo.
     * @param id identificador del vehículo a eliminar
     */
    public void eliminarAuto(int id) {
        autos.removeIf(auto -> auto.getId() == id);
    }

    public int obtenerCantidad() {
        return autos.size();
    }
}

package edudivanarojas.actividad1.repository;

import java.util.ArrayList;
import java.util.List;

import edudivanarojas.actividad1.model.Auto;

/**
 * Repositorio que gestiona el catálogo de vehículos disponibles.
 * Proporciona operaciones CRUD básicas para los autos.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class AutoRepository {
    private final List<Auto> autos;

    /**
     * Constructor que inicializa el repositorio e carga el catálogo de vehículos.
     */
    public AutoRepository() {
        this.autos = new ArrayList<>();
        inicializarCatalogo();
    }

    /**
     * Inicializa el catálogo con los vehículos disponibles.
     */
    private void inicializarCatalogo() {
        autos.add(new Auto(1, "Revuelto", 2024, "Motor V12 Híbrido", 1001, 350, 645000.00));
        autos.add(new Auto(2, "Revuelto", 2024, "Motor V12 Híbrido", 1001, 350, 645000.00));
        autos.add(new Auto(3, "Revuelto", 2024, "Motor V12 Híbrido", 1001, 350, 645000.00));

        autos.add(new Auto(4, "Huracán Sterrato", 2023, "Motor V10 Biturbo", 631, 325, 267000.00));
        autos.add(new Auto(5, "Huracán Sterrato", 2023, "Motor V10 Biturbo", 631, 325, 267000.00));

        autos.add(new Auto(6, "Urus S", 2024, "Motor V8 Biturbo", 657, 305, 232000.00));
        autos.add(new Auto(7, "Urus S", 2024, "Motor V8 Biturbo", 657, 305, 232000.00));

        autos.add(new Auto(8, "LM002", 2023, "Motor V12", 580, 290, 185000.00));
        autos.add(new Auto(9, "Aventador SVJ", 2020, "Motor V12 Naturalmente Aspirado", 770, 350, 530000.00));
        autos.add(new Auto(10, "Countach LPI 800-4", 2022, "Motor V12 Híbrido", 803, 355, 448000.00));
    }

    /**
     * Obtiene todos los vehículos disponibles.
     *
     * @return Lista con copia de todos los autos disponibles
     */
    public List<Auto> obtenerTodos() {
        return new ArrayList<>(autos);
    }

    /**
     * Busca un vehículo por su identificador.
     *
     * @param id Identificador del vehículo a buscar
     * @return Auto encontrado o null si no existe
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
     *
     * @param auto Vehículo a agregar
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Elimina un vehículo del catálogo.
     *
     * @param id Identificador del vehículo a eliminar
     */
    public void eliminarAuto(int id) {
        autos.removeIf(auto -> auto.getId() == id);
    }

    /**
     * Obtiene la cantidad total de vehículos en el catálogo.
     *
     * @return Número de vehículos disponibles
     */
    public int obtenerCantidad() {
        return autos.size();
    }
}

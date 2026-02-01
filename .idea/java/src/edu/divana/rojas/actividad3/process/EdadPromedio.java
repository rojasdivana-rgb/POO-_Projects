package edu.divana.rojas.actividad3.process;

import java.util.List;

/**
 * Clase con utilidades para listas de empleados
 */
public class EdadPromedio {


     //@param empleados lista de objetos Empleado
     //@return promedio de edad (double) o 0.0 si no hay empleados

    public static double promedioEdad(List<EmpleadoUtils> empleados) {

        // Caso borde: lista inválida
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        int sumaEdades = 0;
        int cantidad = 0;

        // Recorremos la lista sumando edades
        for (EmpleadoUtils emp : empleados) {
            // Opcional: validar edad >= 0
            // if (emp.Edad >= 0) {
            sumaEdades += emp.edad;
            cantidad++;
            // }
        }

        // Evitamos división por cero (aunque ya verificamos isEmpty)
        if (cantidad == 0) {
            return 0.0;
        }

        // Promedio con división en punto flotante
        return (double) sumaEdades / cantidad;
    }
}
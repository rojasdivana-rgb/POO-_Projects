package edu.divana.rojas.actividad3.process;

import java.util.List;

/**
 * Utilidades para listas de empleados
 */
public class PromedioEdadMas25K {

    private int sueldo;
    private double Edad;

    /**
     * Calcula el promedio de edad de los empleados que ganan más de 25,000.
     *
     * Reglas:
     * - Solo se consideran empleados con sueldo > 25000
     * - Si no hay empleados que cumplan la condición → devuelve 0.0
     * - Si la lista es null o está vacía → devuelve 0.0
     *
     * @param empleados lista de objetos Empleado
     * @return promedio de edad (double) de los que ganan más de 25K, o 0.0 si no aplica
     */
    public static double promedioEdadMayores25K(List<EmpleadoUtils> empleados) {

        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        double sumaEdades = 0.0;
        int contador = 0;

        for (EmpleadoUtils e : empleados) {
            if (e.sueldo > 25000) {
                sumaEdades += e.edad;
                contador++;
            }
        }

        if (contador == 0) {
            return 0.0;
        }

        return sumaEdades / contador;
    }
}

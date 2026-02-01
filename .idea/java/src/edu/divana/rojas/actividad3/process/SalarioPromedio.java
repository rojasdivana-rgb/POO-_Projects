package edu.divana.rojas.actividad3.process;

import java.util.List;

/**
 * Utilidades para trabajar con listas de empleados
 */
public class SalarioPromedio {

    private static double sumaSueldos;

    /**
     * Calcula el promedio de sueldo de todos los empleados en la lista.
     *
     * Casos especiales:
     * - Si la lista es null o está vacía → devuelve 0.0
     * - Si algún sueldo es negativo → se incluye en el cálculo
     *   (puedes agregar validación si el ejercicio lo exige)
     *
     * @param empleados lista de objetos Empleado
     * @return promedio de sueldo (double) o 0.0 si no hay empleados
     */
    public static double promedioSalario(List<EmpleadoUtils> empleados) {

        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (EmpleadoUtils e : empleados) {
            suma = (int) (suma + e.sueldo);
        }

        return sumaSueldos / empleados.size();
    }
}
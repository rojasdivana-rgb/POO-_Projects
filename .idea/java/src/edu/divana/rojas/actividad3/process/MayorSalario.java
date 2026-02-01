package edu.divana.rojas.actividad3.process;

import java.util.List;

public class EmpleadoMayorSalario {


     //Devuelve el empleado con el mayor salario de la lista.
     //Si la lista es null o está vacía → devuelve null.

    public static EmpleadoUtils obtenerEmpleadoMayorSalario(List<EmpleadoUtils> empleados) {
        // Validamos que la lista no sea nula ni esté vacía
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        // Tomamos el primer empleado como candidato inicial
        EmpleadoUtils candidato = empleados.get(0);

        // Recorremos la lista para encontrar el mayor salario
        for (EmpleadoUtils emp : empleados) {
            if (emp.sueldo > candidato.sueldo) {
                candidato = emp; // Actualizamos el candidato si encontramos uno con mayor sueldo
            }
        }

        // Devolvemos el empleado con el mayor salario
        return candidato;
    }
}
package edu.divana.rojas.actividad3.process;

import java.util.List;

public class EmpleadoMayorSalario {

    /**
     * Devuelve el empleado con el mayor salario de la lista.
     * Si la lista es null o está vacía → devuelve null.
     */
    public static EmpleadoUtils obtenerEmpleadoMayorSalario(List<EmpleadoUtils> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        EmpleadoUtils candidato = empleados.get(0);

        for (EmpleadoUtils emp : empleados) {
            if (emp.sueldo > candidato.sueldo) {
                candidato = emp;
            }
        }

        return candidato;
    }
}

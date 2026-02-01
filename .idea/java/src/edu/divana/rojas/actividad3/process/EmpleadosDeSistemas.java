package edu.divana.rojas.actividad3.process;

import java.util.List;


 //Utilidades para listas de empleados.

public class EmpleadosDeSistemas {

    private String Departamento;

     //@param empleados lista de objetos Empleado
     //@return cantidad de empleados en el departamento de Sistemas

    public static int contarEmpleadosDeSistemas(List<EmpleadoUtils> empleados) {

        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        int contador = 0;

        for (EmpleadoUtils emp : empleados) {
            // Verificamos que el departamento no sea null antes de comparar
            if (emp.departamento != null &&
                    emp.departamento.trim().equalsIgnoreCase("Sistemas")) {
                contador++;
            }
        }

        return contador;
    }
}

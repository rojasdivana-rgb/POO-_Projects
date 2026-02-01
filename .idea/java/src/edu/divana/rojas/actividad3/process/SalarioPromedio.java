package edu.divana.rojas.actividad3.process;

import java.util.List;

//Utilidades para trabajar con listas de empleados

public class SalarioPromedio {

     //@param empleados lista de objetos Empleado
     //@return promedio de sueldo (double) o 0.0 si no hay empleados

    public static double promedioSalario(List<EmpleadoUtils> empleados) {

        // Validamos que la lista no sea nula ni esté vacía
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        double sumaSueldos = 0.0; // Acumulador de sueldos

        // Recorremos la lista y sumamos los sueldos
        for (EmpleadoUtils e : empleados) {
            sumaSueldos += e.sueldo;
        }

        // Calculamos el promedio dividiendo entre el número de empleados
        return sumaSueldos / empleados.size();
    }
}
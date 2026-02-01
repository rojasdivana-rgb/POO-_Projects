package edu.divana.rojas.actividad3.process;

import java.util.ArrayList;
import java.util.List;


 //Utilidades para listas de empleados

public class MenoresDe25 {


      //Devuelve una nueva lista que contiene SOLO los empleados con menos de 25 años de edad.
      //@param empleados lista original de empleados
     //@return nueva lista con empleados < 25 años (nunca null)

    public static List<EmpleadoUtils> obtenerMenoresDe25(List<EmpleadoUtils> empleados) {

        // Creamos una lista nueva para no modificar la original
        List<EmpleadoUtils> menores = new ArrayList<>();

        // Caso borde
        if (empleados == null || empleados.isEmpty()) {
            return menores;  // devuelve lista vacía
        }

        for (EmpleadoUtils emp : empleados) {
            if (emp.edad < 25) {
                menores.add(emp);
            }
        }

        return menores;
    }
}

package edu.divana.rojas.actividad3.process;

import java.util.List;


 //Utilidades para listas de empleados

public class MayorSalarioMayorDe30 {

    private double sueldo;
    private int Edad;


     //Devuelve el empleado con el MAYOR salario entre aquellos que tienen más de 30 años de edad.
      //@param empleados lista de objetos Empleado
     //@return el empleado con mayor salario entre los > 30 años, o null si no existe
    public static EmpleadoUtils empleadoMayorSalarioMayorDe30(List<EmpleadoUtils> empleados) {

        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        EmpleadoUtils candidato = null;
        double salarioMaximo = -1;  // valor inicial imposible

        for (EmpleadoUtils emp : empleados) {
            // Solo consideramos empleados mayores de 30 años
            if (emp.edad > 30) {
                if (emp.sueldo > salarioMaximo) {
                    salarioMaximo = emp.sueldo;
                    candidato = emp;
                }
            }
        }

        return candidato;
    }
}
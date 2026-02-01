package edu.divana.rojas.actividad3.process;

import java.util.List;


  //Utilidades para listas de empleados

public class PromedioEdadMas25K {

    // Estos atributos no se usan en la lógica actual, podrían eliminarse
    private int sueldo;
    private double Edad;

      //@param empleados lista de objetos Empleado
      //@return promedio de edad (double) de los que ganan más de 25K, o 0.0 si no aplica

    public static double promedioEdadMayores25K(List<EmpleadoUtils> empleados) {

        // Validamos que la lista no sea nula ni esté vacía
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        double sumaEdades = 0.0; // Acumulador de edades
        int contador = 0;        // Contador de empleados que cumplen la condición

        // Recorremos la lista de empleados
        for (EmpleadoUtils e : empleados) {
            if (e.sueldo > 25000) { // Solo consideramos los que ganan más de 25K
                sumaEdades += e.edad;
                contador++;
            }
        }

        // Si ningún empleado cumple la condición, devolvemos 0.0
        if (contador == 0) {
            return 0.0;
        }

        // Calculamos y devolvemos el promedio
        return sumaEdades / contador;
    }
}

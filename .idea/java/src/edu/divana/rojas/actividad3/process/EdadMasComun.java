package edu.divana.rojas.actividad3.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdadMasComun {


     //@param empleados lista de objetos Empleado
     //@return la edad más común, o 0 si la lista es null o está vacía

    public static int edadMasComun(List<EmpleadoUtils> empleados) {

        // Caso borde: lista inválida
        if (empleados == null || empleados.isEmpty()) {
            return 0;  // o podrías devolver -1, depende de lo que pida el profesor
        }

        // Mapa para contar cuántas veces aparece cada edad
        Map<Integer, Integer> conteo = new HashMap<>();

        // Primera pasada: contar ocurrencias
        for (EmpleadoUtils e : empleados) {
            int edad = e.edad;  // nota: tu clase Empleado usa Edad (con mayúscula)

            // Forma clásica (como la viste en clase)
            if (conteo.containsKey(edad)) {
                conteo.put(edad, conteo.get(edad) + 1);
            } else {
                conteo.put(edad, 1);
            }

            // Forma más moderna y corta (si el profesor lo permite)
            // conteo.put(edad, conteo.getOrDefault(edad, 0) + 1);
        }

        // Segunda pasada: buscar la edad con mayor frecuencia
        int edadMasFrecuente = 0;   // valor por defecto
        int mayorCantidad = 0;

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            int cantidad = entry.getValue();
            if (cantidad > mayorCantidad) {
                mayorCantidad = cantidad;
                edadMasFrecuente = entry.getKey();
            }
        }

        return edadMasFrecuente;
    }
}

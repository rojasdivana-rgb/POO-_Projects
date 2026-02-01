package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Clase auxiliar mínima para el test
class EmpleadoUtils {
    int edad;
    EmpleadoUtils(int edad) {
        this.edad = edad;
    }
}

public class EdadPromedioTest {

    @Test
    public void testPromedioEdadConLista() {
        // Lista con tres empleados de edades 20, 30 y 40
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(20),
                new EmpleadoUtils(30),
                new EmpleadoUtils(40)
        );

        double resultado = EdadPromedio.promedioEdad(empleados);

        // Promedio esperado: (20 + 30 + 40) / 3 = 30.0
        assertEquals(30.0, resultado);
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver 0.0
        List<EmpleadoUtils> empleados = Arrays.asList();

        double resultado = EdadPromedio.promedioEdad(empleados);

        assertEquals(0.0, resultado);
    }
}
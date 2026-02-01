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
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(20),
                new EmpleadoUtils(30),
                new EmpleadoUtils(40)
        );

        double resultado = EdadPromedio.promedioEdad(empleados);
        assertEquals(30.0, resultado); // (20 + 30 + 40) / 3 = 30.0
    }

    @Test
    public void testListaVacia() {
        List<EmpleadoUtils> empleados = Arrays.asList();
        double resultado = EdadPromedio.promedioEdad(empleados);
        assertEquals(0.0, resultado); // lista vacía devuelve 0.0
    }
}

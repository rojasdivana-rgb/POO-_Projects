package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Clase auxiliar mínima para el test
class EmpleadoUtils {
    String departamento;
    EmpleadoUtils(String departamento) {
        this.departamento = departamento;
    }
}

public class EmpleadosDeSistemasTest {

    @Test
    public void testContarEmpleadosDeSistemas() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils("Sistemas"),
                new EmpleadoUtils("Ventas"),
                new EmpleadoUtils("Sistemas"),
                new EmpleadoUtils("Recursos Humanos")
        );

        int resultado = EmpleadosDeSistemas.contarEmpleadosDeSistemas(empleados);
        assertEquals(2, resultado); // hay 2 empleados en "Sistemas"
    }

    @Test
    public void testListaVacia() {
        List<EmpleadoUtils> empleados = Arrays.asList();
        int resultado = EmpleadosDeSistemas.contarEmpleadosDeSistemas(empleados);
        assertEquals(0, resultado); // lista vacía devuelve 0
    }
}

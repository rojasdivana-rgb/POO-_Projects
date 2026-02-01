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
        // Lista con empleados de distintos departamentos
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils("Sistemas"),
                new EmpleadoUtils("Ventas"),
                new EmpleadoUtils("Sistemas"),
                new EmpleadoUtils("Recursos Humanos")
        );

        int resultado = EmpleadosDeSistemas.contarEmpleadosDeSistemas(empleados);

        // Esperamos 2 porque hay dos empleados en "Sistemas"
        assertEquals(2, resultado);
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver 0
        List<EmpleadoUtils> empleados = Arrays.asList();

        int resultado = EmpleadosDeSistemas.contarEmpleadosDeSistemas(empleados);

        assertEquals(0, resultado);
    }
}
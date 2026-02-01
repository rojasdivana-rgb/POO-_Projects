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

public class MenoresDe25Test {

    @Test
    public void testObtenerMenoresDe25ConLista() {
        // Lista con empleados de distintas edades
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(20),
                new EmpleadoUtils(30),
                new EmpleadoUtils(24),
                new EmpleadoUtils(40)
        );

        // Ejecutamos el método que obtiene los menores de 25
        List<EmpleadoUtils> resultado = MenoresDe25.obtenerMenoresDe25(empleados);

        // Esperamos 2 porque 20 y 24 son menores de 25
        assertEquals(2, resultado.size());
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver lista vacía
        List<EmpleadoUtils> empleados = Arrays.asList();

        List<EmpleadoUtils> resultado = MenoresDe25.obtenerMenoresDe25(empleados);

        assertEquals(0, resultado.size());
    }
}
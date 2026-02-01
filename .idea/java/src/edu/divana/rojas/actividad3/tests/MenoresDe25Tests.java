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
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(20),
                new EmpleadoUtils(30),
                new EmpleadoUtils(24),
                new EmpleadoUtils(40)
        );

        List<EmpleadoUtils> resultado = MenoresDe25.obtenerMenoresDe25(empleados);
        assertEquals(2, resultado.size()); // 20 y 24 son menores de 25
    }

    @Test
    public void testListaVacia() {
        List<EmpleadoUtils> empleados = Arrays.asList();
        List<EmpleadoUtils> resultado = MenoresDe25.obtenerMenoresDe25(empleados);
        assertEquals(0, resultado.size()); // lista vacía devuelve lista vacía
    }
}
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

public class EdadMasComunTest {

    @Test
    public void testEdadMasComunConLista() {
        // Lista con varias edades repetidas
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(25),
                new EmpleadoUtils(30),
                new EmpleadoUtils(25),
                new EmpleadoUtils(40),
                new EmpleadoUtils(25),
                new EmpleadoUtils(30)
        );

        int resultado = EdadMasComun.edadMasComun(empleados);

        // 25 aparece 3 veces, más que las demás
        assertEquals(25, resultado);
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver 0
        List<EmpleadoUtils> empleados = Arrays.asList();

        int resultado = EdadMasComun.edadMasComun(empleados);

        assertEquals(0, resultado);
    }
}
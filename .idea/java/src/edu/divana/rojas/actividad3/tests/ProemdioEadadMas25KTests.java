package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Clase auxiliar mínima para el test
class EmpleadoUtils {
    int edad;
    double sueldo;
    EmpleadoUtils(int edad, double sueldo) {
        this.edad = edad;
        this.sueldo = sueldo;
    }
}

public class PromedioEdadMas25KTest {

    @Test
    public void testPromedioEdadMayores25K() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(30, 20000), // no cuenta
                new EmpleadoUtils(40, 30000), // sí cuenta
                new EmpleadoUtils(50, 40000)  // sí cuenta
        );

        double resultado = PromedioEdadMas25K.promedioEdadMayores25K(empleados);
        assertEquals(45.0, resultado); // (40 + 50) / 2 = 45.0
    }

    @Test
    public void testSinEmpleadosQueCumplanCondicion() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(25, 20000),
                new EmpleadoUtils(35, 25000)
        );

        double resultado = PromedioEdadMas25K.promedioEdadMayores25K(empleados);
        assertEquals(0.0, resultado); // ninguno supera 25K
    }
}
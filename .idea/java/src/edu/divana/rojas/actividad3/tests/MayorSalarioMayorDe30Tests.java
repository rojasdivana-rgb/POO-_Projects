package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Clase auxiliar mínima para el test
class EmpleadoUtils {
    int edad;
    double sueldo;
    EmpleadoUtils(int edad, double sueldo) {
        this.edad = edad;
        this.sueldo = sueldo;
    }
}

public class MayorSalarioMayorDe30Test {

    @Test
    public void testEmpleadoMayorSalarioMayorDe30() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(28, 50000), // no cuenta (edad <= 30)
                new EmpleadoUtils(35, 60000), // candidato
                new EmpleadoUtils(40, 55000), // menor sueldo
                new EmpleadoUtils(50, 70000)  // mayor sueldo
        );

        EmpleadoUtils resultado = MayorSalarioMayorDe30.empleadoMayorSalarioMayorDe30(empleados);
        assertNotNull(resultado);
        assertEquals(50, resultado.edad);
        assertEquals(70000, resultado.sueldo);
    }

    @Test
    public void testSinEmpleadosMayoresDe30() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(25, 40000),
                new EmpleadoUtils(30, 45000)
        );

        EmpleadoUtils resultado = MayorSalarioMayorDe30.empleadoMayorSalarioMayorDe30(empleados);
        assertNull(resultado); // ninguno cumple la condición
    }
}

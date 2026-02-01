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

public class MenorSalarioYEdadTest {

    @Test
    public void testEmpleadoMenorSalarioConEdadMenosComun() {
        // Lista con empleados de distintas edades y sueldos
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(25, 3000),
                new EmpleadoUtils(30, 2000), // salario mínimo
                new EmpleadoUtils(40, 2000), // salario mínimo
                new EmpleadoUtils(40, 2000)  // salario mínimo repetido
        );

        // Ejecutamos el método que busca el empleado con menor salario y edad menos común
        EmpleadoUtils resultado = MenorSalarioYEdad.empleadoMenorSalarioConEdadMenosComun(empleados);

        // Validamos que el resultado no sea null
        assertNotNull(resultado);
        // Entre los de salario mínimo (2000), las edades son 30 (1 vez) y 40 (2 veces).
        // La edad menos común es 30, por lo tanto debe devolver ese empleado.
        assertEquals(30, resultado.edad);
        assertEquals(2000, resultado.sueldo);
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver null
        List<EmpleadoUtils> empleados = Arrays.asList();

        EmpleadoUtils resultado = MenorSalarioYEdad.empleadoMenorSalarioConEdadMenosComun(empleados);

        assertNull(resultado); // lista vacía devuelve null
    }
}
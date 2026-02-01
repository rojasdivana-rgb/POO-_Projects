package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoMayorSalarioTest {

    @Test
    public void testObtenerEmpleadoMayorSalario() {
        // Lista con empleados de distintos departamentos y sueldos
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils("Ana", 25, "Ventas", "Ejecutiva", 20000),
                new EmpleadoUtils("Luis", 30, "Sistemas", "Ingeniero", 30000),
                new EmpleadoUtils("Marta", 40, "Recursos Humanos", "Gerente", 25000)
        );

        // Llamamos al método que obtiene el empleado con mayor salario
        EmpleadoUtils resultado = EmpleadoMayorSalario.obtenerEmpleadoMayorSalario(empleados);

        // Validamos que no sea null y que sea Luis con 30,000
        assertNotNull(resultado);
        assertEquals("Luis", resultado.nombre);
        assertEquals(30000, resultado.sueldo);
    }

    @Test
    public void testListaVacia() {
        // Lista vacía → debe devolver null
        List<EmpleadoUtils> empleados = Arrays.asList();

        EmpleadoUtils resultado = EmpleadoMayorSalario.obtenerEmpleadoMayorSalario(empleados);

        assertNull(resultado); // lista vacía devuelve null
    }
}

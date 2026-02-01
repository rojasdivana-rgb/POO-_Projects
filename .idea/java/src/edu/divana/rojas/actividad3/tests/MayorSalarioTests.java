package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoMayorSalarioTest {

    @Test
    public void testObtenerEmpleadoMayorSalario() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils("Ana", 25, "Ventas", "Ejecutiva", 20000),
                new EmpleadoUtils("Luis", 30, "Sistemas", "Ingeniero", 30000),
                new EmpleadoUtils("Marta", 40, "Recursos Humanos", "Gerente", 25000)
        );

        EmpleadoUtils resultado = MayorSalario.obtenerMayorSalario(empleados);

        assertNotNull(resultado);
        assertEquals("Luis", resultado.nombre);
        assertEquals(30000, resultado.sueldo);
    }

    @Test
    public void testListaVacia() {
        List<EmpleadoUtils> empleados = Arrays.asList();

        EmpleadoUtils resultado = EmpleadoMayorSalario.obtenerEmpleadoMayorSalario(empleados);

        assertNull(resultado); // lista vacía devuelve null
    }
}

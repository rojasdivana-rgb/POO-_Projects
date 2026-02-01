package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Clase auxiliar mínima para el test
class EmpleadoUtils {
    double sueldo;
    EmpleadoUtils(double sueldo) {
        this.sueldo = sueldo;
    }
}

public class SalarioPromedioTest {

    @Test
    public void testPromedioSalarioConLista() {
        List<EmpleadoUtils> empleados = Arrays.asList(
                new EmpleadoUtils(1000.0),
                new EmpleadoUtils(2000.0),
                new EmpleadoUtils(3000.0)
        );

        double resultado = SalarioPromedio.promedioSalario(empleados);
        assertEquals(2000.0, resultado); // (1000 + 2000 + 3000) / 3 = 2000.0
    }

    @Test
    public void testListaVacia() {
        List<EmpleadoUtils> empleados = Arrays.asList();
        double resultado = SalarioPromedio.promedioSalario(empleados);
        assertEquals(0.0, resultado); // lista vacía devuelve 0.0
    }
}

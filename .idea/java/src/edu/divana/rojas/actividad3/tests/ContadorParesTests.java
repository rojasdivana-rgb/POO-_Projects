package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorParesTest {

    @Test
    public void testContarNumerosPares() {
        // Lista de números de prueba
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Ejecutamos el método que cuenta los pares
        int resultado = ContadorPares.contarNumerosPares(numeros);

        // Verificamos que el resultado sea 3 (porque 2, 4 y 6 son pares)
        assertEquals(3, resultado);
    }
}
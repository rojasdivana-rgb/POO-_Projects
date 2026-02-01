package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorParesTest {

    @Test
    public void testContarNumerosPares() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultado = ContadorPares.contarNumerosPares(numeros);
        assertEquals(3, resultado); // 2, 4 y 6 son pares
    }
}
package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorVocalesTest {

    @Test
    public void testContarVocales() {
        // Caso con mezcla de vocales y consonantes
        String texto = "Hola Mundo";
        int resultado = ContadorVocales.contarVocales(texto);
        assertEquals(4, resultado); // Vocales: o, a, u, o
    }

    @Test
    public void testTextoSinVocales() {
        String texto = "rhythm";
        int resultado = ContadorVocales.contarVocales(texto);
        assertEquals(0, resultado); // No hay vocales
    }
}

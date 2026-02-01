package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CadenaInvertidaTest {

    @Test
    public void testInvertirCadenaNormal() {
        assertEquals("aloh", CadenaInvertida.invertir("hola"));
        assertEquals("avaJ", CadenaInvertida.invertir("Java"));
        assertEquals("reconocer", CadenaInvertida.invertir("reconocer")); // palíndromo
    }

    @Test
    public void testCasosEspeciales() {
        assertEquals("", CadenaInvertida.invertir(""));   // cadena vacía
        assertEquals("a", CadenaInvertida.invertir("a")); // un solo carácter
        assertNull(CadenaInvertida.invertir(null));       // caso null
    }
}
package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadenaInvertidaTest {

    @Test
    public void testInvertirCadenaNormal() {
        // Caso típico: invertir una palabra común
        assertEquals("aloh", CadenaInvertida.invertir("hola"));
        // Verificamos que respete mayúsculas/minúsculas
        assertEquals("avaJ", CadenaInvertida.invertir("Java"));
        // Palíndromo: al invertir debe quedar igual
        assertEquals("reconocer", CadenaInvertida.invertir("reconocer"));
    }

    @Test
    public void testCasosEspeciales() {
        // Cadena vacía → debe devolver cadena vacía
        assertEquals("", CadenaInvertida.invertir(""));
        // Un solo carácter → se devuelve igual
        assertEquals("a", CadenaInvertida.invertir("a"));
        // Caso null → debe devolver null
        assertNull(CadenaInvertida.invertir(null));
    }
}
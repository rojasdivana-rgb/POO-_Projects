package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimerUbicacionCaracterTest {

    @Test
    public void testCaracterEncontrado() {
        assertEquals(1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("hola", 'o'));
        assertEquals(0, PrimerUbicacionCaracter.primeraPosicionDeCaracter("Java", 'J'));
        assertEquals(3, PrimerUbicacionCaracter.primeraPosicionDeCaracter("reconocer", 'o'));
    }

    @Test
    public void testCaracterNoEncontradoONull() {
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("hola", 'z'));
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("", 'a'));
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter(null, 'a'));
    }
}
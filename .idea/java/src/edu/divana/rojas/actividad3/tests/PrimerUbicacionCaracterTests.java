package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimerUbicacionCaracterTest {

    @Test
    public void testCaracterEncontrado() {
        // Caso típico: el carácter sí aparece en la cadena
        assertEquals(1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("hola", 'o'));
        assertEquals(0, PrimerUbicacionCaracter.primeraPosicionDeCaracter("Java", 'J'));
        assertEquals(3, PrimerUbicacionCaracter.primeraPosicionDeCaracter("reconocer", 'o'));
    }

    @Test
    public void testCaracterNoEncontradoONull() {
        // Carácter no presente en la cadena
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("hola", 'z'));
        // Cadena vacía → no hay caracteres
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter("", 'a'));
        // Cadena nula → debe devolver -1
        assertEquals(-1, PrimerUbicacionCaracter.primeraPosicionDeCaracter(null, 'a'));
    }
}
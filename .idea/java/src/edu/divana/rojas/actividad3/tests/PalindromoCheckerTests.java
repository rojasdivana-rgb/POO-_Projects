package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromoCheckerTest {

    @Test
    public void testEsPalindromo() {
        assertTrue(PalindromoChecker.esPalindromoIgnorandoMayusculas("Ana"));
        assertTrue(PalindromoChecker.esPalindromoIgnorandoMayusculas("Reconocer"));
    }

    @Test
    public void testNoEsPalindromo() {
        assertFalse(PalindromoChecker.esPalindromoIgnorandoMayusculas("Hola"));
        assertFalse(PalindromoChecker.esPalindromoIgnorandoMayusculas("Java"));
    }
}
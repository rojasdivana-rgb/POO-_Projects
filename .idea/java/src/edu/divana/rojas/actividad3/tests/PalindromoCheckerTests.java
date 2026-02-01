package edu.divana.rojas.actividad3.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoCheckerTest {

    @Test
    public void testEsPalindromo() {
        // Palabras que son palíndromos ignorando mayúsculas
        assertTrue(PalindromoChecker.esPalindromoIgnorandoMayusculas("Ana"));
        assertTrue(PalindromoChecker.esPalindromoIgnorandoMayusculas("Reconocer"));
    }

    @Test
    public void testNoEsPalindromo() {
        // Palabras que NO son palíndromos
        assertFalse(PalindromoChecker.esPalindromoIgnorandoMayusculas("Hola"));
        assertFalse(PalindromoChecker.esPalindromoIgnorandoMayusculas("Java"));
    }
}
package edu.divana.rojas.actividad3.tests;

import edu.divana.rojas.actividad3.process.EmpleadoUtils;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverCerosALaDerechaTests {

        @Test
        public void testMoverCeros() {
                // Lista inicial con ceros intercalados
                List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 0, 3, 0, 0, 5, 2));

                // Ejecutamos el método que mueve los ceros al final
                MoverCerosALaDerecha.moverCerosALaDerecha(numeros);

                // Verificamos que el resultado sea el esperado:
                // todos los ceros al final y los demás números en el mismo orden
                assertEquals(Arrays.asList(1, 3, 5, 2, 0, 0, 0), numeros);
        }
}
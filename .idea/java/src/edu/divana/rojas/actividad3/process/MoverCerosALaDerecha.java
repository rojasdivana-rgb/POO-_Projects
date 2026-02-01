package edu.divana.rojas.actividad3.process;

import java.util.List;

public class MoverCerosALaDerecha {

    public static void moverCerosALaDerecha(List<Integer> numeros) {
        int index = 0;

        // Mover todos los elementos no cero al frente
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) != 0) {
                numeros.set(index++, numeros.get(i));
            }
        }

        // Rellenar el resto con ceros
        while (index < numeros.size()) {
            numeros.set(index++, 0);
        }
    }
}
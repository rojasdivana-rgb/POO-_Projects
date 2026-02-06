package edu.divana.rojas.process;

public class Modulo extends Resta {
    /**
     * Calcula el residuo de la división de dos números.
     * @param n1 Dividendo.
     * @param n2 Divisor.
     * @return El residuo de n1 / n2.
     */
    @Override
    public int apply(int n1, int n2) {
        int residuo = n1;
        while (residuo >= n2) {
            residuo = super.apply(residuo, n2);
        }
        return residuo;
    }
}

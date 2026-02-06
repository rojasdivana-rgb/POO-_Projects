package edu.divana.rojas.process;

public class Division extends Resta {
    /**
     * Calcula el cociente de una división entera.
     * @param n1 Dividendo.
     * @param n2 Divisor.
     * @return Cantidad de veces que n2 cabe en n1.
     */
    public int apply(int n1, int n2) {
        int cociente = 0;
        int residuo = n1;
        while (residuo >= n2) {
            residuo = super.apply(residuo, n2);
            cociente++;
        }
        return cociente;
    }
}
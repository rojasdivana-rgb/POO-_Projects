package edu.divana.rojas.process;

public class Logaritmo extends Division {
    /**
     * Calcula el logaritmo de op1 en base op2.
     * @param argumento es argumento
     * @param base es base
     * @return resultado del logaritmo entero
     */
    @Override
    public int apply(int argumento, int base) {
        if (argumento <= 0 || base <= 1) {
            throw new ArithmeticException("El logaritmo solo está definido para base > 1 y argumento > 0");
        }
        int logaritmo = 0;
        int acumulado = argumento;
        // Mientras argumento(acumulado) sea mayor o igual a la base, se puede seguir dividiendo
        while (acumulado >= base) {
            acumulado = super.apply(acumulado, base);
            logaritmo++;
        }
        return logaritmo;
    }
}
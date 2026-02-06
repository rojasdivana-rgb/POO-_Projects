package edu.divana.rojas.process;

public class Raiz extends Potencia {
    /**
     * Encuentra la raíz entera de un número.
     * @param radicando El número al que se le busca la raíz.
     * @param indice El grado de la raíz (ej. 2 para cuadrada).
     * @return La raíz entera.
     */
    @Override
    public int apply(int radicando, int indice) {
        if (radicando < 0) return -1; // No manejamos raíces de negativos en enteros
        if (radicando == 0) return 0;
        
        int aproximacion = 1;
        // Buscamos el número 'aproximacion' tal que aproximacion^indice <= radicando
        // Incrementamos aproximacion mientras (aproximacion + 1)^indice <= radicando
        while (super.apply(aproximacion + 1, indice) <= radicando) {
            aproximacion++;
        }
        return aproximacion;
    }
}
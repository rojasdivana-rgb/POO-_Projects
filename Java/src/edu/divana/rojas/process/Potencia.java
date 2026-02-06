package edu.divana.rojas.process;

public class Potencia extends Multiplicacion{

    @Override
    public int apply(int base, int exponente) {
        int potencia = 1;
        for (int i=0;i<exponente;i++){
            potencia = super.apply(potencia,base);
        }
        return potencia;
    }
}
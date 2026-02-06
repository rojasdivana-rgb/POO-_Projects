package edu.divana.rojas.process;

public class Multiplicacion extends Suma{

    private int producto;

    @Override
    public int apply(int a, int b){
        this.producto=0;
        for(int i=0;i<b;i++){
            this.producto = super.apply(producto,a);
        }
        return this.producto;
    }
}
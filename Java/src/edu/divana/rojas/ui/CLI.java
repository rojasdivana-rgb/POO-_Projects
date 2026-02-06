package edu.divana.rojas.ui;

import edu.divana.rojas.process.Calculadora;

import java.util.Scanner;

public class CLI {
    private static Calculadora calculadora = new Calculadora();
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
            showMenu();
            option = scanner.nextInt();
            if(option == 0)
                break;
            try{
                calculadora.setOperacion(option);
                aplicarOperacion(calculadora);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("chao");
    }
    public static void aplicarOperacion(Calculadora calculadora){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int b = scanner.nextInt();
        int resultado = calculadora.operacion.apply(a,b);
        System.out.println("El resultado es: " +resultado);

    }
    public static void showMenu(){
        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicacion");
        System.out.println("4: Division");
        System.out.println("5: Modulo");
        System.out.println("6: Logaritmo");
        System.out.println("7: Potencia");
        System.out.println("8: Raiz");
        System.out.println("0: Salir");
    }
}
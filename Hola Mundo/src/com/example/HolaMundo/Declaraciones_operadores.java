package com.example.HolaMundo;

public class Declaraciones_operadores {
    public static void main(String[] args) {

        byte a = 8, c = 3, b = 12, aux;

        /*
        System.out.println( "a*c + b = " + (a*c + b) );
        System.out.println( "a*(c+b) = " + a*(c + b) );


        System.out.println( "\na/c = " + a/c);
        System.out.println( "a/3.0 = " + a/3.0);
        System.out.println( "8.0/c = " + 8.0/c);
        System.out.println( "8.0/3.0 = " + 8.0/3.0);
        System.out.println( "a/c = " + (double)a/c);
        */

        System.out.println("\nINTERCAMBIO DE VARIABLES");
        System.out.println(a + " - " + c);
        aux = a;
        a = c;
        c = aux;
        System.out.println(a + " - " + c);

    }
}

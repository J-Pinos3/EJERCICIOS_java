package com.example.HolaMundo;

public class strings_2 {
    public static void main(String[] args) {
        System.out.println("\t\tMÉTODOS DE STRING EN JAVA");
        System.out.println("\t.length(): devuelve la longitud de una cadena de caracteres");
        System.out.println("\t.charAt(1): devuelve la posición de un caracter dentro de la cadena, las posiciones empiezan desde 0");
        System.out.println("\t.substring(x,y): devuelve una subcadena dentro de la cadena, x: caracter desde donde se extrae, y: se extiende hasta el caracter con índice (index-1)");
        System.out.println("El índice final es exclusivo");
        System.out.println("\t.equals(): devuelve true si dos cadenas son iguales y false si no lo son, distingue mayusculas y minusculas\n\n");

        String nombre = "José Pinos";

        System.out.println("Subcadena: " + nombre.substring(5));//Pinos
        System.out.println("Subcadena: " + nombre.substring(5,10));//Pinos 10-1 = 9 = s
        System.out.println("Subcadena: " + nombre.substring(5,9));//Pino 9-1 = 8 = o
        System.out.println( nombre.substring(0,4) + " vamos a descanzar" );
        //substrin(caracter desde el que quiero extraer,posicion del caracter que no quiero )
    }
}

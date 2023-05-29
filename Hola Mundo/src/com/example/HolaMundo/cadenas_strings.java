package com.example.HolaMundo;

public class cadenas_strings {
    public static void main(String[] args) {

        System.out.println("\t\tMÉTODOS DE STRING EN JAVA");
        System.out.println("\t.length(): devuelve la longitud de una cadena de caracteres");
        System.out.println("\t.charAt(1): devuelve la posición de un caracter dentro de la cadena, las posiciones empiezan desde 0");
        System.out.println("\t.substring(x,y): devuelve una subcadena dentro de la cadena, x: caracter desde donde se extrae, y: número de caracteeres a extraer");
        System.out.println("\t.equals(): devuelve true si dos cadenas son iguales y false si no lo son, distingue mayusculas y minusculas");





        String nombre = "José Pinos";

        System.out.println("\n\nEl nombre " + nombre + " tiene " + nombre.length() + " caracteres de longitud");

        System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0) );
        System.out.println("La n_ava letra de mi nombre es: " + nombre.charAt( nombre.length()-1 ) );
        //la longitud de José Pinos es 10 y la última s tiene índice 9
        //los índices van desde 0 hasta longitud-1
        System.out.println(nombre.toUpperCase());
        //nombre.toUpperCase();
        System.out.println(nombre);
    }
}

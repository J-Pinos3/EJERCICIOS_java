package com.example.HolaMundo;

public class strings_3 {
    public static void main(String[] args) {
        System.out.println("\t\tMÉTODOS DE STRING EN JAVA");
        System.out.println("\t.length(): devuelve la longitud de una cadena de caracteres");
        System.out.println("\t.charAt(1): devuelve la posición de un caracter dentro de la cadena, las posiciones empiezan desde 0");
        System.out.println("\t.substring(x,y): devuelve una subcadena dentro de la cadena, x: caracter desde donde se extrae, y: se extiende hasta el caracter con índice (index-1)");
        System.out.println("El índice final es exclusivo");
        System.out.println("\t.equals(): devuelve true si dos cadenas son iguales y false si no lo son, distingue mayusculas y minusculas\n\n");

        String banda = new String("Dream Theater");
        String banda2 = new String("Dream Theater");

        System.out.println( banda.equals(banda2) );
        System.out.println( banda.equals("Dream Theater") );
        System.out.println( banda.equals("dream theater") );//false
        System.out.println( banda.equalsIgnoreCase("dream theater") );//true xq ignora mayúsculas y minúsculas
    }
}

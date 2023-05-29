package com.example.HolaMundo;
import java.util.Scanner;

public class entrada_salida_1 {
    public static void main(String[] args) {

        /*
        Scanner entrada = new Scanner(System.in);
        String banda = "", banda_2 = "";

        System.out.print(">");//se almacena hasta que encuentra un espacio, lo de mas se asigna a la siguiente entrada
        banda =  entrada.nextLine();

        System.out.print(">");//si antes usé un next() luego ya no puedo ingresar datos en la nueva entrada
       banda_2 =  entrada.nextLine();//se almacena completamento todo


        System.out.println(banda );
        System.out.println(banda_2 );
        */

        Scanner entrada = new Scanner(System.in);
        String nombre;
        byte edad;


        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextByte();//cualquier next que no sea Line() se parece a cin
        entrada.nextLine();//solo ignoro el enter
        System.out.println("Entrada: " + entrada);
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();//el nextline almacena el enter anterior, se parace a getline()


        System.out.println(nombre + " tiene " + edad +" años");



    }
}

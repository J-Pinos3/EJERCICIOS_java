package com.example.HolaMundo;

import java.util.Scanner;

public class Segundos_hms {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        short horas = 0, minutos = 0, segundos = 0;

        System.out.print("Ingrese el número de segundos: ");
        short seg_totales = entrada.nextShort();

        horas = (short)(seg_totales/3600);
        seg_totales %= 3600;
        minutos = (short)(seg_totales/60);
        segundos = (short)(seg_totales % 60);

        System.out.println("\nHoras: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);


    }

}

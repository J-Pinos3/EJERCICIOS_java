package com.example.HolaMundo;
import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] arr1 = new double[5];

        System.out.println("Ingrese los valores del array");
        for(int i = 0; i < arr1.length; i++){
            System.out.print("valor[" + i + "]: ");
            arr1[i] = entrada.nextDouble();
        }


        System.out.println("\nOrdenando el array...");

        double aux = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = i+1; j < arr1.length; j++){
                if( arr1[i] < arr1[j]){
                    aux = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = aux;
                }
            }
        }


        System.out.println("\nLos valores ordenados del array son: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + "  ");
        }

        System.out.println();
    }
}

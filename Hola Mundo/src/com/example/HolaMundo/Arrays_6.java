package com.example.HolaMundo;
import java.util.Scanner;

public class Arrays_6 {
    public static void main(String[] args) {

    int[] arreglo = new int[10];

    ingresar_valores(arreglo);

    System.out.println("\n");
    ordenar_valores(arreglo);

    imprimir_valores(arreglo);
    }//fin del método de main

    public static void ingresar_valores(int[] arr){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese los valores del arreglo");

        for(int i = 0; i < arr.length; i++){
            System.out.print("Valor " + (i+1) + ": ");
            arr[i] = entrada.nextInt();
        }


    }//fin del método ingresar_valores


    public static void imprimir_valores(final int[] arr){

        for(int valores : arr){
            System.out.print(valores + "  ");
        }

    }//fin del método imprimir valores


    public static void ordenar_valores(int[] arr){

        int aux = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] < arr[j]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }

            }
        }

    }//fin del método ordenar

}

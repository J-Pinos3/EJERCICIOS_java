package com.example.HolaMundo;

import java.util.Arrays;

public class Arrays_1 {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr3 ={1,2,3,4,5}; //declaro e inicializo
        //int arr2[] = {}; array tipo C
        //int[10] arr2 = {}; no se puede inicializar


        //INICIALIZO ARR1, SI NO HAGO ESTO EL ARRAY SE INICIALIZA CON CEROS
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[3] = 8;
        arr1[4] = 10;

        //IMPRIMIR CADA ELEMENTO SIN FOR
        /*
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        */


        //IMPRIMIR CADA ELEMENTO CON FOR
        //for(int i = 0; i < 5; i++)//original
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + "  ");
        }

    }//FIN DEL MÉTODO DE MAIN
}

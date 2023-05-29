package com.example.HolaMundo;
import java.util.Scanner;


public class Ejercicio_arrays_comisiones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {457,987,6541,6543,784,324,987,741,8881,910,1154};


        for(int i = 0; i < arr.length; i++){

            arr[i] = (int)(200 + arr[i]*9/100)/100;
            System.out.println();
        }
        System.out.println();

        for(int valores : arr){
            System.out.print(valores+" ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                System.out.printf("%s","$1000 and over: ");
            }else{
                System.out.printf("$%3d-%3d: ", 200+i*100, 200+i*100 + 99);
            }



            for(int j = 0; j < arr[i]; j++){
                System.out.print((char)176);
            }
            System.out.println();
        }






    }//fin del método de main
}

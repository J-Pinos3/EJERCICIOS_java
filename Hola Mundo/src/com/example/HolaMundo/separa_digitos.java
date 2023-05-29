package com.example.HolaMundo;
import java.util.Scanner;

public class separa_digitos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número de 5 dígitos: ");
        int numero = entrada.nextInt();
        int num_aux = numero;
        int cifras = 0;
        // SOLO FUNCIONA PARA UN NÚMERO DE 5 DÍGITOS
        /*
        int factor = 10000;
        while(factor > 0){
            System.out.print(num_aux/factor + "   ");
            num_aux %= factor;
            factor/=10;
        }
        */

        while(num_aux > 0){ //contamos las cifras del número ingresado
            num_aux /=10;
            cifras++;
        }

        //System.out.println(numero + " \t " + cifras);

        int factor = 1;
        int i = 1;
        while(i < cifras ){
            factor = factor * 10;
            i++;
        }

        //System.out.println("factor \t" + factor);

        num_aux = numero;
        while(factor > 0){
            System.out.print(num_aux/factor + "      ");
            num_aux %= factor;
            factor/=10;
        }

    }//FIN DEL MÉTODO DE MAIN

}

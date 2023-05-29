package com.example.HolaMundo;
import java.util.Scanner;

public class Adivinar_num_aleatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num_aleatorio = (int)(Math.random()*100);
        System.out.println( num_aleatorio );

        int numero = 0, intentos = 0;

        while(numero != num_aleatorio){

            intentos++;

            System.out.print("Ingresa un número: ");
            numero = entrada.nextInt();

            if(numero > num_aleatorio){
                System.out.println("Mas Bajo");

            }else if(num_aleatorio > numero){
                System.out.println("Mas Alto");

            }else{
                System.out.println("Correcto");

            }

            System.out.println();
        }//cierra while

        System.out.println("\nAdivinaste el número " + num_aleatorio + " en " + intentos + " intentos" );
    }//FIN DEL MÉTODO DE MAIN
}

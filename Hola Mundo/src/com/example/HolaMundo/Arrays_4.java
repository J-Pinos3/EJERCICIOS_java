package com.example.HolaMundo;
import java.util.Scanner;

public class Arrays_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [][] matriz1 = new int[3][3];
        System.out.println("Ingrese los elementos de la matriz");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }


        System.out.println("\n\nLos elementos de la matriz son");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("["+matriz1[i][j]+"] ");
            }
            System.out.println();
        }


    }
}

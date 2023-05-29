package com.example.HolaMundo;

public class ArrMultidimensionales_1 {
    public static void main(String[] args) {

        int[][] matriz1 = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i][j] = i*j + 1;
            }
        }

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n");
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz b: " + b.length);
        System.out.println(b[0]);
        System.out.println("Primer elemento de la matriz b, b[0]: " + b[0].length);


    }//fin del método de main
}

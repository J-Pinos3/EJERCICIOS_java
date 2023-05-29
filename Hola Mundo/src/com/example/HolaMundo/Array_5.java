package com.example.HolaMundo;

import java.awt.*;

public class Array_5 {

    public static void main(String[] args) {

        //MATRIZ DE 5 FILAS Y CUATRO COLUMNAS
        /*
        //double[][] matriz = new double[5][4];
        //filas                  0           1          2           3            4
        double[][] matriz = { {0,1,0,1}, {1,2,3,4}, {2,4,6,8}, {5,10,15,20}, {1,3,5,7} };

        //for normal
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println("\n");
        }


        //bucle for-each
        for(double[] fila: matriz){
            for(double elemento: fila){
                System.out.print(elemento + "     ");
            }
            System.out.println();
        }
        */


        //INTERES compuesto POR AÑOS

        double acumulado = 0;
        double interes = 0.10;//interes del 10%

        double[][] saldo = new double[6][5];

        for(int i = 0; i < 6; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;
            for(int j = 1; j < 5; j++){
                acumulado = acumulado + (acumulado*interes);
                saldo[i][j] = acumulado;
            }

            interes += 0.01;//10% 11% 12%
        }



        for(double[] fila: saldo){
            for(double valor: fila){
                System.out.print(valor + "   ");
            }
            System.out.println();
        }





    }//fin del método de main

}//fin de la clase


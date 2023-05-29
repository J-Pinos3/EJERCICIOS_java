package com.example.HolaMundo;
import javax.swing.JOptionPane;

public class bucles_1 {

    public static void main(String[] args) {

        //While QUE MUESTRA NÚMEROS PARES
        /*
        int i = 0;
        while(i <= 30){
            System.out.print(i + " ");
            i+=2;
        }
        */


        //SIMULAR UN LOGIN
        /*
        String clave = "Jose";
        String password = " ";
        //se inicia en false para que ingrese almenos una vez
        while( clave.equals(password)==false ){
            password = JOptionPane.showInputDialog("Introduce tu contraseña: ");

            if(clave.equals(password)==false){
                System.out.println("Contraseña errónea");
            }
        }
        System.out.println("Bienvenido al programa :)");
        */


        //CUADRADO VACÍO
        /*
        int i = 1;
        int n = 10;
        n = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un número para imprimir una figura") );
        while(i <= n){//tapa 1
            System.out.print("*  ");
            i++;
        }
        System.out.println();

        i = 1;
        int j = 1;
        while(i <= n-2){
            j = 1;
            while(j <= n){
                if(j == 1 || j == n){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;
        }


        i = 1;
        while(i <= n) {//tapa 2
            System.out.print("*  ");
            i++;
        }
        */


        //CUADRADO LLENO
        /*
        int i = 1;
        int n = 0;
        n = Integer.parseInt( JOptionPane.showInputDialog("Ingresa un número para crear la figura: ") );

        while(i <= n){
            int j = 1;
            while(j <= n){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
        */


        //FIGURA CON NUMEROS V.1
        /*
        int i = 1;
        int n = 0;
        n = Integer.parseInt( JOptionPane.showInputDialog("Ingresa n para crear la figura: ") );

        i = n;

        while(i >= 1){
            int j = 1;
            while(j <= i) {
                System.out.print(j + " ");
                j+=1;
            }
            System.out.println();
            i--;
        }
        */


        //FIGURA CON NUMEROS V.2
        /*
        int i = 1,  n = 0;
        n = Integer.parseInt( JOptionPane.showInputDialog("Ingresa n para crear la figura: ") );
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        */




    }//fin del método de main

}//fin de la clase bucles 1

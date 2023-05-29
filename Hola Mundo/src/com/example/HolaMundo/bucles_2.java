package com.example.HolaMundo;
import java.util.Scanner;

public class bucles_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //PROMEDIO DE X NÚMEROS INGRESADOS POR EL USUARIO
        /*
        int valor = 0;
        int suma = 0;
        int contador = 0;

        System.out.print("Ingrese un valor <-1 para terminar>: ");
        valor = entrada.nextInt();

        while(valor != -1){
            suma += valor;
            contador++;

            System.out.print("Ingrese un valor <-1 para terminar>: ");
            valor = entrada.nextInt();
        }

        if(contador == 0){
            contador = 1;//el usuario solo ingresó -1 y así ya no se divide para cero
        }

        System.out.println("Suma: " + suma);
        System.out.println("Contador: " + contador);
        System.out.println("Promedio: " + ( (double)suma/contador ) );
        */


        //PROMEDIO CON DO-WHILE
        /*
        int valor = 0, suma = 0, contador = 0;

        do{
            suma+=valor;

            System.out.println("Ingrese un valor < 0 para terminar >: ");
            valor = entrada.nextInt();

            if( valor!=0 ){
                contador++;
            }
        }while(valor != 0);

        System.out.println("suma: " + suma);
        System.out.println("contador: " + contador);
        System.out.println("promedio: " + ( (double)suma/contador ) );

        */


        //NUMEROS IMPARES for
        /*
        for(int i = 2; i <= 30; i+=2){
            System.out.print(i + " ");
        }
        */


        //NUMEROS NEGATIVOS
        /*
        for(int i = -20; i < 0; i++){
            System.out.print(i + " ");
        }
        */


        //FACTORIAL
        System.out.print("Ingresa un número para hallar el factorial: ");
        int n = entrada.nextInt();
        while( n < 0){
            System.out.print("Ingresa un número para hallar el factorial: ");
            n = entrada.nextInt();
        }

        System.out.println();

        double factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);




    }//FIN DEL METODO DE MAIN

}//FIN DE LA CLASE BUCLES 2

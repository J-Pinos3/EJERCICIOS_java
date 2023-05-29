package com.example.HolaMundo;
import java.util.Scanner;


public class Calculos_math {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        saludo();
        /*
         System.out.println("PI = " + Math.PI);
         System.out.println("Cos(30): " + Math.cos( 30*Math.PI/180.0 ));
         System.out.println("Cos(60): " + Math.cos( 60*Math.PI/180.0 ));
         System.out.println("Cos(90): " + Math.cos( 90*Math.PI/180.0 ));

         System.out.println("\nSrt(900): " + Math.sqrt(900.0));
        */
        double lado1, lado2;
        System.out.print("\nIngrese el cateto opuesto: ");
        lado1 = entrada.nextDouble();

        System.out.print("Ingrese el cateto adyacente: ");
        lado2 = entrada.nextDouble();

        double resultado = Math.round( Math.sqrt( Math.pow(lado1,2.0) + Math.pow(lado2,2.0)  ) );
        double resultado_2 = Math.sqrt( Math.pow(lado1,2) + Math.pow(lado2,2.0)  ) ;

        System.out.println("Hipotenusa: " + resultado);
        System.out.println("Hipotenusa_2: " + resultado_2);


    }

    public static void saludo(){
        System.out.println("BIENVENIDO A LA CALCULADORA DE HIPOTENUSA");
    }

}

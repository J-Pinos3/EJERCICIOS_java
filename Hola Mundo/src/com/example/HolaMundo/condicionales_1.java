package com.example.HolaMundo;
import java.util.Scanner;

public class condicionales_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //VERIFICAR SI EL USUARIO ES MAYOR DE 18
        /*
        System.out.print("Ingresa tu edad: ");
        byte edad = entrada.nextByte();

        if(edad < 18){
            System.out.println("Eres un niño y no puedes entrar al bar");
        }else{
            System.out.println("Bienvenido al bar");
        }
        */

        //VERIFICAR SI LA BANDA EXISTE
        /*
        System.out.print("Ingresa una banda que te guste: ");
        String grupo = entrada.nextLine();

        if( grupo.equals("Dream Theater") ){
            System.out.println("Hollow Years");

        }else if( grupo.equals("Paramore") ){
            System.out.println("Ain't It Fun");

        }else if( grupo.equals("Stratovarius") ){
            System.out.println("EagleHeart");

        }else if( grupo.equals("Death") ){
            System.out.println("Symbolic");

        }else{
            System.out.println("EL HEAVY METAL MANDA");
        }
        */

        //DETERMINAR EL MENOR DE 4 NÚMEROS INGRESADOS POR EL USUARIO
        /*
        int num1, num2, num3, num4, mayor = 0;
        System.out.println("Ingrese 4 números separados por espacios");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();

        mayor = num1;
        if(num2 > mayor){
            mayor = num2;
        }

        if(num3 > mayor){
            mayor = num3;
        }

        if(num4 > mayor){
            mayor = num4;
        }
        System.out.println("\nLos números ingresados fueron");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        System.out.println("El mayor de los números ingresados fue: "+ mayor);

        */

        //DADA UNA NOTA INGRESADA POR EL USUARIO MOSTRAR UN MENSAJE SI EL ALUMNO APROBÓ SATISFACTORIAMENTE O NO
        /*
        System.out.println("Ingrese una nota entre 0 y 10");
        System.out.print(">");
        byte nota = entrada.nextByte();

        switch( nota ){

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:{
                System.out.println("Reprobado");
            }
            break;

            case 5:
            case 6:{
                System.out.println("Supletorio");
            }
            break;

            case 7:
            case 8:
            case 9:{
                System.out.println("Aprobado");
            }
            break;

            case 10:{
                System.out.println("Aprobado con honores");
            }
            break;

            default:{
                System.out.println("Esa nota no existe");
            }
        }//fin del switch
        */

        //EL USUARIO ELIGE EL ÁREA DE LA FIGURA QUE DESEA CALCULAR
        System.out.println("\tMENÚ\n" +
                "1) Cuadrado\n" +
                "2) Triángulo\n" +
                "3) Círculo\n" +
                "4) Rectángulo\n" +
                "5) Trapecio");

        System.out.print(">");
        byte opcion = entrada.nextByte();



        switch( opcion ){

            case 1:{
                System.out.println("\tÁrea del cuadrado");
                System.out.print("\nIngrese el lado del cuadrado: ");
                double lado = entrada.nextDouble();

                System.out.println("A = " + (lado*lado) );
            }
            break;


            case 2:{
                System.out.println("\tÁrea del triángulo");
                System.out.print("\nIngrese la base del triángulo: ");
                double base = entrada.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = entrada.nextDouble();

                System.out.println( "A = " + (base*altura/2.0) );
            }
            break;


            case 3:{
                System.out.println("\tÁrea del círculo");
                System.out.print("\nIngrese el radio del círculo: ");
                double radio = entrada.nextDouble();

                System.out.println( "A = " + (Math.PI * Math.pow(radio,2)) );
            }
            break;

            case 4:{
                System.out.println("\tÁrea del rectángulo");
                System.out.print("\nIngrese la base del rectángulo: ");
                double base = entrada.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = entrada.nextDouble();

                System.out.println( "A = " + (base*altura) );
            }
            break;


            case 5:{
                System.out.println("\tÁrea del trapacio");
                System.out.print("\nIngrese la base mayor: ");
                double B_mayor = entrada.nextDouble();
                System.out.print("Ingrese la base menor: ");
                double b_menor = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = entrada.nextDouble();

                System.out.println( "A = " + ( (B_mayor+b_menor)*altura/2.0 ) );

            }
            break;


            default:{
                System.out.println("Algo ha salido muy mal");
            }
            break;


        }//fin del switch


    }///fin del método de main



}//fin de la clase

package com.example.HolaMundo;
import java.util.Scanner;

public class Arrays_9 {
    public static void main(String[] args) {

        int[] arrNotas = new int[5];
        String[] arrNombres = new String[5];
        Scanner sc = new Scanner( System.in);

        System.out.println("INGRESE EL NOMBRE DEL ALUMNO Y SU NOTA");

        for (int i = 0; i < arrNotas.length; i++) {
            System.out.println("\nAlumno: " + (i+1));
            System.out.print("Nombre: ");
            arrNombres[i] = sc.nextLine();
            System.out.print("Nota: ");
            arrNotas[i] = sc.nextInt();

            sc.nextLine();

        }

        System.out.println("\n\n");
        for (int i = 0; i < arrNotas.length; i++) {
            System.out.println("\nAlumno: " + (i+1));
            System.out.println(arrNombres[i] + "  -  " + arrNotas[i]);

        }







    }//fin del método de main
}

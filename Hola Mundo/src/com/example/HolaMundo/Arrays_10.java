package com.example.HolaMundo;

public class Arrays_10 {
    public static void main(String[] args) {

        int[] respuestas = {1,2,3,5,4,1,3,56,5,4,2,1,3,1,1};//EL 15 se sale del rango de respuestas y del array frqs
        int[] frequencias = new int[6];//IGNORO EL ÍNDICE 0

        System.out.println("Se detectaron: " + respuestas.length + " respuestas de la encuesta\n");

        for (int i = 0; i < respuestas.length; i++) {
            try {
                frequencias[respuestas[i]]++;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.printf("%s%n","Paps, no te puedes pasar de los índices del array");
                System.out.println("respuestas["+i+"] = " + respuestas[i]);
            }
        }




        System.out.printf("%n%s%12s%n", "valor", "frecuencias");
        for(int i = 1; i < frequencias.length; i++){
            System.out.printf("%5d%12d%n",i,frequencias[i]);
        }





    }//fin del método de main
}

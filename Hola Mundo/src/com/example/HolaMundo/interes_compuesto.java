package com.example.HolaMundo;

public class interes_compuesto {

    public static void main(String[] args) {

        double cantidad = 0, capital_inicial = 1000.0, interes = 0.05;
        System.out.println("Año  Cantidad de Depósito");
        for(int i = 0; i <= 10;i++){
            cantidad = capital_inicial * Math.pow(1.0+interes, i);
            System.out.println("   " + i + "         " + cantidad);
        }

        double var1 = 14.234, var2 = 18.673;
        System.out.printf("%n%.10f%n",var1);
        System.out.printf("%.10f%n",var2);
        System.out.println("------");
        System.out.printf("%.2f%n",var1 + var2);



    }

}

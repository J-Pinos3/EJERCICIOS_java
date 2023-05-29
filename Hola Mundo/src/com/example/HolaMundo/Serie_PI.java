package com.example.HolaMundo;

public class Serie_PI {
    public static void main(String[] args) {

    double suma = 0;

    int i = 0;
    int j = 1;
    int n = 200000000;
    while(i <= n){
        suma += 4*Math.pow(-1.0,i)/j;
        i++;
        j += 2;
    }

    System.out.println("Para n = " + n);
    System.out.println("π = " + suma );

    }//fin del método de main
}

package com.example.HolaMundo;
import java.security.SecureRandom;
public class Arrays_8 {

    public static void main(String[] args) {
    //int number = shiftingValue + randomNumbers.nextInt(scalingFactor);
        //LANZAR DADOS

    SecureRandom numeros_aleatorios = new SecureRandom();
    int[] freqs = new int[7];//se ignora la cara "0"

    for(int i = 0; i <= 6000000; i++){
        freqs[1+numeros_aleatorios.nextInt(6)]++;
    }

        System.out.printf("%s%20s%n","Cara","Frecuencia");
    for(int cara = 1; cara < freqs.length; cara++){
        System.out.printf("%4d%20d%n", cara, freqs[cara]);
    }

    }//fin del método de main
}

package com.example.HolaMundo;

public class Arrays_7 {

    public static void main(String[] args) {
        int[] array = {5,7,1,0,2,3,0,11,14,13,12};
        for(int i = 0; i < array.length; i++){
            if(i == 10){
                System.out.printf("%5d:",100);
            }else{
                System.out.printf("%02d-%02d:",i*10,i*10 +9 );
            }

            for(int estrellas = 0; estrellas < array[i]; estrellas++){
                System.out.print("*");
            }
            System.out.println();
        }


    }//fin del método de main
}

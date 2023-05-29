package com.example.HolaMundo;
import java.util.Scanner;

public class uso_Tallas {

    //enum Talla{MINI, MEDIANA, GRANDE, MUY_GRANDE};
    enum Talla{

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        //los tipos enum no admiten la creación de objetos
        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura(){
            return abreviatura;
        }

        private String abreviatura;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos = sc.next().toUpperCase();

        Talla tamanio = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla: " + tamanio);
        System.out.println("Abreviatura: " + tamanio.getAbreviatura());

    }


}

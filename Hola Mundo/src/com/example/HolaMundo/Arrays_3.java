package com.example.HolaMundo;

import javax.swing.JOptionPane;

public class Arrays_3 {
    public static void main(String[] args) {
        String[] arr_paises = new String[5];

        System.out.println("Ingrese 5 países en el arreglo");

        for(int i = 0; i < arr_paises.length; i++){
            arr_paises[i] = JOptionPane.showInputDialog("Ingrese el país " + i + ": ");
        }

        System.out.println("\n\nLos países ingresados fueron");
        /*
        for(int i = 0; i < arr_paises.length; i++){
            System.out.println(arr_paises[i]);
        }
        */
        //BUCLE FOR-EACH
        for(String pais: arr_paises){
            System.out.println(pais);
        }

    }//FIN DEL MÉTODO DE MAIN
}

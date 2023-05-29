package com.example.HolaMundo;
import javax.swing.JOptionPane;

public class Array_strings {
    public static void main(String[] args) {

        String[] arr_nombres = new String[5];
        JOptionPane.showMessageDialog(null, "Ingrese 5 nombres");

        Ingresar_nombres(arr_nombres);
        Mostrar_nombres(arr_nombres);

    }//FIN DEL MÉTODO DE MAIN

    public static void Ingresar_nombres(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = JOptionPane.showInputDialog("Ingresa el nombre " + (i+1));
        }
    }//fin del método ingresar nombres


    public static void Mostrar_nombres(String[] arr){
        String datos = "";

        for(int i = 0; i < arr.length; i++){

            datos += arr[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, "Los datos ingresados son\n" + datos);
    }//fin del método mostrar nombres

}//FIN DE LA CLASE *****************************************************

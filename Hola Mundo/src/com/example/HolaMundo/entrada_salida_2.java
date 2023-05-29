package com.example.HolaMundo;
import javax.swing.JOptionPane;

public class entrada_salida_2 {

    public static void main(String[] args) {

        //Lo que el usuario ingrese en la ventana se almacena en nombre
        //el método .showInputDialog() devuelve un string
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String edad = JOptionPane.showInputDialog("Ingresa tu edad: ");

        //System.out.println(nombre + " tiene " + (int)edad + " años"); NO SE PUEDE CONVERTIR DE STRING A INT
        //INTEGER es una clase, usando Integer.parseInt(<string>) puedo hacer el cast a string
        System.out.println(nombre + " tiene " + Integer.parseInt(edad) + " años");
        System.out.println(2035 + (int)2035);
        String k =  new String("ok");
        System.out.println(k);
        k = "hola";
        System.out.println(k);
    }
}

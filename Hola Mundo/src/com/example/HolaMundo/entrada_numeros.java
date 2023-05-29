package com.example.HolaMundo;
import javax.swing.JOptionPane;

public class entrada_numeros {

    public static void main(String[] args) {

        double x = 10000;

        System.out.println(x/3);//imprime 3333.333333333335

        //vamos a formatear la salida
        //su usa printf para formatear
        //en "%1.2f" el 2 le da dos decimales al resultado luego de la coma
        System.out.printf("%1.2f",x/3);
        System.out.println("\n");

        //formatear la raiz cuadrada de valor
        String valor = JOptionPane.showInputDialog("Ingresa un valor para determinar su raíz cuadrada: ");
        double valor_aux = Double.parseDouble(valor);

        //si pongo println se da un salto de línea
        System.out.print("La raíz cuadrada de " + valor_aux + " es: ");
        System.out.printf("%1.3f", Math.sqrt(valor_aux));



    }

}

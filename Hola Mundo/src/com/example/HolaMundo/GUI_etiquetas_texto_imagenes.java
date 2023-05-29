package com.example.HolaMundo;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class GUI_etiquetas_texto_imagenes {
    public static void main(String[] args) {

    JLabel northlabel = new JLabel("North");

    ImageIcon labelicon = new ImageIcon("C:/Users/Usuario/Desktop/Programacion Java/Hola Mundo/src/com/example/HolaMundo/GUItip.gif");

    JLabel centerlabel = new JLabel(labelicon);

    JLabel southlabel = new JLabel(labelicon);

    southlabel.setText("South");

    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    application.add(northlabel, BorderLayout.NORTH);
    application.add(centerlabel, BorderLayout.CENTER);
    application.add(southlabel, BorderLayout.SOUTH);

    application.setSize(500,500);
    application.setVisible(true);

    }//fin del método de main
}

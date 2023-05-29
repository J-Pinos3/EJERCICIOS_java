package com.example.HolaMundo;
import java.util.Scanner;

public class Ejercicio_arrays_asientos_avion {
    public static void main(String[] args) {

        //ocupado = false inicialmente no están ocupados
        Scanner sc = new Scanner(System.in);
        boolean[] asientos = {false, false, false, false, false, false, false, false, false, false};


        for(int i = 0; i < asientos.length; i++){
            System.out.print("Bienvenido, ingrese el número de su asiento 1ra Clase<1-5>, 2da Clase<6-10>: ");
            int valor = sc.nextInt();
            if(asientos[valor-1] == true){//ese asiento ya está ocupado

                if(valor >= 1 && valor <= 5){//el USUARIO ESTABA EN PRIMERA CLASE Y VA A CAMBIAR A SEGUNDA
                    System.out.println("Desea cambiar de primera clase a clase económica?");
                    System.out.println("1) Si    -----    2) No");
                    System.out.print("> ");
                    int opcion = sc.nextInt();
                    if(opcion == 2){
                        System.out.println("\nEl siguiente vuelo sale en 10 horas");
                    }else{
                        System.out.println("\nAsientos libres en clase económica");
                        for(int claseEco = asientos.length/2; claseEco < asientos.length; claseEco++){
                            if(asientos[claseEco] == false){
                                System.out.println("asiento: " + (claseEco +1 ) + " está libre ");
                            }else{
                                System.out.println("asiento: " + (claseEco +1 ) + " está ocupado ");
                            }

                        }
                        System.out.print("Elija su asiento: ");
                        valor = sc.nextInt();
                        while(asientos[valor-1] == true || valor < 6 || valor > 10){
                            System.out.print("Elija su asiento: ");
                            valor = sc.nextInt();
                        }
                        asientos[valor-1] = true;//finalmente se asignó el asiento
                    }

                }else{//EL USUARIO ESTABA EN SEGUNDA CLASE Y VA A CAMBIAR A PRIMERA

                    System.out.println("Desea cambiar de clase económica a primera clase?");
                    System.out.println("1) Si    -----    2) No");
                    System.out.print("> ");
                    int opcion = sc.nextInt();
                    if(opcion == 2){
                        System.out.println("\nEl siguiente vuelo sale en 10 horas");
                    }else{
                        System.out.println("\nAsientos libres en primer clase");
                        for(int clasePriv = 0; clasePriv < asientos.length/2; clasePriv++){
                            if(asientos[clasePriv] == false){
                                System.out.println("asiento: " + (clasePriv +1 ) + " está libre ");
                            }else{
                                System.out.println("asiento: " + (clasePriv +1 ) + " está ocupado ");
                            }

                        }
                        System.out.print("Elija su asiento: ");
                        valor = sc.nextInt();
                        while(asientos[valor-1] == true || valor < 1 || valor > 5){
                            System.out.print("Elija su asiento: ");
                            valor = sc.nextInt();
                        }
                        asientos[valor-1] = true;//finalmente se asignó el asiento
                    }

                }


            //EL ASIENTO ESTPA DISPONIBLE
            }else{
                asientos[valor-1] = true;
            }




            System.out.println("\n\n\n------------------------------------------------------------------------------");
            if(valor >= 1 && valor <= 5){
                System.out.println("\nTICKET DE AVIÓN,\ntiene asignado el asiento: " + valor
                + " en Primera Clase");
            }else{
                System.out.println("\nTICKET DE AVIÓN,\ntiene asignado el asiento: " + valor
                        + " en Segunda Clase");
            }
            System.out.println("------------------------------------------------------------------------------\n\n\n");







        }
    }
}

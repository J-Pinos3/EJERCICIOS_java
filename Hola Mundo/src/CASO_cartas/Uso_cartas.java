package CASO_cartas;

public class Uso_cartas {
    public static void main(String[] args) {

    MAZO_Cartas myMazo = new MAZO_Cartas();
    myMazo.Barajar();

    for(int i = 1; i <= 52; i++){
        System.out.printf("%-20s", myMazo.repartirCarta());
        if(i % 4 == 0)
            System.out.println();
    }

    }//FIN DEL MÉTODO DE MAIN
}

package CASO_cartas;
import java.security.SecureRandom;

public class MAZO_Cartas {

    //atributos
    private Carta[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final  SecureRandom randomNumbers = new SecureRandom();

    //constructor
    public MAZO_Cartas(){
        String[] faces= {"Az", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
                        "Ocho", "Nueve", "Diez", "J", "Q", "K" };

        String[] suits = {"Corazones", "Diamantes", "Tréboles", "Espadas"};

        deck = new Carta[NUMBER_OF_CARDS];
        currentCard = 0;//primera carta
        for(int contador = 0; contador < deck.length; contador++){
            //contador%13 me da números del 0 al 12         contador/13 me da números del  0 al 3
            deck[contador] = new Carta( faces[contador%13], suits[contador/13] );
        }

    }


    //barajar las cartas
    public void Barajar(){
        currentCard = 0;
        for(int first = 0; first < deck.length; first++ ){
            //toma un valor entre 0 y 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Carta temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }

    }


    //repartir una carta
    public Carta repartirCarta(){
        if(currentCard < deck.length){
            return  deck[currentCard++];
        }else{
            return null;
        }
    }


}///fin de la clase MAZO_cartas





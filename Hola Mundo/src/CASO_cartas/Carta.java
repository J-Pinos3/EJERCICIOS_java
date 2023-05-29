package CASO_cartas;

public class Carta {

    private final String face;
    private final String suit;

    public Carta(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString(){
        return  face + " of " + suit;
    }


}

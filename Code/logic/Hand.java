package Code.logic;

import Code.deck.deck;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Hand> hand;

    public Hand(ArrayList<player> specificPlayer){

    }

    public void displayHand (ArrayList<player> user){//Borde verkligen vara i menu eller i hand(ifall jag skapar hadn)
        String temp = "";
        for(int i = 0;i<hand.size();i++){
            temp =+ hand.get(i).getName() + " ,";

        }
    }
}

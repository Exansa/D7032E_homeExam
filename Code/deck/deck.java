package Code.deck;

import Resources.english.Cards.baseCards;
import Resources.english.Cards.base.*;

import java.util.ArrayList;
import java.util.Collections;

public class deck {

    public static ArrayList<Card> deck = new ArrayList<Card>();
    // ArrayList<Deck> deck = new ArrayList<Deck>();

    public deck(int players){
        String expansion = menu1.getExpansion();

        JSONObject cardAmounts = baseCards.baseDeck(players);
        if (expansion == "menu"){
            for(int i = 0;0<cardAmounts.getInt("nope");i++){
                this.deck.add(new nopeCard());}

            for(int i = 0;0<cardAmounts.getInt("shuffle");i++){
                this.deck.add(new shuffleCard());}

            for(int i = 0;0<cardAmounts.getInt("seeTheFuture");i++){
                this.deck.add(new seeTheFutureCard());}

            for(int i = 0;0<cardAmounts.getInt("favor");i++){
                this.deck.add(new favorCard());}

            for(int i = 0;0<cardAmounts.getInt("hairypotato");i++){
                this.deck.add(new hairyPotatoCard());}

            for(int i = 0;0<cardAmounts.getInt("catterMelon");i++){
                this.deck.add(new catterMelonCard());}

            for(int i = 0;0<cardAmounts.getInt("rainbow");i++){
                this.deck.add(new rainbowCard());}

            for(int i = 0;0<cardAmounts.getInt("taco");i++){
                this.deck.add(new tacoCard());}

            for(int i = 0;0<cardAmounts.getInt("bikini");i++){
                this.deck.add(new bikiniCard());}

        }

    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);

    }

    public void insertCard(int deckIndex){

    }

    public void pullCard(){

    }

    public void displayCard(int nrOfCards){
        for(int i = 0;i<nrOfCards;i++){
            getCard();
            System.out.println("The" + i + "card is");
        }
    }

    public String getCard(int deckIndex){
        String cardName = "";
        //import card name
        return(cardName);
    }
}

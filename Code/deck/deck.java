package Code.deck;

import Resources.english.Cards.baseCards;
import Resources.english.Cards.base.*;

import java.util.ArrayList;
import java.util.Collections;

public class deck {

    public static ArrayList<Card> deck = new ArrayList<Card>();
    public boolean nope = false;
    // ArrayList<Deck> deck = new ArrayList<Deck>();

    public deck(int playerAmount){
        String expansion = menu1.getExpansion();

        JSONObject cardAmounts = baseCards.baseDeck(players);
        if (expansion == "menu"){
            for(int i = 0; 0<cardAmounts.getInt("nope");i++){
                this.deck.add(new NopeCard());}

            for(int i = 0; 0<cardAmounts.getInt("shuffle");i++){
                this.deck.add(new ShuffleCard());}

            for(int i = 0; 0<cardAmounts.getInt("seeTheFuture");i++){
                this.deck.add(new SeeTheFutureCard());}

            for(int i = 0; 0<cardAmounts.getInt("favor");i++){
                this.deck.add(new FavorCard());}

            for(int i = 0; 0<cardAmounts.getInt("hairypotato");i++){
                this.deck.add(new HairyPotatoCard());}

            for(int i = 0; 0<cardAmounts.getInt("catterMelon");i++){
                this.deck.add(new CatterMelonCard());}

            for(int i = 0; 0<cardAmounts.getInt("rainbow");i++){
                this.deck.add(new RainbowCard());}

            for(int i = 0; 0<cardAmounts.getInt("taco");i++){
                this.deck.add(new TacoCard());}

            for(int i = 0; 0<cardAmounts.getInt("bikini");i++){
                this.deck.add(new BikiniCard());}

            for(int i = 0; 0<(6 - playerAmount); i++){
                this.deck.add(new DefuseCard());}

            for(int i = 0; 0<(playerAmount-1)){
                this.deck.add(new ExplodeCard())};

        }

    }


    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public void insertCard(int deckIndex){

    }

    public static void drawCard(){

    }

    public void displayHand (ArrayList<deck> cards){//Borde verkligen vara i menu eller i hand(ifall jag skapar hadn)
        String temp = "";
        for(int i = 0;i<hand.size();i++){
            temp = hand.get(i).getName() + " ,";

        }
    }

    public String getCard(int deckIndex){
        String cardName = "";
        //import card name
        return(cardName);
    }
}

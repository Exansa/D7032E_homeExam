package Code.deck;

import Resources.english.Cards.baseCards;
import Resources.english.Cards.base.*;

import java.util.ArrayList;
import java.util.Collections;

public class deck {

    public static ArrayList<deck> cards = new ArrayList<deck>();
    public boolean nope = false;
    // ArrayList<Deck> deck = new ArrayList<Deck>();

    public deck(int playerAmount){
        String expansion = menu1.getExpansion();

        JSONObject cardAmounts = baseCards.baseDeck(players);
        if (expansion == "menu"){
            for(int i = 0; 0<cardAmounts.getInt("nope");i++){
                this.cards.add(new NopeCard());}

            for(int i = 0; 0<cardAmounts.getInt("shuffle");i++){
                this.cards.add(new ShuffleCard());}

            for(int i = 0; 0<cardAmounts.getInt("seeTheFuture");i++){
                this.cards.add(new SeeTheFutureCard());}

            for(int i = 0; 0<cardAmounts.getInt("favor");i++){
                this.cards.add(new FavorCard());}

            for(int i = 0; 0<cardAmounts.getInt("hairypotato");i++){
                this.cards.add(new HairyPotatoCatCard())}

            for(int i = 0; 0<cardAmounts.getInt("catterMelon");i++){
                this.cards.add(new CattermelonCatCard());}

            for(int i = 0; 0<cardAmounts.getInt("rainbow");i++){
                this.cards.add(new RainbowCatCard());}

            for(int i = 0; 0<cardAmounts.getInt("taco");i++){
                this.cards.add(new TacoCatCard());}

            for(int i = 0; 0<cardAmounts.getInt("bikini");i++){
                this.cards.add(new BikiniCatCard());}

            for(int i = 0; 0<(6 - playerAmount); i++){
                this.cards.add(new DefuseCard());}

            for(int i = 0; 0<(playerAmount-1)){
                this.cards.add(new ExplodeCard())};

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

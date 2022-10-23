package Code.deck;

import Code.logic.player;
import Resources.english.Cards.baseCards;
import Resources.english.Cards.base.*;
import Resources.english.Cards.cardAmounts;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class deck {

    private ArrayList<player> players;
    public static ArrayList<deck> cards = new ArrayList<deck>();
    public boolean nope = false;
    // ArrayList<Deck> deck = new ArrayList<Deck>();

    public deck(int playerAmount){
        String expansion = "base";
        HashMap<String, Integer> cardList;
        cardList = cardAmounts.cardAmount(expansion);

        for(int i = 0; 0<cardList.get("nope");i++){
            this.cards.add(new NopeCard());}

        for(int i = 0; 0<cardList.get("shuffle");i++){
            this.cards.add(new ShuffleCard());}

        for(int i = 0; 0<cardList.get("seeTheFuture");i++){
            this.cards.add(new SeeTheFutureCard());}

        for(int i = 0; 0<cardList.get("favor");i++){
            this.cards.add(new FavorCard());}

        for(int i = 0; 0<cardList.get("hairypotato");i++){
            this.cards.add(new HairyPotatoCatCard())}

        for(int i = 0; 0<cardList.get("catterMelon");i++){
            this.cards.add(new CattermelonCatCard());}

        for(int i = 0; 0<cardList.get("rainbow");i++){
            this.cards.add(new RainbowCatCard());}

        for(int i = 0; 0<cardList.get("taco");i++){
            this.cards.add(new TacoCatCard());}

        for(int i = 0; 0<cardList.get("bikini");i++){
            this.cards.add(new BikiniCatCard());}

        for(int i = 0; 0<(6 - playerAmount); i++){
            this.cards.add(new DefuseCard());}

        for(int i = 0; 0<(playerAmount-1)){
            this.cards.add(new ExplodeCard())};



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

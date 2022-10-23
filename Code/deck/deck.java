package Code.deck;

import Code.logic.player;
import Resources.english.Cards.base.*;
import Resources.english.Cards.card;
import Resources.english.Cards.cardAmounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class deck {

    private ArrayList<player> players;
    public static ArrayList<card> deck = new ArrayList<card>();
    public boolean nope = false;


    public deck(int playerAmount){
        this.deck = new ArrayList<>();
        String expansion = "base";
        HashMap<String, Integer> cardList = cardAmounts.cardAmount(expansion);

        for(int i = 0; 0<cardList.get("nope");i++){
            this.deck.add(new NopeCard());}

        for(int i = 0; 0<cardList.get("shuffle");i++){
            this.deck.add(new ShuffleCard());}

        for(int i = 0; 0<cardList.get("seeTheFuture");i++){
            this.deck.add(new SeeTheFutureCard());}

        for(int i = 0; 0<cardList.get("favor");i++){
            this.deck.add(new FavorCard());}

        for(int i = 0; 0<cardList.get("hairypotato");i++){
            this.deck.add(new HairyPotatoCatCard())}

        for(int i = 0; 0<cardList.get("catterMelon");i++){
            this.deck.add(new CattermelonCatCard());}

        for(int i = 0; 0<cardList.get("rainbow");i++){
            this.deck.add(new RainbowCatCard());}

        for(int i = 0; 0<cardList.get("taco");i++){
            this.deck.add(new TacoCatCard());}

        for(int i = 0; 0<cardList.get("bikini");i++){
            this.deck.add(new BikiniCatCard());}

        for(int i = 0; 0<(6 - playerAmount); i++){
            this.deck.add(new DefuseCard());}

        for(int i = 0; 0<(playerAmount-1); i++){
            this.deck.add(new ExplodeCard());
        }


    Collections.shuffle(this.deck);
    }


    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public void insertCard(int deckIndex){

    }

    public card drawCard(){
        return this.deck.remove(0);
    }

    public String getCard(int deckIndex){
        String cardName = "";
        //import card name
        return(cardName);
    }
}

package Code.deck;

import Code.logic.player;
import Resources.english.Cards.base.*;
import Resources.english.Cards.card;
import Resources.english.Cards.cardAmounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class deck {
    private ArrayList<card> cards;
    public boolean nope = false;


    public deck(int playerAmount){
        this.cards = new ArrayList<>();
        String expansion = "base";
        HashMap<String, Integer> cardList = cardAmounts.cardAmount(expansion);

        for(int i = 0; 0<cardList.get("nope");i++){
            this.cards.add(new NopeCard());}

        for(int i = 0; 0<cardList.get("shuffle");i++){
            this.cards.add(new ShuffleCard());}

        for(int i = 0; 0<cardList.get("seeTheFuture");i++){
            this.cards.add(new SeeTheFutureCard());}

        for(int i = 0; 0<cardList.get("favor");i++){
            this.cards.add(new FavorCard());}

        for(int i = 0; 0<cardList.get("hairypotato");i++){
            this.cards.add(new HairyPotatoCatCard());}

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

        for(int i = 0; 0<(playerAmount-1); i++){
            this.cards.add(new ExplodeCard());
        }


    Collections.shuffle(this.cards);
    }


    public void shuffleDeck(){

        Collections.shuffle(this.cards);
    }

    public void insertCard(int deckIndex){

    }

    public card getIndex(int index){
        return this.cards.get(index);
    }
    public card drawCard(){
        return this.cards.remove(0);
    }

    public String getCard(int deckIndex){
        String cardName = "";
        //import card name
        return(cardName);
    }

}

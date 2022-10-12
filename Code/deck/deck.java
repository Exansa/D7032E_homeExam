package Code.deck;

import java.util.Collections;

public class deck {
    private Cards cards[];

    public void createDeck(int players){
        if (players < 5) {
            this.cards = new Cards[];

            }
        } else{
            this.cards = new Cards[];
        }
        shuffleDeck();
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
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

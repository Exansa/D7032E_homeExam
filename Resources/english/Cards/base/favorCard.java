package Resources.english.Cards.base;

import Code.deck.deck;
import Resources.english.Cards.card;

import java.util.ArrayList;

public class favorCard implements card {

    @Override
    public void play() {
    }

    @Override
    public void action(ArrayList<deck> deck) {
        System.out.print("The next cards are" + (deck.get(deck.size()-1)) + "," + (deck.size()-2) + "," + (deck.size()-3));
    }
}

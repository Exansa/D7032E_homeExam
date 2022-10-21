package Resources.english.Cards.base;

import Resources.english.Cards.card;
import Code.deck.deck;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCard implements card {
    ArrayList<deck> deck = new ArrayList<deck>();

    @Override
    public void play() {
        Collections.shuffle(this.deck);
    }

    @Override
    public String getName() {
        return "Shuffle";
    }

    @Override
    public String getDescription() {
        return "Shuffles the deck";
    }
}

package Resources.english.Cards.base;

import Resources.english.Cards.card;
import Code.deck.deck;

import java.util.ArrayList;
import java.util.Collections;

public class shuffleCard implements card {
    ArrayList<deck> deck = new ArrayList<deck>();

    @Override
    public void play() {
        Collections.shuffle(this.deck);
    }
}

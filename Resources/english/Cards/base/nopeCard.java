package Resources.english.Cards.base;

import Code.deck.deck;
import Resources.english.Cards.card;

import java.util.ArrayList;
import java.util.Collections;

public class nopeCard implements card {
    ArrayList<Code.deck.deck> deck = new ArrayList<deck>();

    @Override
    public void play() {
        Collections.shuffle(this.deck);
    }
}

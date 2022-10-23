package Resources.english.Cards.base;

import Code.logic.gameState;
import Resources.english.Cards.card;
import Code.deck.deck;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCard implements card {

    @Override
    public void play(gameState state) {
        deck.shuffleDeck();
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

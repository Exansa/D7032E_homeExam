package Resources.english.Cards.base;

import Code.deck.deck;
import Code.logic.gameState;
import Resources.english.Cards.card;

import java.util.ArrayList;

public class SeeTheFutureCard implements card {

    @Override
    public void play(gameState state) {
        System.out.print("The next cards are" + (deck.deck.get(0)) + "," + (deck.deck.get(1)) + "," + (deck.deck.get(2)));
    }

    @Override
    public String getName() {
        return "See the future";
    }

    @Override
    public String getDescription() {
        return "See the next three cards in the deck";
    }
}

package Resources.english.Cards.base;

import Code.deck.deck;
import Code.logic.gameState;
import Resources.english.Cards.card;

import java.util.ArrayList;

public class SeeTheFutureCard implements card {

    @Override
    public void play(gameState state, String text) {
        System.out.print("The next cards are" + (state.getCard(0).getName()) + ","
                                              + (state.getCard(1).getName()) + ","
                                              + (state.getCard(2).getName()));
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

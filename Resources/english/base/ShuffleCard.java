package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class ShuffleCard implements card {

    @Override
    public void play(gameState state, String text) {
        state.shuffleCurrentDeck();
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

package Resources.english.Cards.base;

import Code.logic.gameState;
import Code.deck.deck;
import Resources.english.Cards.card;

public class SkipCard implements card{
    @Override
    public void play(gameState state, String text) {

        state.endTurn(false);
    }

    @Override
    public String getName() {
        return "Skip";
    }

    @Override
    public String getDescription() {
        return "Skips drawing one turn and ends turn";
    }
}

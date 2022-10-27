package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

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

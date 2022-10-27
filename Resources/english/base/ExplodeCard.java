package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class ExplodeCard implements card{
    @Override
    public void play(gameState state, String text) {
        if(state.getCurrentPlayer().getDefuse()){

        } else {
            state.kill();
        }
    }

    @Override
    public String getName() {
        return "Exploding kitten";
    }

    @Override
    public String getDescription() {
        return "If you don't defuse it you explode!";
    }
}

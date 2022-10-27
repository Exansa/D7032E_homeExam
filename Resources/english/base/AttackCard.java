package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;
public class AttackCard implements card{

    @Override
    public void play(gameState state, String text) {
        int targetID = Integer.parseInt(text);
        state.addExtraTurn(2);
        state.endTurn(false);
    }

    @Override
    public String getName() {
        return "Attack";
    }

    @Override
    public String getDescription() {
        return "Forces a player to take two turns";
    }
}

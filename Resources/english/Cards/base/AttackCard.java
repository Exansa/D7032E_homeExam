package Resources.english.Cards.base;

import Code.deck.deck;
import Code.logic.gameState;
import Code.logic.player;
import Resources.english.Cards.card;
public class AttackCard implements card{

    @Override
    public void play(gameState state, String text) {
        state.addExtraTurn(2, text);
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

package Resources.english.Cards.base;

import Code.deck.deck;
import Code.logic.gameState;
import Resources.english.Cards.card;
public class AttackCard implements card{

    @Override
    public void play(gameState state) {

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

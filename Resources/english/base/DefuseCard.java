package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class DefuseCard implements card{
    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Defuse";
    }

    @Override
    public String getDescription() {
        return "Needed to stop the exploding kitten!";
    }
}

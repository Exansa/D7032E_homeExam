package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class NopeCard implements card {


    @Override
    public void play(gameState state, String text) {
    }

    @Override
    public String getName() {
        return "Nope";
    }

    @Override
    public String getDescription() {
        return "Negates an action";
    }
}

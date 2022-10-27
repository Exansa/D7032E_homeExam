package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class BikiniCatCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Overweight bikini cat";
    }

    @Override
    public String getDescription() {
        return "This cat is in weekend mode! Can combo!";
    }
}

package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class RainbowCatCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Rainbow ralphing cat";
    }

    @Override
    public String getDescription() {
        return "So fabulous! Can combo!";
    }
}

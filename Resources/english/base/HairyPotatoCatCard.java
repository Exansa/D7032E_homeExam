package Resources.english.base;

import Code.logic.gameState;
import Resources.Cards.card;

public class HairyPotatoCatCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Hairy potato cat";
    }

    @Override
    public String getDescription() {
        return "Hairy yet delish! Can combo!";
    }
}

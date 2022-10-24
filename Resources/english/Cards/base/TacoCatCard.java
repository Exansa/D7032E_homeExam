package Resources.english.Cards.base;

import Code.logic.gameState;
import Resources.english.Cards.card;

public class TacoCatCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Taco cat";
    }

    @Override
    public String getDescription() {
        return "Loves Tuesdays! Can combo!";
    }
}

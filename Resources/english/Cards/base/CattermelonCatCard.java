package Resources.english.Cards.base;

import Code.logic.gameState;
import Resources.english.Cards.card;

public class CattermelonCatCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {

        return "Cattermelon";
    }

    @Override
    public String getDescription() {

        return "A juicy and cuddly hybrid! Can combo!";
    }
}
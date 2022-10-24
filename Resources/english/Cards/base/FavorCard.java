package Resources.english.Cards.base;

import Code.logic.gameState;
import Resources.english.Cards.card;

public class FavorCard implements card {

    @Override
    public void play(gameState state, String text) {

    }

    @Override
    public String getName() {
        return "Favor";
    }

    @Override
    public String getDescription() {
        return "Make a player give you a card";
    }

}

package Resources.english.Cards;

import Code.deck.deck;
import Code.logic.gameState;

import java.util.ArrayList;

public interface card {
    public void play(gameState state, String text);

    public String getName();

    public String getDescription();

}

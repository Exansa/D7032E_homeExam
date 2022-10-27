package Resources.Cards;

import Code.logic.gameState;

public interface card {
    public void play(gameState state, String text);

    public String getName();

    public String getDescription();

}

package Resources.english.Cards.base;

import Code.logic.gameState;
import Code.logic.player;
import Resources.english.Cards.card;

public class FavorCard implements card {
    private player target;
    @Override
    public void play(gameState state, String text) {
        int targetID = Integer.parseInt(text);
        target = state.targetPlayer(targetID);
        sendMessage("Your hand: " + target.getHand());
        sendMessage("Give a card to Player " + state.getCurrentPlayer().getPlayerID());

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

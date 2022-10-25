package Resources.english.Cards.base;

import Code.logic.gameState;
import Code.logic.player;
import Code.menu.message;
import Resources.english.Cards.card;

public class FavorCard implements card {
    private player target;
    @Override
    public void play(gameState state, String text) {
        int targetID = Integer.parseInt(text);
        target = state.targetPlayer(targetID);
        message.sendMessage("Your hand: " + target.getHand());
        message.sendMessage("Give a card to Player " + state.getCurrentPlayer().getPlayerID());
        if(target.getHand().get(target.getSpecificCard("favor")).getName() == "favor"){

        }

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

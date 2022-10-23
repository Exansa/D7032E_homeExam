package Resources.english.Cards.base;

import Code.logic.gameState;
import Code.logic.player;
import Resources.english.Cards.card;

import java.util.ArrayList;

public class ExplodeCard implements card{
    private ArrayList<player> players;
    @Override
    public void play(gameState state) {
        if(this.players.get(0).getDefuse()){

            state.kill();
        }

    }

    @Override
    public String getName() {
        return "Exploding kitten";
    }

    @Override
    public String getDescription() {
        return "If you don't defuse it you explode!";
    }
}

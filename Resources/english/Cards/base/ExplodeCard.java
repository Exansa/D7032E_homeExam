package Resources.english.Cards.base;

import Code.logic.gameState;
import Resources.english.Cards.card;

public class ExplodeCard implements card{
    @Override
    public void play() {
        new gameState.kill(this.players);
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

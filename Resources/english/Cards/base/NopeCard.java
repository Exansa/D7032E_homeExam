package Resources.english.Cards.base;

import Code.deck.deck;
import Resources.english.Cards.card;

import java.util.ArrayList;

public class NopeCard implements card {


    @Override
    public void play() {

    }

    @Override
    public String getName() {
        return "Nope";
    }

    @Override
    public String getDescription() {
        return "Negates an action";
    }
}

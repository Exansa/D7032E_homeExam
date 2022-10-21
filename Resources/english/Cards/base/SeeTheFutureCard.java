package Resources.english.Cards.base;

import Code.deck.deck;
import Resources.english.Cards.card;

public class SeeTheFutureCard implements card {

    @Override
    public void play() {
        System.out.print("The next cards are" + (deck.get(0)) + "," + (deck.get(1)) + "," + (deck.get(2)));
    }

    @Override
    public String getName() {
        return "See the future";
    }

    @Override
    public String getDescription() {
        return "See the next three cards in the deck";
    }
}

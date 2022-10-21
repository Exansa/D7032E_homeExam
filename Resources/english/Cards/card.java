package Resources.english.Cards;

import Code.deck.deck;

import java.util.ArrayList;

public interface card {
    public void play();

    void action(ArrayList<deck> deck);
    //public void action();
}

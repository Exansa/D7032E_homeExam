package Resources.english.Cards.base;

import Resources.english.Cards.catCards;

public class TacoCatCard implements catCards {

    @Override
    public String getCatName() {
        return "Taco cat";
    }

    @Override
    public String getCatDescription() {
        return "Loves Tuesdays! Can combo!";
    }
}

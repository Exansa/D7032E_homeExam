package Resources.english.Cards;

import java.util.ArrayList;

public class baseCards {
    private ArrayList<Cards> baseDeck = ArrayList<Cards>;
    private String name;
    private String description;

    private Effect explode;
    private Effect nope;
    private Effect shuffle;
    private Effect skip;

    private Effect attack;

    private Effect seeTheFuture;
    private Effect favor;

    private Effect combo;

    public baseCards(String name, String description, Effect effect){
        this.name = name;
        this.description = description;
        this.effect = effect;
    }

    public ArrayList<Cards> baseDeck(int players){
        addNope();
        addShuffle();
        addSkip();
        for(int i = 1; i<players ; i++){
            addExplode();
        }
        return baseDeck;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public void addExplode(){
        baseDeck.add(new baseCards("Exploding kitten","Fast! Play nope!", explode));
        baseDeck.add(new baseCards("Exploding kitten","Fast! Play nope!", explode));
        baseDeck.add(new baseCards("Exploding kitten","Fast! Play nope!", explode));
        baseDeck.add(new baseCards("Exploding kitten","Fast! Play nope!", explode));
    }

    public void addNope(){
        baseDeck.add(new baseCards("Nope","Stops one exploding kitten", nope));
        baseDeck.add(new baseCards("Nope","Stops one exploding kitten", nope));
        baseDeck.add(new baseCards("Nope","Stops one exploding kitten", nope));
        baseDeck.add(new baseCards("Nope","Stops one exploding kitten", nope));
        baseDeck.add(new baseCards("Nope","Stops one exploding kitten", nope));
    }

    public void addShuffle(){
        baseDeck.add(new baseCards("Shuffle", "Shuffles the deck", shuffle));
        baseDeck.add(new baseCards("Shuffle", "Shuffles the deck", shuffle));
        baseDeck.add(new baseCards("Shuffle", "Shuffles the deck", shuffle));
        baseDeck.add(new baseCards("Shuffle", "Shuffles the deck", shuffle));
    }

    public void addSkip(){
        baseDeck.add(new baseCards("Skip","Skips turn without drawing",skip));
    }

    public void addAttack(){
        baseDeck.add(new baseCards("Attack", "Forces next player to draw 2 cards", attack));
        baseDeck.add(new baseCards("Attack", "Forces next player to draw 2 cards", attack));
        baseDeck.add(new baseCards("Attack", "Forces next player to draw 2 cards", attack));
        baseDeck.add(new baseCards("Attack", "Forces next player to draw 2 cards", attack));
    }

    public void addSeeTheFuture(){
        baseDeck.add(new baseCards("See the future","Shows the top 3 cards",seeTheFuture));
        baseDeck.add(new baseCards("See the future","Shows the top 3 cards",seeTheFuture));
        baseDeck.add(new baseCards("See the future","Shows the top 3 cards",seeTheFuture));
        baseDeck.add(new baseCards("See the future","Shows the top 3 cards",seeTheFuture));
        baseDeck.add(new baseCards("See the future","Shows the top 3 cards",seeTheFuture));
    }

    public void addFavor(){
        baseDeck.add(new baseCards("Favor", "Makes a player give you 1 card", favor));
        baseDeck.add(new baseCards("Favor", "Makes a player give you 1 card", favor));
        baseDeck.add(new baseCards("Favor", "Makes a player give you 1 card", favor));
        baseDeck.add(new baseCards("Favor", "Makes a player give you 1 card", favor));
    }

    public void addHairyPotato(){
        baseDeck.add(new baseCards("Hairy potato cat","A little too hairy", combo));
        baseDeck.add(new baseCards("Hairy potato cat","A little too hairy", combo));
        baseDeck.add(new baseCards("Hairy potato cat","A little too hairy", combo));
        baseDeck.add(new baseCards("Hairy potato cat","A little too hairy", combo));
    }

    public void addCattermelon(){
        baseDeck.add(new baseCards("Cattermelon","Refreshing cuddling", combo));
        baseDeck.add(new baseCards("Cattermelon","Refreshing cuddling", combo))
        baseDeck.add(new baseCards("Cattermelon","Refreshing cuddling", combo))
        baseDeck.add(new baseCards("Cattermelon","Refreshing cuddling", combo))
    }

    public void addRainbow(){
        baseDeck.add(new baseCards("Rainbow ralphing cat", "The most fabulous cat", combo));
        baseDeck.add(new baseCards("Rainbow ralphing cat", "The most fabulous cat", combo));
        baseDeck.add(new baseCards("Rainbow ralphing cat", "The most fabulous cat", combo));
        baseDeck.add(new baseCards("Rainbow ralphing cat", "The most fabulous cat", combo));
    }

    public void addTaco(){
        baseDeck.add(new baseCards("Taco Cat","Hates taco tuesdays", combo));
        baseDeck.add(new baseCards("Taco Cat","Hates taco tuesdays", combo));
        baseDeck.add(new baseCards("Taco Cat","Hates taco tuesdays", combo));
        baseDeck.add(new baseCards("Taco Cat","Hates taco tuesdays", combo));
    }

    public void addBikini(){
        baseDeck.add(new baseCards("Overweight bikini cat","Atleast it isn't string", combo));
        baseDeck.add(new baseCards("Overweight bikini cat","Atleast it isn't string", combo);
        baseDeck.add(new baseCards("Overweight bikini cat","Atleast it isn't string", combo);
        baseDeck.add(new baseCards("Overweight bikini cat","Atleast it isn't string", combo);
    }


}

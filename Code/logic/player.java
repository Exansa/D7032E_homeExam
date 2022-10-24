package Code.logic;

import Resources.english.Cards.card;


import java.util.ArrayList;

public class player {
    private ArrayList<card> hand = new ArrayList<card>();
    private String name;
    int extraTurn;
    private boolean isAlive;


    public player(String name){
        this.name = name;
        this.isAlive = true;
        this.extraTurn = 0;

        this.hand = new ArrayList<>();
    }

    public String cardsToString() {
        String handMessage = "";
        if (this.hand.size() == 0)
            return "No cards on hand";
        for (int i = 0; i < this.hand.size(); i++) {
            handMessage += "\t[" + i + "] " + this.hand.get(i) + " ";
        }
        return handMessage;
    }

    public String displayHand(){
        String handInfo = "";
        if (0<this.hand.size()){
            for (int i = 0; i < this.hand.size(); i++) {
                handInfo += " " + this.hand.get(i).getName();
            }
            return handInfo;
        } else {
            return "No cards in your hand";
        }
    }

    public ArrayList<card> getHand(){
        return this.hand;
    }
    public boolean getDefuse(){
        for(int i = 0; i < this.hand.size();i++){
            if(this.hand.get(i).getName() == "defuse"){
                return true;
            }
        }
        return false;
    }

    public void setExtraTurn(int extraTurn) {
        this.extraTurn = extraTurn;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsAlive(){
        this.isAlive = !(this.isAlive);
    }

    public String getName(){
        return this.name;
    }
    public int getExtraTurn(){
        return this.extraTurn;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

}

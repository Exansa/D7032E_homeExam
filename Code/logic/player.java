package Code.logic;

import Resources.english.Cards.card;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class player {
    private ArrayList<card> hand = new ArrayList<card>();
    private int playerID;
    private boolean bot;
    private boolean isAlive;
    private ObjectInputStream inFromClient;
    private ObjectOutputStream outToClient;



    public player(int playerID, boolean bot, Socket connection, ObjectInputStream inFromClient, ObjectOutputStream outToClient){
        this.playerID = playerID;
        this.bot = bot;
        this.inFromClient = inFromClient;
        this.outToClient = outToClient;

        this.isAlive = true;
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
    public boolean getDefuse() {
        int cardIndex = getSpecificCard("defuse");
        if(cardIndex == -1){
            return false;
        }else{
            return true;
        }
    }

    public int getSpecificCard(String name){
        for(int i = 0; i < this.hand.size();i++){
            if(this.hand.get(i).getName() == name){
                return i;
            }
        }
        return -1;
    }


    public void setIsAlive(){
        this.isAlive = !(this.isAlive);
    }

    public void setInFromClient(ObjectInputStream inFromClient) {
        this.inFromClient = inFromClient;
    }

    public void setOutToClient(ObjectOutputStream outToClient) {
        this.outToClient = outToClient;
    }

    public int getPlayerID(){
        return this.playerID;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public ObjectOutputStream getOutToClient() {
        return outToClient;
    }

    public ObjectInputStream getInFromClient() {
        return inFromClient;
    }
}

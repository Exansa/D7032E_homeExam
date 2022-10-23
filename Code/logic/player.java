package Code.logic;

import Resources.english.Cards.card;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class player {
    private ArrayList<card> hand = new ArrayList<card>();
    private String name;
    private int ID;
    private Socket connection;
    private BufferedReader inFromClient;
    private DataOutputStream outToClient;
    private boolean isAlive;


    public player(String name){
        this.name = name;
        this.isAlive = true;
        this.connection = null;
        this.inFromClient = null;
        this.outToClient = null;

        Hand hand;
    }

    public String cardsToString() {
        String handMessage = "";
        if (hand.size() == 0)
            return "[NO CARDS]:";
        for (int i = 0; i < hand.size(); i++) {
            handMessage += "\t[" + i + "] " + hand.get(i) + ":";
        }
        return handMessage;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsAlive(){
        this.isAlive = !(this.isAlive);
    }

    public void setConnection(Socket socket){
        this.connection = socket;
    }

    public void setInFromClient(BufferedReader reader){
        this.inFromClient = reader;
    }

    public void setOutToClient(DataOutputStream outTo){
        this.outToClient = outTo;
    }

    public String getName(){
        return this.name;
    }

    public BufferedReader getInFromClient() {
        return this.inFromClient;
    }

    public DataOutputStream getOutToClient() {
        return this.outToClient;
    }

    public Socket getConnection(){
        return this.connection;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public int getID(){
        return ID;
    }
}

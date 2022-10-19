package Code.logic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class player {
    private ArrayList<Hand> hand = new ArrayList<Hand>();
    private boolean isAlive = true;
    private String name;
    private Socket connection;
    private BufferedReader inFromClient;
    private DataOutputStream outToClient;

    public player(String name){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsAlive(boolean status){
        this.isAlive = status;
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
}

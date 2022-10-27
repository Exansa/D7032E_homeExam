package Code.network;

import Code.logic.player;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class server {
    private ArrayList<player> players;
    private Socket socket;
    private ServerSocket serverSocket;
    public server(int numberPlayers, int numberOfBots,String language) throws Exception {
        if(numberPlayers+numberOfBots>5){
            //går ej
        }
        players.add(new player(0, false, null, null, null)); //add this instance as a player
        //Open for connections if there are online players
        for(int i=0; i<numberOfBots; i++) {
            players.add(new player(i+1, true, null, null, null)); //add a bot
        }
        if(numberPlayers>1)
            serverSocket = new ServerSocket(2048);
        for(int i=numberOfBots+1; i<numberPlayers+numberOfBots; i++) {
            Socket connectionSocket = serverSocket.accept();
            ObjectInputStream inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
            ObjectOutputStream outToClient = new ObjectOutputStream(connectionSocket.getOutputStream());
            players.add(new player(i, false, connectionSocket, inFromClient, outToClient)); //add an online client
            System.out.println("Connected to player " + i);
            outToClient.writeObject("You connected to the server as player " + i + "\n");
        }
    }
}

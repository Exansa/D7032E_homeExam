package Code.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class server {
    private ArrayList<Players> players;

    public server(ArrayList<Players> players){
        this.players = players;
    }

    public void connectToClient() throws IOException{
        try{
            ServerSocket serverSocket = new ServerSocket(2048);
            for(int clients = 0; clients < 5;clients++){
                Socket clientSocket = serverSocket.accept();
                BufferedReader inFromClient = new BufferedReader(
                    new InputStreamReader(serverSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(serverSocket.getOutputStream());
                outToClient.writeBytes("You are player" + this.players.get(clients).getID());

                this.players.get(clients).setConnection(serverSocket);
                this.players.get(clients).setInFromClient(inFromClient);
                this.players.get(clients).setOutToClient(outToClient);
            }

        } catch (IOException Error){
            System.out.println("Error: Connection was not established" + Error);
        }
    }
}

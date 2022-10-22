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

    public server(ArrayList<Players> players, int bots) throws IOException {
        this.players = players;
        if(players.size() + bots < 2 || players.size() +bots > 5) {
            networkClient_start.newSocket = new ServerSocket(2048);
            players.add(new logic.Player(0, false, null, null, null));
            for (int i = 0; i < bots; i++) {
                players.add(new logic.Player(i + 1, true, null, null, null));
            }
        }
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

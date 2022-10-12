package Code.network;

import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ThreadLocalRandom;

public class networkClient_start {
    private ClientConnection clientConnection;

    public networkClient_start(boolean bot) throws IOException{
        clientConnection = new ClientConnection(bot);
        connectToNetwork();
    }

    private void connectToNetwork() throws IOException{
        String clientName = "";
        Random random = ThreadLocalRandom.current();

        try{
            Socket newSocket = new Socket("localhost", 2048);
            DataOutputStream outputNetwork = new DataOutputStream(newSocket.getOutputStream());
            BufferedReader inputNetwork = new BufferedReader(new InputStreamReader(newSocket.getInputStream()));
            clientName = inputNetwork.readLine();
            System.out.println("Connection established");
            clientConnection.serverCommunication(random, outputNetwork, inputNetwork);

        } catch(IOException error){
            System.out.println("Error: Could not establish a connection" + error);
        }
    }

    public static void main(String argN[]) throws IOException{
        if(argN.length != 0){
            new networkClient_start(true);
        } else{
            new networkClient_start(false);
        }
    }
}

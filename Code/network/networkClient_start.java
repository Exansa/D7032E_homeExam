package Code.network;

import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ThreadLocalRandom;

public class networkClient_start {
    private networkClient client;

    public networkClient_start(boolean bot) throws IOException{
        client = new networkClient(bot);
        connectToNetwork();
    }

    private void connectToNetwork() throws IOException{
        String clientName = "";
        Random random = ThreadLocalRandom.current();

        try{
            Socket newSocket = new Socket("localhost", 2048);
            DataOutputStream outFromServer = new DataOutputStream(newSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(newSocket.getInputStream()));
            clientName = inFromServer.readLine();
            System.out.println("Connection established");
            client.serverCommunication(random, outFromServer, inFromServer);

        } catch(IOException Error){
            System.out.println("Error: Could not establish a connection" + Error);
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

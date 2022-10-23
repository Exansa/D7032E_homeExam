package Code.network;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class networkClient {
    private boolean bot;
    private Scanner scanner = new Scanner(System.in);

    public networkClient(boolean bot){
        this.bot = bot;
    }

    public void serverCommunication(Random random,DataOutputStream outFromServer,BufferedReader inFromServer) throws IOException{
        while (true){
            String[] message = inFromServer.readLine().split(":");
            for(int i = 0; i < message.length;i++){
                System.out.println(message[i].toString());
            }
        }
    }
    private void attackMessage(DataOutputStream outToServer) throws IOException{

    }

}

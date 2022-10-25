package Code.menu;

import Code.logic.player;

import java.util.ArrayList;
import java.util.Scanner;

public class message {
    ArrayList<player> players;
    Scanner scanner;

    public message(ArrayList<player> players, Scanner scanner){
        this.players = players;
        this.scanner = scanner;
    }
    public String sendMessage(player target,Object message){
        String tempMessage = "";
        player recipient = target;

        try{
            recipient.getOutToClient().writeObject(message);
            tempMessage = recipient.getInFromClient().readLine();
        } catch(Exception e){
        }
        return tempMessage;
    }
}

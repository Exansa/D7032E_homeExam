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
    public String sendMessage(String name,String message){
        String tempMessage = "";
        int playerIndex = 0;
        for(int i = 0; i < this.players.size();i++){
            if(this.players.get(i).getName() == name){
                playerIndex = i;
                break;
            }
        }
        player recipient = players.get(playerIndex);
        try{
            recipient.getOutToClient().writeBytes(message);
            tempMessage = recipient.getInFromClient().readLine();
        } catch(Exception e){
        }
        return tempMessage;
    }
}

package Code.menu;

import Code.logic.player;

public class message {

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

package Code.logic;

import Code.deck.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameState {
    private ArrayList<player> players;
    public static int dead;
    private Scanner scanner;


    public gameState(){
        this.players = players;
        gameStart();
    }

    private void gameStart(){
        dead = 0;

    }

    public void endTurn(boolean draw){
        if(draw){
            deck.drawCard();
            Collections.rotate(this.players, 1);
            nextPlayer(this.players);
        } else if (!draw){
            nextPlayer(this.players);
        }
    }

    private void nextPlayer(ArrayList<player> currentPlayer){
        if(attack > 0){
            this.currentPlayer = currentPlayer;
        } else{
            Collections.rotate(players, -1);
            this.currentPlayer = players.get(1);
        }
    }
    public void playerTurn(){
        hasWon();
        if(this.players.getAlive()){
            //call controller here
        } else {
            System.out.print("You are dead and your turn will be skipped");
            nextPlayer();
        }
        endTurn(true);
    }

    public void kill(ArrayList<player> targetPlayer){
        dead++;
        this.player.setIsAlive(false);
    }
    public void hasWon(){
        if(dead<=players.size()){
            for(int i = 0; i < players.size();i++){
                if(player.get(i).getAlive()){
                    System.out.print("Congratulations player "+ this.players.getID() +"!" );
                    System.exit(0);
                }
            }
        }
    }
}

package Code.logic;

import Code.deck.deck;
import Resources.english.Cards.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameState {
    private ArrayList<player> players;
    public static int dead;
    private int extraTurn;
    private boolean isAlive;
    private deck currentDeck;
    private player currentPlayer;


    public gameState(int playerAmount){
        this.players = new ArrayList<>();
        this.currentDeck = new deck(playerAmount);
        gameStart();
    }

    private void gameStart(){
        dead = 0;

    }

    public void endTurn(boolean draw){
        if(draw){
            this.currentDeck.drawCard();
            Collections.rotate(this.players, 1);
            nextPlayer();
        } else if (!draw){
            nextPlayer();
            card card = this.currentDeck.drawCard();
        }
    }

    private void nextPlayer(){
        if(extraTurn > 0){
            this.currentPlayer = this.players.get(0);
            extraTurn--;
        } else{
            Collections.rotate(players, -1);
            this.currentPlayer = this.players.get(0);
        }
    }
    public void playerTurn(){
        hasWon();
        if(this.players.get(0).getIsAlive()){
            //call controller here
        } else {
            System.out.print("You are dead and your turn will be skipped");
            nextPlayer();
        }
        endTurn(true);
    }

    public void kill(){
        this.currentPlayer.setIsAlive();
        dead++;
    }
    public void hasWon(){
        if(dead<=players.size()){
            for(int i = 0; i < players.size();i++){
                if(this.players.get(i).getIsAlive()){
                    System.out.print("Congratulations player "+ this.players.get(0).getID() +"!" );
                    System.exit(0);
                }
            }
        }
    }
}

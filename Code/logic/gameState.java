package Code.logic;

import Code.deck.deck;
import Resources.english.Cards.base.DefuseCard;
import Resources.english.Cards.base.ExplodeCard;
import Resources.english.Cards.card;

import java.util.ArrayList;
import java.util.Collections;

public class gameState {
    private ArrayList<player> players;
    private static int dead;
    private int extraTurn;
    private boolean isAlive;
    private deck currentDeck;
    private player currentPlayer;
    private gameState state;


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
            if(this.currentPlayer.getHand().get(0) instanceof ExplodeCard){
                this.currentPlayer.getHand().get(0).play(state, null);
            }
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
        if(this.players.get(0).getIsAlive()){
            hasWon();
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

    public player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public void shuffleCurrentDeck() {
        this.currentDeck.shuffleDeck();
    }


    public card getCard(int index){
        return this.currentDeck.getIndex(index);
    }

    public void addExtraTurn(int amount){
                this.extraTurn += amount;
    }

    public player targetPlayer(int targetID){
        for(int i = 0; i < this.players.size();i++){
            if(this.players.get(i).getPlayerID() == targetID){
                return this.players.get(i);
            }
        }
        return null;
    }
    public void hasWon(){
        if(dead==(players.size()-1)){
            for(int i = 0; i < players.size();i++){
                if(this.players.get(i).getIsAlive()){
                    System.out.print("Congratulations "+ this.players.get(0).getPlayerID() +" you won!" );
                    System.exit(0);
                }
            }
        }
    }
}

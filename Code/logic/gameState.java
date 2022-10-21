package Code.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class gameState {
    private ArrayList<Players> players;
    public static int dead;
    private Scanner scanner;
    private SendMessage sendMessage;
    private Won won;

    Deck deck;

    public gameState(){
        this.players = players;
        gameStart();
    }

    private void gameStart(){
        Players player1 = new Players("player1");
        Players player2 = new Players("player2");
        Players player3 = new Players("player3");
        Players player4 = new Players("player3");
        Players player5 = new Players("player3");
        this.Players.add(player1);
        this.Players.add(player2);
        this.Players.add(player3);
        this.Players.add(player4);
        this.Players.add(player5);
        scanner = new Scanner(System.in);
        sendMessage = new SendMessage(players, scanner);
        won = new Won(players, sendMessage);

        deck = new Deck(sendMessage);
    }

    public void playerTurn(){
        for(int i = 0; i < players.size(); i++){
            Players currentPlayer = players.get(i);
        }
        winning.hasWon();
    }
}

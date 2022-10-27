package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import Code.logic.player.*;
import Resources.english.base.DefuseCard;
import Code.ExplodingKittens;
import Code.deck.deck.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Code.logic.gameState;
import Code.logic.player;

public class ExplodingKittensTests {
    private ArrayList<player> players;

    /*
     * This is not a functioning junit due to the software not working
     * This is a outline of how i plan to test it
     * 
     * 
     * 
     * 
     */

    //Requirement 1
    @Test
    void playerAmountTest(){
        players.add(new player(0, true, null, null, null));
        players.add(new player(1, true, null, null, null));
        assertEquals(2, players.size());
        players.add(new player(1, true, null, null, null));
        players.add(new player(1, true, null, null, null));
        players.add(new player(1, true, null, null, null));
        assertEquals(5, players.size());
    }

    //Requirement 2
    @Before
    ExplodingKittens test = new ExplodingKittens(["2", "base", "english"]);
    @Test
    int nrOfDefuse;
    for (int i = 0; i < players.size(); i++){
        if(this.hand.contains(DefuseCard)){
            nrOfDefuse++;
        }
    }
    assertEquals(2,nrOfDefuse);

    //Requirement 3
    @Test
    ArrayList<deck> testDeck1 = new deck(3, base, english);
    assertEquals(48,testDeck.size());

    ArrayList<deck> testDeck2 = new deck(5, base, english);
    assertEquals(47,testDeck.size());

    //Requirement 4
    @Before
   
    @Test

    //Requirement 5
    @Before
    ExplodingKittens testDeck = new ExplodingKittens(["2", "base", "english"]);
    @Test
    int nrOfFullHands;
    for (int i = 0; i < test.deck.size(); i++){
        if(this.test.deck.get(i).getName() == "Explode"){
            nrOfFullHands++;
        }
    }
    @After

    //Requirement 6
    @Before
    ExplodingKittens testHand = new ExplodingKittens(["2", "base", "english"]);
    @Test
    int nrOfExplodingKittens;
    for (int i = 0; i < test.players.size(); i++){
        if(this.test.deck.get(i).getName() == ExplodeCard){
            nrOfExplodingKittens++;
        }
    }
    assertEquals(2,nrOfExplodingKittens);


    //Requirement 7
    @Before

    @Test

    //Requirement 8
    @Before
    ExplodingKittens testTurn1 = new ExplodingKittens(["2", "base", "english"]);
    player playerRun1 = getCurrentPlayer();
    ExplodingKittens testTrun2 = new ExplodingKittens(["2", "base", "english"]);
    @Test
    assertNotEquals(playerRun1, getCurrentPlayer());


    //Requirement 9
    @Before

    @Test

    @After

    //Requirement 10
    @Before

    @Test

    @After

    //Requirement 11a
    @Before
    ExplodingKittens testAttack = new ExplodingKittens(["2", "base", "english"]);
    this.state = Attack.playCard();

    @Test
    assertArrayEquals(2, gameState.getExtraTurn());

    //Requirement 11c
    @Before
    ExplodingKittens testShuffle = new ExplodingKittens(["2", "base", "english"]);
    testShuffleDeck = testShuffle.getCurrentDeck();
    @Test
    
    testShuffle.shuffleCurrentDeck();
    assertNotEquals(testShuffleDeck, getCurrentDeck());

    //Requirement 12
    @Before

    @Test

    @After

    //Requirement 13
    @Before
    ExplodingKittens testDead = new ExplodingKittens(["2", "base", "english"]);
    gameState.kill();
    @Test
    assertTrue(gameState.hasWon());

    
}

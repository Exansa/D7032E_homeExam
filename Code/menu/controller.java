package Code.menu;

import Code.logic.gameState;

import java.util.Random;


public class controller {

    public void clientMenu(){

    }

    private void combo(int nrOfCards){
        int upperbound = hand.size();
        int randomCard;
        if(nrOfCards==2){
            randomCard = randomInt(upperbound)
            gameState.drawCardHand(randomCard);
        } else if(nrOfCards==3){
            randomCard = randomInt(upperbound);
            gameState.drawCardHand(randomCard);
            randomCard = randomInt(upperbound-1);
            gameState.drawCardHand(randomCard);
        } else{
            System.out.print("You did wrong");//borde kanske vara error
        }
    }

    private int randomInt(int upperbound){
        Random rand = new Random();
        int randomResult = rand.nextInt(upperbound);
        return randomResult;
    }
}

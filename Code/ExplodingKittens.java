package Code;

import Code.logic.gameState;
import Code.network.client;
import Code.network.server;

public class ExplodingKittens {
    public static void main(String args[]) throws Exception{
        if(args.length == 4){
            int nrOfPlayer = Integer.parseInt(args[0]);
            int nrOfBots = Integer.parseInt(args[1]);
            int nrOfTotalPlayers = nrOfBots + nrOfPlayer;
            String expansion = args[2];
            String language = args[3];
            server serverInstance = new server(nrOfPlayer,nrOfBots, language);
            gameState state = new gameState(nrOfTotalPlayers, expansion, language);
            state.gameStart();
        } else if(args.length == 1){
            client clientInstance = new client(args[0]);
        } else{
            System.out.println("Server: java ExplodingKittens nrOfPlayer nrOfBots expansion language");
            System.out.println("Client: java ExplodingKittens IP");
            System.exit(0);
        }
    }
}

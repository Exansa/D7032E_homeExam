package Resources.Cards;

import java.util.HashMap;

public class cardAmounts {

    public static HashMap<String, Integer> cardAmount(String expansion, String language){

        HashMap<String, Integer> amounts = new HashMap<String, Integer>();
        if (expansion == "base"){
            if(language == "english"){
                amounts = baseAmounts();
                return amounts;
            }


        } else if (expansion == "barking") {
            System.out.println("Not implemented yet, defaults to base game");
            amounts = baseAmounts();
            return amounts;

        } else if (expansion == "imploding") {
            System.out.println("Not implemented yet, defaults to base game");
            amounts = baseAmounts();
            return amounts;

        } else if (expansion == "streaking"){
            System.out.println("Not implemented yet, defaults to base game");
            amounts = baseAmounts();
            return amounts;

        } else{
            return null;
        }
        return null;
    }

    private static HashMap<String, Integer> baseAmounts(){
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("nope", 5);
        temp.put("shuffle",4);
        temp.put("seeTheFuture",5);
        temp.put("favor",4);
        temp.put("hairyPotato",4);
        temp.put("catterMelon",4);
        temp.put("rainbow",4);
        temp.put("taco",4);
        temp.put("bikini",4);

        return temp;
    }

}

package Resources.english.Cards;

import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cardAmounts {

    public static HashMap<String, Integer> cardAmount(String expansion){

        HashMap<String, Integer> amounts = new HashMap<String, Integer>();
        if (expansion == "base"){
            amounts = baseAmounts();
            return amounts;

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

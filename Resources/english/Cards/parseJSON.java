package Resources.english.Cards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;


public class parseJSON {
    int nope;
    JSONObject json;

    public static JSONObject parseCards(String expansion) throws FileNotFoundException{

        JSONParser parser = new JSONParser();

        try {
            if (expansion == "base"){
                Object obj = parser.parse(new FileReader("deckAmount.json"));
                JSONObject jsonObject = (JSONObject) obj;
                return new JSONObject(jsonObject);
                File file = new File("deckAmount.json");
            } else if (expansion == "barking") {
                System.out.println("Not implemented yet, defaults to base game");
                File file = new File("deckAmount.json");
            } else if (expansion == "imploding") {
                System.out.println("Not implemented yet, defaults to base game");
                File file = new File("deckAmount.json");
            } else if (expansion == "streaking"){
                System.out.println("Not implemented yet, defaults to base game");
                File file = new File("deckAmount.json");
            }


            return new JSONObject(jsonObject);

        } catch(FileNotFoundException Error){
            System.out.println("The given card file was incorrect" + Error);
        }
        return null;


    }


}

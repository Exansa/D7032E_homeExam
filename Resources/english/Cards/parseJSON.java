package Resources.english.Cards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class parseJSON {
    int nope;


    public static JSONObject parseBaseCards(String path) throws FileNotFoundException{
        File file = new File(path);
        try {
            JSONObject obj = new JSONObject();
            String objText = obj.toString();

            return new JSONObject(objText);

        } catch(FileNotFoundException Error){
            System.out.println("The given card file was incorrect" + Error);
        }
        return null;
    }


}

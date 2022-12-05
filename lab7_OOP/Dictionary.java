import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> map = new HashMap<>();
    public String translate(String word){
        return this.map.get(word);
    }
    public void add(String word, String translation){
        this.map.put(word, translation);
    }
    public int amountOfWords(){
        return this.map.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.map.keySet()) {
            list.add(key + " = " + this.map.get(key));
        }
        return list;
    }

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*Create a HashMap<String,String> object in the main method.
Store the following people's names and nicknames into the HashMap,
the name being the key and the nickname its value*/

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");
        System.out.println("Matti " + people.get("matti"));

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        System.out.println(mattisNote.howMuchIsDebt("Arto"));
        System.out.println(mattisNote.howMuchIsDebt("Joel"));
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);
        System.out.println(mattisNote.howMuchIsDebt("Arto"));

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
    }
}
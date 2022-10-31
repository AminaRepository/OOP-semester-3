//Create the method lengths that gets a list of String variables as a parameter
//and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.

import java.util.ArrayList;

public class task7 {
    public static ArrayList<Integer> length(ArrayList<String> list){
        ArrayList<Integer> listLong = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            listLong.add(list.get(i).length());
        }
        return listLong;
    }
    public static void main(String[] args){
        ArrayList<String> listWord = new ArrayList<>();
        listWord.add("word");
        listWord.add("twice");
        listWord.add("gehen");
        listWord.add("anywhere");
        listWord.add("leg");
        System.out.println(length(listWord));
    }
}

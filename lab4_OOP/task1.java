/*Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
that inserts the items in a list called second to a list called first.
The order of the items can be anything and the same item can appear in the list more than once*/

import java.util.ArrayList;

public class task1 {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        for(int i=0; i< second.size(); i++){
            first.add(second.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first.add(1);
        first.add(2);
        second.add(3);
        second.add(4);
        second.add(5);
        combine(first, second);
        System.out.println(first);
    }
}
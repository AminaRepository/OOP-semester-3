//Create a program that asks the user to input words until the user gives the same word twice.
//Print all words in alphabetical order

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String word;
        int check = 0;
        while(true){
            System.out.println("Enter a word");
            word = scan.nextLine();
            list.add(word);
            for(int i = 0; i<(list.size()-1); i++){
                for(int j = i+1; j<list.size(); j++){
                    if(list.get(i).equals(list.get(j))){
                        System.out.println("You wrote " + list.get(i) + " twice");
                        check = 1;
                    }
                }
            }
            if(check==1){
                break;
            }
        }
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

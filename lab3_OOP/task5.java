//Create a program that asks the user for two words.
//Then the program tells if the second word is included in the first word.

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.nextLine(), word2 = scan.nextLine();
        if(word1.contains(word2)){
            System.out.println("First word contains second");
        }
        else{
            System.out.println("First word doesn't contain second");
        }
    }
}

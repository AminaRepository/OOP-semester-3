//Create the method palindrome that checks if a string is a palindrome

import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine(), reverse = "";
        for(int i=(word.length()-1); i>=0; i--){
            reverse += word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println("The word is a palindrome");
        }
        else{
            System.out.println("The word is not a palindrome");
        }
    }
}

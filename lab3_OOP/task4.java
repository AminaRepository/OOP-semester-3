//Create a program that asks for the user's name and prints it in reverse order.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine(), newName = "";
        for(int i=(name.length()-1); i>=0; i--){
            newName += name.charAt(i);
        }
        System.out.println(newName);
    }
}

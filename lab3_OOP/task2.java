//Create a program that asks for the user's name and says how many characters the name contains

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Your name has " + name.length() + " characters");
    }
}

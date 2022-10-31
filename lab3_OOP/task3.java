//Create a program that asks for the user's name and gives its characters separately.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}

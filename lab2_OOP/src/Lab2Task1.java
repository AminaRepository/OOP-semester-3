/* Create a program that asks the user for a password.
If the password is right, a secret message is shown to the user */

import java.util.Scanner;
public class Lab2Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Insert your password");
            String password = reader.nextLine();
            if(password.equals("secret")){
                System.out.println("You are correct");
                break;
            }
            System.out.println("Incorrect password!");
        }
    }
}
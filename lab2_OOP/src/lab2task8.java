/* In this exercise the following game is created:
STEP 1: The program that comes with the exercise contains a command called drawNumber.
It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible).
Create a program that draws a number. Then the user has the chance to guess once, what the number is.
The program should print "The number is lesser", "The number is greater" or
"Congratulations, your guess is correct!" depending on the number the user typed
STEP 2: Develop your program by adding the following functionality:
the guessing should be made repeatedly until the user types the right number
STEP 3: Develop your program by adding the following functionality:
the program needs to include a variable of type int, which is used to count the guesses the user has made.
The program should always print the number of guesses along with the answer*/

import java.util.Scanner;
import java.util.Random;

public class lab2task8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x = 0, secret = drawNumber(), count = 1;
        System.out.println(secret);
        while(true){
            System.out.println("Enter a guess: ");
            x = scan.nextInt();
            if(x < secret){
                System.out.println("Number is greater");
                System.out.println("Amount of guesses: " + count);
            }
            else if(x > secret){
                System.out.println("Number is smaller");
                System.out.println("Amount of guesses: " + count);
            }
            if(x == secret){
                System.out.println("Number is correct");
                System.out.println("Amount of guesses: " + count);
                break;
            }
            count++;
        }
    }
    public static int drawNumber(){
        Random rand = new Random();
        int n = rand.nextInt(101);
        return n;
    }
}

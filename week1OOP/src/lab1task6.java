//Create a program that asks the user for two numbers and prints the greater of those two.
//The program should also handle the case in which the two numbers are equal

import java.util.Scanner;

public class lab1task6 {
    public static void main(String[] args){
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = in.nextInt();
        System.out.println("Enter a number: ");
        y = in.nextInt();
        if(x > y) {
            System.out.println("The number " + x + " is bigger");
        }
        else if(y > x){
            System.out.println("The number " + y + " is bigger");
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}
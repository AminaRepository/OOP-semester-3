//Create a program that asks the user for two integers and then prints their sum

import java.util.Scanner;

public class lab1task4 {
    public static void main(String[] args){
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = in.nextInt();
        System.out.println("Enter a number: ");
        y = in.nextInt();
        System.out.println("The sum of the two numbers is " + (x+y));
    }
}
//Create a program that asks the user for a number and tells if the number is positive

import java.util.Scanner;

public class lab1task5 {
    public static void main(String[] args){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = in.nextInt();
        if(x >= 0) {
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
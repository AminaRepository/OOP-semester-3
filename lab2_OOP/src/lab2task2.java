/* Create a program that asks the user for three numbers and then prints their sum */

import java.util.Scanner;
public class lab2task2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = cin.nextInt();
        System.out.println("Enter a number");
        int n2 = cin.nextInt();
        System.out.println("Enter a number");
        int n3 = cin.nextInt();
        System.out.println("The sum is " + (n1+n2+n3));
    }
}

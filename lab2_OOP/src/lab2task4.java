/* Create a program that asks the user for the first number and the last number
and then prints all numbers between those two. Use a while loop.*/

import java.util.Scanner;

public class lab2task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, i;
        System.out.println("Insert the beginning number");
        a = scan.nextInt();
        System.out.println("Insert the ending number");
        b = scan.nextInt();
        i = a;
        while(i <= b){
            if(a > b){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

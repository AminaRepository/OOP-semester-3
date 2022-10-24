/* Create a program that reads numbers from the user and prints their sum.
The program should stop asking for numbers when the user enters the number 0 */

import java.util.Scanner;
public class lab2task3 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int sum = 0, n;
        while(true){
            System.out.println("Enter a number");
            n = cin.nextInt();
            sum += n;
            System.out.println(sum);
            if(n==0){
                break;
            }
        }
    }
}

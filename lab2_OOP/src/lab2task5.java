// Create a program that calculates the sum of 20+21+22+...+2n
// where n is a number entered by the user

import java.util.Scanner;
import static java.lang.Math.pow;

public class lab2task5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt(), sum = 0;
        for(int i=0; i<num; i++){
            sum += pow(2, i);
        }
        System.out.print(sum);
    }
}

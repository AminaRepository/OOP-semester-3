/* Create a method printText that prints the following string of characters:
"In the beginning there were the swamp, the hoe and Java." and a line break
Develop the program by adding the following feature:
the main program should ask the user how many times the text should be printed */

import java.util.Scanner;

public class lab2task6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times should the text be printed?");
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            printText();
        }
    }
    public static void printText(){
        System.out.print("In the beginning there were the swamp, the hoe and Java.");
        System.out.print("\n");
    }
}

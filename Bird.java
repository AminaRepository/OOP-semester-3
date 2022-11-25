/* Your program is allowed to call new Scanner only once.
design and implement an observation database for a bird watcher.
The database contains birds, each of which have a name and a Latin name, both Strings.
Database also tracks how many times each bird has been observed.
The program should implement the following commands:
Add - adds a bird
Observation - adds an observation
Statistics - prints all the birds
Show - prints one bird
Quit - terminates the program */

import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    static String name;
    static String latinName;
    static int observations;
    static Scanner scan = new Scanner(System.in);
    public void Print(){
        System.out.println(name + " (" + latinName + "), " + observations + " observations");
    }
    public static void main(String[] args){
        boolean run = true;
        String command;
        ArrayList<Bird> birds = new ArrayList<>();
        while(run){
            System.out.println("?");
            command = scan.nextLine();
            switch (command) {
                case "Add":
                    Bird bird = new Bird();
                    System.out.print("Name: ");
                    name = scan.nextLine();
                    System.out.print("Latin name: ");
                    latinName = scan.nextLine();
                    observations = 0;
                    birds.add(bird);
                    break;
                case "Observation": {
                    System.out.println("What was observed?");
                    String name = scan.nextLine();
                    for (Bird value : birds) {
                        if (value.name.contains(name)) {
                            observations += 1;
                        }
                    }
                    break;
                }
                case "Show": {
                    System.out.println("Show what?");
                    String name = scan.nextLine();
                    for (Bird value : birds) {
                        if (value.name.contains(name)) {
                            value.Print();
                        }
                    }
                    break;
                }
                case "Statistics":
                    for (Bird value : birds) {
                        value.Print();
                    }
                    break;
                case "Quit":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
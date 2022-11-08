/*Class Dice that has the following functionality
The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the argument.
The method roll tells the result of a roll (which depends on the number of its sides)*/

public class task2 {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        for(int i=0; i<10; i++){
            System.out.println(dice.roll());
        }
    }
}
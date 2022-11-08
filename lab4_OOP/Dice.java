// connected to task2

import java.util.Random;
public class Dice {
    int numberOfSides;
    Random random = new Random();

    public Dice (int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int roll(){
        return random.nextInt(numberOfSides);
    }
}
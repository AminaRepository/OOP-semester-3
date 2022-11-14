/*Create a class Player with the instance variables for the player name and the number of goals.
A player should have two constructors: one that initializes the name and another that initializes the name
and the number of goals. Implement also the following methods:
        getName, returns the player's name
        goals, returns the number of goals
        toString, returns a string representation that is formed as in the example below*/


public class Player {
    private String name;
    private int goals;
    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }
    public Player(String name){
        this(name, 0);
    }
    public String getName(){
        return this.name;
    }
    public int getGoals(){
        return this.goals;
    }
    public String toString(){
        return "Name: " + this.getName() + ", Goals: " + this.getGoals();
    }
}
/*Implement a class Team;
constructor & geter, method addPlayer, adds a player to the team
printPlayers, prints the players in the team
setMaxSize(int maxSize), sets the maximum number of players that the team can have
size, returns the number of players on the team, default = 16
Change the method addPlayer so that it does not add players to the team if the team already has the maximum number of players.
Add to the class Team the method
goals, returns the total number of goals for all the players in the team */

import java.util.ArrayList;

public class Team {
    String name;
    int maxSize = 16;
    ArrayList<Player> players = new ArrayList<>();
    Team(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(players.size() < this.maxSize){
            players.add(player);
        }
    }
    public void printPlayers(){
        for(Player member : this.players){
            System.out.println(member);
        }
    }
    public void setMaxSize(int newSize){
        this.maxSize = newSize;
    }
    public int Size(){
        return players.size();
    }
    public int getGoals(){
        int totalGoals = 0;
        for(Player player : players){
            System.out.println(player.getGoals());
            totalGoals += player.getGoals();
        }
        return totalGoals;
    }
}
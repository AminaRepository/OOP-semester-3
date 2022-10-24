// Create a method printStars that prints the given amount of stars and a line break

public class lab2task7 {
    public static void printStars(int amount){
        for(int i=0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args){
        printStars(5);
        printStars(7);
        printStars(3);
    }
}

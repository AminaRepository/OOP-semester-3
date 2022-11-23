import java.util.Random;
/*Add to the class NightSky the method printLine, that prints one line of stars.
The line length is determined by the value of the instance variable width and the instance variable density
determines the star probability. For each printed character you should use a Random object to decide
if it prints out as a white space or a star.*/

public class NightSky {
    double density;
    int width, height, starsPrinted;
    Random random = new Random();
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public void printLine(){
        starsPrinted = 0;
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                if(random.nextDouble(1.0) <= density){
                    System.out.print("*");
                    starsPrinted += 1;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public int starsInLastPrint(){
        return starsPrinted;
    }
}
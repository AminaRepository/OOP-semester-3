//Create the method average, which calculates the average of the numbers it gets as parameters

public class task1 {
    public static double Average(int n1, int n2, int n3, int n4){
        return (n1+n2+n3+n4)/4f;
    }
    public static void main(String[] args) {
        double answer = Average(1, 6, 3, 4);
        System.out.println(answer);
    }
}
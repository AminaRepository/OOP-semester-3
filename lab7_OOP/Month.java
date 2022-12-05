
import java.util.HashMap;

public class Month {
    HashMap<Integer, String> month = new HashMap<Integer, String>();
    public void Month(String threeL){
        switch(threeL){
            case("jan"):
                month.put(1, "jan");
            case("feb"):
                month.put(2, "feb");
            case("mar"):
                month.put(3, "mar");
            case("apr"):
                month.put(4, "apr");
            case("may"):
                month.put(5, "may");
            case("jun"):
                month.put(6, "jun");
            case("jul"):
                month.put(7, "jul");
            case("aug"):
                month.put(8, "aug");
            case("sep"):
                month.put(9, "sep");
            case("oct"):
                month.put(10, "oct");
            case("nov"):
                month.put(11, "nov");
            case("dec"):
                month.put(12, "dec");
            default:
                System.out.println("Error");
                month.put(0, "");
        }
    }
    public void Month(int num){
            switch(num){
                case(1):
                    month.put(1, "jan");
                case(2):
                    month.put(2, "feb");
                case(3):
                    month.put(3, "mar");
                case(4):
                    month.put(4, "apr");
                case(5):
                    month.put(5, "may");
                case(6):
                    month.put(6, "jun");
                case(7):
                    month.put(7, "jul");
                case(8):
                    month.put(8, "aug");
                case(9):
                    month.put(9, "sep");
                case(10):
                    month.put(10, "oct");
                case(11):
                    month.put(11, "nov");
                case(12):
                    month.put(12, "dec");
                default:
                    month.put(0, "");
        }
    }
    public void Month(){
        month.put(0, "");
    }
    public void getMonthLetter(int num){
        System.out.println(month.get(num));
        }
}
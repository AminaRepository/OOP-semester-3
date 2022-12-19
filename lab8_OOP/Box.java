import java.util.ArrayList;

public class Box {
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    public Box(int maxWeight){
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void add(ToBeStored thing){
        if((this.totalWeight() + thing.weight()) <= this.maxWeight){
            this.things.add(thing);
        }
        else{
            System.out.println("BOX IS FULL");
        }
    }
    public double totalWeight(){
        double total = 0;
        for(ToBeStored storeThis : things){
            total += storeThis.weight();
        }
        return total;
    }
}
package farmSimulator;

public class bulkTank {
    double capacity;
    double volume;
    public void BulkTank(){
        this.capacity = 2000;
    }
    public void BulkTank(double capacity){
        this.capacity = capacity;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double getVolume(){
        return this.volume;
    }
    public double howMuchFreeSpace(){
        return this.capacity-this.volume;
    }
    public void addToTank(double amount){
        this.volume += amount;
        if(this.volume > this.capacity){
            this.volume = this.capacity;
        }
    }
    public double getFromTank(double amount){
        if((this.volume-amount) < 0){
            return this.volume;
        }
        this.volume -= amount;
        return amount;
    }
    public String toString(){
        return "capacity: " + this.capacity + "\ncurrent volume: " + this.volume;
    }
}
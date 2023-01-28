package farmSimulator;

public class milkingRobot {
    bulkTank pointer;
    public void MilkingRobot(){
        this.pointer = null;
    }
    public bulkTank getBulkTank(){
        return pointer;
    }
    void setBulkTank(bulkTank tank){
        this.pointer = tank;
    }
    public void milk(cow cow){
        this.pointer.addToTank(cow.getAmount());
        cow.uddersVolume = 0;
    }
}

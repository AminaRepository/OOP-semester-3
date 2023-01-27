package application;

import java.util.ArrayList;

public class averageSensor implements sensor{

    ArrayList<sensor> averageSens = new ArrayList<>();

    public void addSensor(sensor additional){
        averageSens.add(additional);
    }

    @Override
    public boolean isOn() {
        for(var sens : averageSens){
            if(!sens.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(var sens : averageSens){
            sens.on();
        }
    }

    @Override
    public void off() {
        averageSens.get(0).off();
    }

    @Override
    public int measure() {
        int avg=0;
        for(var sens : averageSens){
            avg += sens.measure();
        }
        return avg/averageSens.size();
    }

    public ArrayList<Integer> reading (){
        ArrayList<Integer> readings = null;
        for(var sens : averageSens){
            readings.add(sens.measure());
        }
        return readings;
    }
}

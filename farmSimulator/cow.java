package farmSimulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class cow implements isLive, milkable {
    String name;
    double uddersCapacity, uddersVolume;
    private String[] names = new String[] {"Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    public void Cow() {
        int randomIndex = new Random().nextInt(names.length);
        this.name = names[randomIndex];
        this.uddersCapacity = 15 + new Random().nextInt(26);

    }
    public void Cow(String name){
        this.name = name;
        this.uddersCapacity = 15 + new Random().nextInt(26);
    }
    public String getName(){
        return this.name;
    }
    public double getCapacity(){
        return this.uddersCapacity;
    }
    public double getAmount(){
        return this.uddersVolume;
    }
    public String toString(){
        return this.name + " " + this.uddersCapacity + " / " + this.uddersVolume;
    }
    @Override
    public void liveHour() {
        this.uddersVolume += 0.7 + new Random().nextDouble(1.3);
        if(this.uddersVolume > this.uddersCapacity){
            this.uddersVolume = this.uddersCapacity;
        }
    }
    @Override
    public double milk() {
        return this.uddersVolume;
    }
}
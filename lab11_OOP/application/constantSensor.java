package application;

public class constantSensor implements sensor {
    int constructor;

    public void constantSensor(int cons){
        this.constructor = cons;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.constructor;
    }
}

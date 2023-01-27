package application;

public class thermometer implements sensor{
    boolean therm;

    public void thermometer(){
        this.therm = false;
    }

    @Override
    public boolean isOn() {
        return therm;
    }

    @Override
    public void on() {
        this.therm = true;
    }

    @Override
    public void off() {
        this.therm = false;
    }

    @Override
    public int measure() {
        if(!this.therm){
            throw new IllegalStateException();
        }
        else{
            return (int) (Math.random()*(30 + 30 + 1) -30);
        }
    }
}

package application;

public interface sensor {
    boolean isOn();
    void on();
    void off();
    int measure();
}

package people;

public class Student extends Person {
    public int credits;
    public void Student(String name, String address){
        this.name = name;
        this.address = address;
        this.credits = 0;
    }
    @Override
    public String toString(){
        return this.name + "\n     " + this.address + "\ncredits: " + this.credits;
    }
}
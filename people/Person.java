package people;

public class Person {
    public String name, address;
    public void Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return this.name + "\n     " + this.address;
    }
}

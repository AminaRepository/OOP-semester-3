package people;

public class Teacher extends Person {
    int salary;
    public void Teacher(String name, String address, int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.name + "\n     " + this.address + "\nsalary: " + this.salary + " euros/month";
    }
}

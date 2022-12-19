public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return this.name + " by " + this.writer + ", " + this.weight + "kg";
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
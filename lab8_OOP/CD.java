public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.publishingYear = publishingYear;
        this.title = title;
    }

    public String toString(){
        return this.title + " by " + this.artist + ", " + this.weight() + "kg";
    }

    @Override
    public double weight() {
        return 0.1;
    }
}
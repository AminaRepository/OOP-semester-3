public class Book {
    private String title;
    private String publisher;
    private int PublishingYear;
    public Book(String title, String publisher, int PublishingYear){
        this.title = title;
        this.publisher = publisher;
        this.PublishingYear = PublishingYear;
    }
    public String title(){
        return this.title;
    }
    public String publisher(){
        return this.publisher;
    }
    public int year(){
        return this.PublishingYear;
    }
    public String toString(){
        return this.title + " from publisher " + this.publisher + ", " + this.PublishingYear + ".";
    }
}

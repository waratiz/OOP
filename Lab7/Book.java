package Lab7;

public class Book extends Publication {
    private String author;
    // Implement Book.java
    public Book(){

    }

    public Book(String author){
        this.author = author;
    }

    public Book(String author,String publisher, int page_no, double price, String title ){
        super(publisher, page_no, price, title);
        this.author = author;
    }

    @Override
    public String pubPrint() {
        return super.pubPrint()+"\n The author is "+author;
    }
}
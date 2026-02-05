package Lab7;

public class KidsMagazine extends Publication {
    private int rec_age;
    // Implement KidsMagazine.java

    public KidsMagazine(int rec_age){
        this.rec_age = rec_age;
    }

    public KidsMagazine(){
        
    }

    public KidsMagazine(int rec_age,String publisher, int page_no, double price, String title) {
        super(publisher, page_no, price, title);
        this.rec_age = rec_age;
    }

     @Override
    public String pubPrint() {
        return super.pubPrint() + "\nreccommend age is " + rec_age + " years old.";
    }
}

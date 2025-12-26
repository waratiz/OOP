package Lab5;

public class Count {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.click();   
        c1.click();
        System.out.print("c1 current count: "+c1.getCount()+"\n");
        c1.reset();
        System.out.print("c1 count after reset "+c1.getCount()+"\n");

        c2.click();   
        c2.click();
        c2.click();
        System.out.print("c1 current count: "+c2.getCount()+"\n");
        c2.reset();
        System.out.print("c1 count after reset "+c2.getCount()+"\n");
    }
}

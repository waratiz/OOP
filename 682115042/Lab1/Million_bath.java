package Lab1;
public class Million_bath {
    public static void main(String[] args) {
        int i=1,deposit =1, total=1;

        System.out.println("day " + i + " deposit " + deposit + " total is "+total);
        for (;total<1000000;) {
            i++;
            deposit *=2;
            total += deposit;
            System.out.println("day " + i + " deposit " + deposit + " total is "+total);
            
        }
        System.out.println();
        System.out.println("Number of days is "+i+ " days");

    }
}

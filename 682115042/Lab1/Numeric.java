package Lab1;
public class Numeric {
    public static void main(String[] args) {
        int deposit =1, total=1;
        for (int i = 1; i <= 30; i++) {
            System.out.println("day " + i + " deposit " + deposit + " total is "+total);
            deposit *=2;
            total += deposit;
        }
    }
}
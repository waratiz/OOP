package Lab10.Q3;

public class Q3 {
    public static void main(String[] args) {

        try {
            Triangle t1 = new Triangle(3, 4, 5);
            System.out.println("Perimeter for t1: " + t1.perimeter());
            System.out.println("Area for t1: " + t1.area());
        } catch (IllegalTriangleException e) {
            System.out.println("t1 Error: " + e.getMessage());
        }

        try {
            Triangle t2 = new Triangle(1, 2, 3);
            System.out.println("Perimeter for t2: " + t2.perimeter());
            System.out.println("Area for t2: " + t2.area());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
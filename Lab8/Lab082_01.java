package Lab8;

public class Lab082_01 {
    // Main method
    public static void main(String[] args) {
        // Create two comarable rectangles
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(15);
        int flag = circle1.compareTo(circle2);
        switch (flag) {
            case 1:
                System.out.println("The max circle's radius is " + circle1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is " + circle2.getRadius());
                break;
            default:
                System.out.println("Both circles are have the same radius.");
                break;
        }
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    // complete the class
    private int num;
    public ComparableCircle(double radius){
        super(radius);
    }

    public double getRadius(){
       return super.getRadius();
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
package Lab10.Q3;

public class Triangle {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1) {

            throw new IllegalTriangleException("Illegal triangle " +
                    "\nside1= " + side1 +
                    "\nside2= " + side2 +
                    "\nside3= " + side3);
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

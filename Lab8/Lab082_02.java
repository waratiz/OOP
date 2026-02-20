package Lab8;

public class Lab082_02 {
    public static void main(String[] args) {
        GeometricObject[] objects = { new Square(2), new Square(3), new Square(4.5), new Square(5),
                new Square(6) };
        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable) objects[i]).howToColor();
        }
    }
}

// create an interface Colorable class
class Square extends GeometricObject implements Colorable {
    private double side;
    // complete the square class
    public Square(double side){
        this.side = side;
    }

     public Square() {
        this.side = 0;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getter(){
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}

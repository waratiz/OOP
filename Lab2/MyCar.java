package Lab2;

public class MyCar {

    public static void main(String[] args) {
        Car Toyota = new Car("red");
        Car Honda = new Car("blue");
        Toyota.setSpeed(200);
        Toyota.setMileage(1345);
        Honda.setSpeed(300);
        Honda.setMileage(8987);
        System.out.println("Toyota color: " + Toyota.getcolor() + " speed: " + Toyota.getSpeed() + " mileage: " + Toyota.getMileage());
        System.out.println("Honda color: " + Honda.getcolor() + " speed: " + Honda.getSpeed() + " mileage: " + Honda.getMileage());

    }
}

package Lab2;
public class Car {

    String color;
    int speed;
    int mileage;

    public Car(String col) {
        color = col;
        speed = 0;
        mileage = 0;
    }

    public String getcolor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setSpeed(int spd) {
        speed = spd;
    }

    public void setMileage(int ml) {
        mileage = ml;
    }

}

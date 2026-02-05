package Lab7;
public class Testsound {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal poly = new Dog();

        System.out.println("test Animal obj");
        a.makeSound();
        System.out.println();
        System.out.println("test Dog obj");
        d.makeSound();
        System.out.println();
        System.out.println("test Polymorphism");
        poly.makeSound();
    }
}

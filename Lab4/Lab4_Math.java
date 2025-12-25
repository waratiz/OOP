import java.util.Random;

public class Lab4_Math {

    double a = 3.0, b = 4.0, c;
    Random ran = new Random(20);

    public Lab4_Math() {
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public void random_num(int num) {
        int i = 1;
        while (i <= num) {
            int ran_num = ran.nextInt(100); 
            System.out.println("Random number " + i + ": " + ran_num);
            i++;
             System.out.println();
        }
    }

    public int random_dice() {
        int dice = ran.nextInt(6) + 1;
        return dice;
    }

    public static void main(String[] args) {
        Lab4_Math obj = new Lab4_Math();

        System.out.println("Hypotenuse: " + obj.c);
        System.out.println();
        obj.random_num(5);
        System.out.println("Dice roll: " + obj.random_dice());
    }
}
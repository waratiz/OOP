import java.util.Random;

public class Lab4_Math {

    double a=3.0,b=4.0,c;   


    public Lab4_Math() {
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        Lab4_Math obj = new Lab4_Math();
        Random ran = new Random(20);

        int ran_num = ran.nextInt(100);
        int dice = ran.nextInt(6)+1;

        System.out.println("Hypotenuse: "+obj.c);
        System.out.println("Random sequence (Seed 20): "+ran_num);
        System.out.println("Dice roll: "+dice);
    }
}
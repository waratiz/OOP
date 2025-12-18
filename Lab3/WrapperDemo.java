package Lab3;


public class WrapperDemo {
    public static void main(String[] args) {

        String s1 = "500";
        String s2 = "123.45";
        String year = "1999";

        int i = Integer.valueOf(s1);
        double d = Double.valueOf(s2) ;
        int y = Integer.parseInt(year);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Max value "+max +" | Min value "+min);
        System.out.println("-------------------------------");
        System.out.println(i);
        System.out.println(d);
        intValue(d);
        System.out.println(y);
    }

    public static void intValue(double  d){

       int value = (int)d;

        System.out.println(value);
        System.out.println("------------------------------");
    }
}

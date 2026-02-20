package Lab9;

import java.util.ArrayList;

public class Compariable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.println("The smallest number is: " + min(list));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E minValue = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(minValue) < 0) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }
}

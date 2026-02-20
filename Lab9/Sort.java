package Lab9;

import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(9);

        sort(list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {

                    E temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println(list);
    }

}

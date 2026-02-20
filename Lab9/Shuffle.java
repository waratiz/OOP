package Lab9;

import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        shuffle(list);
        System.out.println(list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = (int) (Math.random() * (i + 1));
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}

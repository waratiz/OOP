package Lab8;

import java.util.*;

public class Lab08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {

                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

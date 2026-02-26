package Lab10;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }

        try {
            System.out.print("Please enter index of array(0 - 99) : ");
            int num = sc.nextInt();

            if (num > arr[num]) {
                throw new ArrayIndexOutOfBoundsException("you refer to index that does not exist.");
            }

            System.out.println("The value at index is " + arr[num]);
            System.out.println("End nicely.");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        System.out.println("Continuing processing ...");

    }
}

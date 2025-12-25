import java.util.Scanner;
import java.util.Arrays;

public class Lab4_Arrays {

    int[] arr = new int[5];
    int target;

    public Lab4_Arrays() {

    }

    public static void main(String[] args) {
        Lab4_Arrays obj = new Lab4_Arrays();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < obj.arr.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            obj.arr[i] = input.nextInt();
        }

        Arrays.sort(obj.arr);

        System.out.print("Sorted array:  ");
        for (int i = 0; i < obj.arr.length; i++) {
            System.out.print(obj.arr[i] + " ");
        }

        System.out.print("\nEnter a number to search for: ");
        int target = input.nextInt();
        boolean found = false;

        for (int i = 0; i < obj.arr.length; i++) {
            if (target == obj.arr[i]) {
                System.out.println("Found " + target + " at sorted index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found " + target + " at any index");
        }

        input.close();
    }
}

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
            System.out.print(obj.arr[i]+" ");
        }

        System.out.println("Enter a number to search for: ");
        int target = input.nextInt();

        input.close();
    }
}

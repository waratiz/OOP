package Lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter first integer: ");
                num1 = sc.nextInt();

                System.out.print("Enter second integer: ");
                num2 = sc.nextInt();

                validInput = true;

            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                sc.nextLine();
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}
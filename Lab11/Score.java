package Lab11;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name containing scores: ");
        String input = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(input))) {

            String line;
            int count = 0;
            int total_score = 0;
            double average = 0;

            while ((line = br.readLine()) != null) {

                String[] numbers = line.split("\\s+");

                for (String num : numbers) {
                    int score = Integer.parseInt(num);
                    total_score += score;
                    count++;
                }
            }

            average = (double) total_score / count;

            System.out.println("Total Score = " + total_score);
            System.out.println("Average Score = " + average);

        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}

package Lab11;

import java.io.*;
import java.util.Random;

public class RWdata {
    public static void main(String[] args) {
        String filename = "Lab11/RWdata.txt";
        File file = new File(filename);
        Random rand = new Random();
        int[] arr = new int[100];

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 100; i++) {
                int num = rand.nextInt(101);
                arr[i] = num;
                writer.write(num + "\t");
            }
            System.out.println("100 random Integers written to Rwdata.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            if (line != null) {
                String[] num = line.trim().split("\\s+");

                for (String i : num) {
                    System.out.print(i + "\t");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

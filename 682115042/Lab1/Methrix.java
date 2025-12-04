package Lab1;
import java.util.Scanner;
public class Methrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 row by row;");
        System.out.println();

        double[][] arr = new double[3][4]; 
        int i=0;

        for(;i<3;i++){
            for(int j =0;j<4;j++){
                System.out.print("Enter values ");
                arr[i][j] = input.nextDouble();

            }
        }
        System.out.println();

        for(int k=0;k<arr[0].length;k++){
            System.out.print("Sum of the elements at column " +k+" is "+ sumColumn(arr, k));
            System.out.println();
        }

        input.close();
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum =0;
  
        for(int i =0;i<m.length;i++){
            sum += m[i][columnIndex];
        }

        return sum;
    }
}

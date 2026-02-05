package Lab7;

public class Calculator {
    public Calculator(){

    }

    public int add(int num1, int num2){
        int result=0;

        result = num1+num2;

        return result;
    }

    public double add(double num1, double num2){
        double result=0;

        result = num1+num2;

        return result;
    }

    public int add(int num1, int num2, int num3){
        int result=0;

        result = num1+num2+num3;

        return result;
    }

    public int add(int[] arr){
        int result=0;

        for(int i =0;i<arr.length;i++){
            result = result+arr[i];
        }

        return result;
    }

}

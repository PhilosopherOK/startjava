package alisherDay4;
import java.util.Random;
public class Test3 {
    static Random randomaizer = new Random();
    public static void main(String[] args) {
        sumMatrix();
    }
    static void sumMatrix(){
        int sumOfAll = 0;
        int sumOfString = 0;
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomaizer.nextInt(50);

            }
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if(sum >= maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);

    }
}

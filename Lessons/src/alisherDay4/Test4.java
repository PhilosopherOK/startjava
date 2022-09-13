package alisherDay4;
import java.util.Random;
public class Test4 {
    static Random random = new Random();
    public static void main(String[] args) {
        sumOfMatrix();
    }
    static void sumOfMatrix(){
        int [] matrix = new int [100];
        int sumThree = 0;
        int firstIndex = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            matrix[i] = random.nextInt(10000);
        }
        for (int i = 0; i < 98; i++) {
            sumThree = matrix[i] + matrix[i+1] + matrix[i+2];
            if(sum <= sumThree){
                sum = sumThree;
                firstIndex = i;
            }
        }
        System.out.println(sum);
        System.out.println(firstIndex);

    }
}

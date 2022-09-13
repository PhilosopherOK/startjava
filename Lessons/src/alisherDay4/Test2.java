package alisherDay4;
import java.util.Random;

public class Test2 {
    static Random randomaizer = new Random();
    public static void main(String[] args) {
        perebiratelMasiva();
    }
    static void perebiratelMasiva(){
        int [] massiv = new int[100];
        int max = 0;
        int min = 0;
        int howMuch0 = 0;
        int sumHowMuch0 = 0;
        for (int number:massiv) {
            number = randomaizer.nextInt(10000);
            if(number > max){
                max = number;
            }if(number < min){
                min = number;
            }if((number % 10) == 0){
                howMuch0++;
            }if((number % 10) == 0){
                sumHowMuch0 += number;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(howMuch0);
        System.out.println(sumHowMuch0);
    }
}

package alisherDay2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(vichislitel(x));


    }
    static double vichislitel(double x){
        double y;
        if(x >= 5) {
            y = ((x * x) - 10) / (x + 7);
        } else if((x < 5)&&(x > -3)){
            y = (x + 3)*((x * x) - 2);
        }else{
            y = 420;
        }
        return y;
    }

}

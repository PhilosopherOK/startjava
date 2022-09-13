package alisherDay3;

import java.util.Scanner;

public class Test2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        deleshka();

    }
    static void deleshka(){
        double delenoe = scanner.nextDouble();
        double delitel = scanner.nextDouble();
        double result = delenoe/delitel;
            if (delitel != 0){
                System.out.println(result);
                deleshka();
            }
    }
}

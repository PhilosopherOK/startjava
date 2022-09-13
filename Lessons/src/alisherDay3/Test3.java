package alisherDay3;
import java.util.Scanner;

public class Test3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        p9iterna9iDeleIIIka();
    }
    static void p9iterna9iDeleIIIka(){
        for (int i = 0; i < 5; i++) {
            double delennoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();
            if (delitel == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(delennoe/delitel);
        }
    }

}

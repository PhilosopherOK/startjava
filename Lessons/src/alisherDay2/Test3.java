package alisherDay2;

import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a;
            int b;
            while (true) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                if (a >= b) {
                    System.out.println("Некорректный ввод");
                } else {
                    break;
                }
            }
            needDiapos(a, b);
        }
        static void needDiapos(int a, int b){
            for (int i = a; i < b; i++) {
                if((i % 5 == 0)&&(i % 10 != 0)) {
                    System.out.print(i +" ");
                }
            }
        }
    }


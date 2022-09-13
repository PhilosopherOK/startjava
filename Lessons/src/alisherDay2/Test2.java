package alisherDay2;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        int a;
        int b;
        while(true) {
            a = scan();
            b = scan();
            if (a >= b) {
                System.out.println("Некорректный ввод");
            } else {
                break;
            }
        }
        needDiapos(a,b);

    }
    static int scan(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }
    static void needDiapos(int a, int b){
        for (int i = a; i < b; i++) {
            if((i % 5 == 0)&&(i % 10 != 0)) {
                System.out.print(i +" ");
            }
        }
    }
}

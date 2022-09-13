package alisherDay2;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int etag = scan();
        obreviatura(etag);
    }
    static int scan(){
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        for (int i = 0; i > -1 ; i++) {
            if (scan < 1){
                System.out.println("неправильное число этажей, попробуйте снова");
                scan = scanner.nextInt();
                }
            else{
                break;
            }
        }
        return scan;
    }
    static void obreviatura(int etag){
        if (etag <= 4 && etag >= 1) {
            System.out.println("Малоэтажный дом");
        }else if (etag <= 8 && etag >= 5) {
            System.out.println("Среднеэтажный дом");
        }else if (etag > 8) {
            System.out.println("Высокоэтажный дом");
        }
    }
}

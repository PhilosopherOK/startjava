package Calculator;

import java.util.Scanner;
public class Calcul {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Calcul calc = new Calcul();
        int num1 = calc.giveNumber();
        char option = calc.giveOption();
        int num2 = calc.giveNumber();
        calc.calculation(num1,num2,option);
    }

    public char giveOption() {
        System.out.println("press any operation");
        char option= scanner.next().charAt(0);
        for (int i = 0; i < 1; i--) {
            if(option == '+'){
                i = 40;
            }else if(option == '-'){
                i = 40;
            }else if(option == '/'){
                i = 40;
            }else if(option == '*'){
                i = 40;
            }else if(option == '%'){
                i = 40;
            }else if(option == '^'){
                i = 40;
            }else{
                System.out.println("press correct operation!");
            }
        }
        return option;
    }

    public int giveNumber() {
        System.out.println("Введите число:");
        int num = 0;
        for (int i = 0; i < 1; i--) {
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("please press positive number");
            } else {
                i = 50;
            }
        }
        return num;
    }


    public int calculation(int num1,int num2,char option){
        int result = 1;
        if(option == '+'){
            result = num1+num2;
            System.out.println(result);
        }if(option == '%'){
                result = num1%num2;
                System.out.println(result);
        }if(option == '-'){
                result = num1-num2;
                System.out.println(result);
        }if(option == '*'){
                result = num1*num2;
                System.out.println(result);
        }if(option == '/'){
                result = num1/num2;
                System.out.println(result);
        }else if(option == '^'){
            for (int i = 1; i <= num2 ; i++) {
                result = num1 * result;
            }
            System.out.println(result);
        }
        return result;
    }
}

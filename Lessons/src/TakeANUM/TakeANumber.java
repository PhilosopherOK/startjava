package TakeANUM;

import java.util.Scanner;
public class TakeANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("guess a number from 0 to 100");
        int guessNum = (int) (Math.random()*(100-0+1)+0);
        for (int i = 0; i < 1 ; i--) {
            int number = scanner.nextInt();
            if (number < guessNum){
                System.out.println("guess a bigger number ^-)");
            }else if(number > guessNum){
                System.out.println("guess a litteler number  :*)");
            }else {
                System.out.println("YOU WINNER !!!");
                i=50;
            }
        }
        System.out.println("End Game ;-)");
    }
}

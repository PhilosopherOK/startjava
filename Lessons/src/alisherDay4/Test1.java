package alisherDay4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Test1 {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lengthOfMassiv = scanner.nextInt();
        rastamoshkaMassiva(lengthOfMassiv);
    }

    static void rastamoshkaMassiva(int lengthOfMassiv){
        int[] massiveOfRandom = new int[lengthOfMassiv];
        int more8 = 0;
        int only1 = 0;
        int chetnue = 0;
        int nechet = 0;
        int sum = 0;
        for (int i = 0; i < lengthOfMassiv; i++) {
            massiveOfRandom[i] = rand.nextInt(11);
            sum += massiveOfRandom[i];
            if(massiveOfRandom[i] > 8){
                more8++;
            }if(massiveOfRandom[i] == 1){
                only1++;
            }if((massiveOfRandom[i] % 2) == 0){
                chetnue++;
            }if((massiveOfRandom[i] % 2) != 0){
                nechet++;
            }
        }
        System.out.println(Arrays.toString(massiveOfRandom));
        System.out.println("length Of Massiv = "+ lengthOfMassiv);
        System.out.println("numbers more than 8 = " + more8 );
        System.out.println("numbers equals 1 = " + only1 );
        System.out.println("chetnih chisel = " + chetnue );
        System.out.println("nechetnih chisel = " + nechet);
        System.out.println("Summa vseh chisel = " + sum);
    }
}

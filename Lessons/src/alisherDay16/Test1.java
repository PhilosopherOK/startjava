package alisherDay16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        System.out.printf("this number = %f --> %.3f",Test1.printResult(file),Test1.printResult(file));


    }
    public static double printResult(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double result = 0;
        for (String number:numbers){
            result += Integer.parseInt(number);
        }
        return result/numbers.length;
    }

}

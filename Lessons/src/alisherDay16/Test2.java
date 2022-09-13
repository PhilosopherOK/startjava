package alisherDay16;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        File file1 = new File("file\\file1.txt");
        File file2 = new File("file\\file2.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        double[] numberFile1 = new double[1000];
        for (int i = 0; i < 1000; i++) {
            int j = random.nextInt(100);
            pw1.println(j);
            numberFile1[i] = j;
        }
        pw1.close();
        int q = 0;
        for (int j = 0; j < 50; j++) {
            double sum20 = 0;
            for (int i = 0; i < 20; i++) {
                sum20 += numberFile1[q];
                q++;
            }
            pw2.println(sum20/20);
        }
        pw2.close();
        System.out.println(Test2.printResult(file2));
    }

    public static int printResult(File file) throws FileNotFoundException{
        int sum = 0;
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            sum += (int) Double.parseDouble(line);
        }
        return sum;
    }
}

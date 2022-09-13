package alisherDay15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file\\book1.csv");
        File fileOut = new File("file\\result.txt");
        PrintWriter pw = new PrintWriter(fileOut);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] rasparFile = scanner.nextLine().split(";");
            if (Integer.parseInt(rasparFile[2]) == 0) {
                pw.println(rasparFile[0] + " ; " + rasparFile[1] + " ; " + rasparFile[2] + " ; ");
            }
        }
        pw.close();
        scanner.close();
    }
}


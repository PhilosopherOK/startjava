package alisherDay14;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args){
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));


    }

    private static List<String> parseFileToStringList(File file) {
        List<String> parseFileToStringList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] strings = line.split(" ");
                if (Integer.parseInt(strings[1]) < 0) {
                    throw new NumberExeption();
                }
                parseFileToStringList.add(line);
            }
            scanner.close();
            return parseFileToStringList;
        } catch (NumberExeption e) {
            System.out.println("Некорректный входной файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}


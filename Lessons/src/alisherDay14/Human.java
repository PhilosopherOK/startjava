package alisherDay14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Human> parseFileToObjList(File file) {
        List<Human> parseFileToObjList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] informForHuman = data.split(" ");
                if (Integer.parseInt(informForHuman[1]) < 0) {
                    throw new NumberExeption();
                } else {
                    parseFileToObjList.add(new Human(informForHuman[0], Integer.parseInt(informForHuman[1])));
                }
            }
            scanner.close();
            return parseFileToObjList;

        } catch (NumberExeption e) {
            System.out.println("Некорректный входной файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return null;
    }

    public String toString() {
        return "{" + "name = " + name + ", year = " + age + "}";
    }
}

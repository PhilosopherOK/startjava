package alisherDay3;

import java.util.Scanner;

public class Test1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        cityCoutry();

    }
    static void cityCoutry(){
        String pressCity = scanner.nextLine();
        switch (pressCity){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                cityCoutry();
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                cityCoutry();
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                cityCoutry();
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
                cityCoutry();
            case "STOP":
                break;
            default:
                System.out.println("Неизвестная страна");
                cityCoutry();
        }

    }
}
//Москва, Владивосток, Ростов - Россия
//        Рим, Милан, Турин - Италия
//        Ливерпуль, Манчестер, Лондон - Англия
//        Берлин, Мюнхен, Кёльн - Германия
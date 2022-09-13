package alisherDay5;

public class Test2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike();
        System.out.println(moto1.getColor());
        System.out.println(moto1.getMark());
        System.out.println(moto1.getYear());

    }
}
class Motorbike{
    private int year = 1998;
    private String color = "red";
    private String mark = "Tokio";

    public String getColor(){
        return color;
    }
    public String getMark(){
        return mark;
    }
    public int getYear(){
        return year;
    }

//    Создать класс Мотоцикл (англ. Motorbike ), с полями “Год выпуска”, “Цвет”,
//            “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//    слово this . Геттером получить год выпуска, цвет, модель, вывести значения в
//    консоль.
}
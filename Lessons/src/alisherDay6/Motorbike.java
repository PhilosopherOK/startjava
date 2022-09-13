package alisherDay6;

class Motorbike {
    private int year = 1998;
    private String color = "red";
    private String mark = "Tokio";
    public void info (){
        System.out.println("Its a motorbike !");
    }
    public int yearDifference (int year){
        return (year - this.year);
    }

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
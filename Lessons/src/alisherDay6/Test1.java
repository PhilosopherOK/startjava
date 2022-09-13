package alisherDay6;
//В классах Автомобиль и Мотоцикл реализовать два метода:
//        info () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        yearDifference () - принимает на вход число (год), и возвращает разницу между
//        переданным годом и годом выпуска транспортного средства
public class Test1 {
    public static void main(String[] args) {
        Car car = new Car();
        int yearDifference1 = car.yearDifference(2020);
        System.out.println(yearDifference1);
        car.info();
        Motorbike moto1 = new Motorbike();
        int yearDifference2 = moto1.yearDifference(2020);
        System.out.println(yearDifference2);
        moto1.info();

    }

}

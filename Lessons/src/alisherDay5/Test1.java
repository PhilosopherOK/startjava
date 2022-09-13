package alisherDay5;

public class Test1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setMark("BMV");
        car1.setYear(2011);
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getMark());
    }



}
class Car{
    private String color;
    private int year;
    private String mark;

    public String getColor(){
        return color;
    }
    public void setColor(String color1){
        color = color1;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
}

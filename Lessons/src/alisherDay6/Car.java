package alisherDay6;

class Car {
    private String color;
    private int year = 2017;
    private String mark;

    public void info() {
        System.out.println("Its a car !");
    }

    public int yearDifference(int year) {
        return (year - this.year);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color1) {
        color = color1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

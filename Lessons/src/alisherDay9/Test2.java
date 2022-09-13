package alisherDay9;

public class Test2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure figure:figures) {
            if(figure.getColor().equals("Red")){
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea (Figure[]figures){
        double sum = 0;
        for (Figure figure:figures) {
            if(figure.getColor().equals("Red")){
                sum += figure.area();
            }
        }
        return sum;
    }
}




abstract class Figure {
    public Figure(String color) {
        this.color = color;
    }
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();


}

class Circle extends Figure {
    private double radius;
    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (radius*radius*Math.PI);
    }

    @Override
    public double perimeter() {
        return (radius*2*Math.PI);
    }
}


class Rectangle extends Figure {
    private double a, b;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (a * b);
    }

    @Override
    public double perimeter() {
        return ((a + b) * 2);
    }
}
class Triangle extends Figure{
    private double a, b, c;
    public Triangle(double a,double b,double c, String color){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double p = (a+b+c)/2;
    @Override
    public double area() {
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    @Override
    public double perimeter() {
        return (a + b + c);

    }

}

package alisherDay7;

public class Test1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Musik", 2016, 170 , 6500);
        Airplane plane2 = new Airplane("Kykysik", 2017, 210 , 8500);
        Airplane.compareAirplanes(plane1, plane2);

    }
}

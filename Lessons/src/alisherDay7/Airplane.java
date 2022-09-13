package alisherDay7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;


    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int literOfDP) {
        fuel += literOfDP;
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {


        if (plane1.getLength() > plane2.getLength()) {
            System.out.println("Airplane " + plane1.producer + " is more length than " + plane2.producer);
        } else if(plane1.getLength() < plane2.getLength()) {
            System.out.println("Airplane " + plane2.producer + " is more length than " + plane1.producer);
        }else{
            System.out.println("Airplanes is equals");

        }
    }

}

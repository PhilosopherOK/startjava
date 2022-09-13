package alisherDay1;

public class Test4 {
    public static void main(String[] args) {
        olimpiada();

    }

    static void olimpiada(){
        int year = 1980;
        do {

            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }while(year <= 2020);


    }
}

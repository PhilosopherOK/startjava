package alisherDay17;

import java.util.Arrays;

public class ChessBoard {
    private Object[][] massivOfChesses = new Object[8][8];

    public ChessBoard(Object[][] massivOfChesses) {
        this.massivOfChesses = massivOfChesses;
    }



    public void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(massivOfChesses[i][j]);
            }
            System.out.println();
        }
    }


}

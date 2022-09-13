package alisherDay17;

//        Используя созданный enum, в методе main() класса Task1 создайте массив,
//        содержащий 4 белых пешки и 4 черных ладьи. Выведите содержимое этого массива
//        на экран, используя строковые обозначения шахматных фигур.

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        ChessPiece chessPiece1 = ChessPiece.PAWN_WHITE;
        Object[] massivOfChesses = new Object[]{ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        System.out.println(Arrays.toString(massivOfChesses));

    }
}

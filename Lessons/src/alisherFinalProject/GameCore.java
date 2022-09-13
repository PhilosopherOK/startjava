package alisherFinalProject;

import Exeption.NotValidation;
import alisherDay14.NumberExeption;

import java.util.Scanner;

public class GameCore {
    Scanner scanner = new Scanner(System.in);
    public Object takeAShip1(Player player) {
        System.out.println("Начнем раставлять корабли по полю. Другой игрок не смотри!!!");
        System.out.println("Введи координаты четырехпалубного корабля в формате (x1,y1;x2,y2;x3,y3;x4,y4) ");
        try {int i = 1;
            while (i > 0) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                if ((x1 > 9) || (y1 > 9) || (x1 < 0) || (y1 < 0)) {
                    throw new NumberExeption();
                }
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                if ((x2 > 9) || (y2 > 9) || (x2 < 0) || (y2 < 0)) {
                    throw new NumberExeption();
                }else if( (((x2 == x1-1) || (x2 == x1) || (x2 == x1+1))&& y2 == y1) || (((y2 == y1-1) || (y2 == y1) || (y2 == y1+1))&& x2 == x1) ){
                }else{
                    throw new NotValidation();
                }
                int x3 = scanner.nextInt();
                int y3 = scanner.nextInt();
                if ((x3 > 9) || (y3 > 9) || (x3 < 0) || (y3 < 0) ) {
                    throw new NumberExeption();
                }else if(((x2 == x1) && (x3 == x2) && (y1 != y2) && (y3 != y2)) ||
                        ((y2 == y1) && (y3 == y2) && (x1 != x2) && (x3 != x2))) {
                if ((((x3 == x2 - 1) || (x3 == x2 + 1)) && y3 == y2) ||
                        (((y3 == y2 - 1) || (y3 == y2 + 1)) && x3 == x2)){
                }}else{
                    throw new NotValidation();
                }

                int x4 = scanner.nextInt();
                int y4 = scanner.nextInt();
                if (((x4 > 9) || (x4 < 0)) || ((y4 > 9) || (y4 < 0))) {
                    throw new NumberExeption();
                }else if(((x2 == x1) && (x3 == x2) && (x4 == x3) && (y1 != y2) && (y3 != y2) && (y4 != y3)) ||
                        ((y2 == y1) && (y3 == y2) && (y4 == y3) && (x1 != x2) && (x3 != x2) && (x4 != x3))) {
                if ((((x4 == x3 - 1) || (x4 == x3 + 1)) && y4 == y3) ||
                        (((y4 == y3 - 1) || (y4 == y3 + 1)) && x4 == x3)) {
                    player.massivOfCells[y1][x1] = Ship.SHIP;
                    player.massivOfCells[y2][x2] = Ship.SHIP;
                    player.massivOfCells[y3][x3] = Ship.SHIP;
                    player.massivOfCells[y4][x4] = Ship.SHIP;
                    i = -5;
                }}else {
                    throw new NotValidation();
                }

            }
        }catch (NumberExeption e) {
            System.out.println("Введите пожалуйста число от 0 до 9");
            takeAShip1(player);
        }catch(NotValidation e){
            System.out.println("Введите пожалуйста валидный корабль");
            takeAShip1(player);
        }
        System.out.println("Корабль четырехпалубный выставлен, убедись !)");
        return 1;

    }


//    public takeAShip2() {
//        System.out.println("Введи координаты трехпалубного корабля в формате (x1,y1;x2,y2;x3,y3 ");
//        System.out.println("Введи координаты трехпалубного корабля в формате (x1,y1;x2,y2;x3,y3 ");
//    }
//
//    public takeAShip3() {
//        System.out.println("Введи координаты двухпалубного корабля в формате (x1,y1;x2,y2");
//        System.out.println("Введи координаты двухпалубного корабля в формате (x1,y1;x2,y2");
//        System.out.println("Введи координаты двухпалубного корабля в формате (x1,y1;x2,y2");
//    }
//
//    public takeAShip4() {
//        System.out.println("Введи координаты однопалубного корабля в формате (x1,y1");
//        System.out.println("Введи координаты однопалубного корабля в формате (x1,y1");
//        System.out.println("Введи координаты однопалубного корабля в формате (x1,y1");
//        System.out.println("Введи координаты однопалубного корабля в формате (x1,y1");
//    }
}



//    public Object takeAShip1(Player player) {
//        System.out.println("Начнем раставлять корабли по полю. Другой игрок не смотри!!!");
//        System.out.println("Введи координаты четырехпалубного корабля в формате (x1,y1;x2,y2;x3,y3;x4,y4) ");
//        try {int i = 1;
//            while (i > 0) {
//                int x1 = scanner.nextInt();
//                int y1 = scanner.nextInt();
//                int x2 = scanner.nextInt();
//                int y2 = scanner.nextInt();
//                int x3 = scanner.nextInt();
//                int y3 = scanner.nextInt();
//                int x4 = scanner.nextInt();
//                int y4 = scanner.nextInt();
//                if ((x1 > 9) || (y1 > 9) || (x1 < 0) || (y1 < 0)) {
//                    if ((x2 > 9) || (y2 > 9) || (x2 < 0) || (y2 < 0)) {
//                        if ((x3 > 9) || (y3 > 9) || (x3 < 0) || (y3 < 0) ) {
//                            if (((x4 > 9) || (x4 < 0)) || ((y4 > 9) || (y4 < 0))) {
//                                throw new NumberExeption();
//                            }
//                            // on 2 block
//                        }else if((((x2 == x1-1) || (x2 == x1) || (x2 == x1+1))&& y2 == y1) ||
//                                (((y2 == y1-1) || (y2 == y1) || (y2 == y1+1))&& x2 == x1)){
//                            // on 3 block
//                            if(((x2 == x1) && (x3 == x2) && (y1 != y2) && (y3 != y2)) ||
//                                    ((y2 == y1) && (y3 == y2) && (x1 != x2) && (x3 != x2))) {
//                                if (((((x2 < x1) && (x3 == x2 - 1)) || ((x2 > x1) &&(x3 == x2 + 1))) && y3 == y2) ||
//                                        ((((y2 < y1) && (y3 == y2 - 1)) || ((y2 > y1) && (y3 == y2 + 1))) && x3 == x2)){
//                                    // on 4 block
//                                    if(((x2 == x1) && (x3 == x2) && (x4 == x3) && (y1 != y2) && (y3 != y2) && (y4 != y3)) ||
//                                            ((y2 == y1) && (y3 == y2) && (y4 == y3) && (x1 != x2) && (x3 != x2) && (x4 != x3))) {
//                                        if (((((x3 < x2) && (x4 == x3 - 1)) || ((x3 > x2) &&(x4 == x3 + 1))) && y4 == y3) ||
//                                                ((((y3 < y2) && (y4 == y3 - 1)) || ((y3 > y2) && (y4 == y3 + 1))) && x4 == x3)) {
//                                            player.massivOfCells[y1][x1] = Ship.SHIP;
//                                            player.massivOfCells[y2][x2] = Ship.SHIP;
//                                            player.massivOfCells[y3][x3] = Ship.SHIP;
//                                            player.massivOfCells[y4][x4] = Ship.SHIP;
//                                            i = -5;
//                                        }}}}}}}else {
//                    throw new NotValidation();
//                }
//
//            }
//        }catch (NumberExeption e) {
//            System.out.println("Введите пожалуйста число от 0 до 9");
//            takeAShip1(player);
//        }catch(NotValidation e){
//            System.out.println("Введите пожалуйста валидный корабль");
//            takeAShip1(player);
//        }
//        System.out.println("Корабль четырехпалубный выставлен, убедись !)");
//        return 1;
//
//    }
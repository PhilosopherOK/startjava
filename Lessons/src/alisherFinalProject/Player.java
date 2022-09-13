package alisherFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String getName() {
        return name;
    }

    private String name;




    public List <Integer > listOfCoordinate = new ArrayList<>();
    public Object[][] massivOfCells = new Object[][]{
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},

    };

    public Object[][] massivOfWar = new Object[][]{
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
            {Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER,
                    Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER, Ship.WATTER},
    };

    public Player(String name) {
        this.name = name;
    }

    public void printBoardOfWar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(massivOfWar[i][j]);
            }
            System.out.println();
        }

    }

    public void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(massivOfCells[i][j]);
            }
            System.out.println();
        }

    }
    public void oreol() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (massivOfCells[y][x] == Ship.SHIP) {
                    //first for angle
                    if ((y == 0) && (x == 0)) {
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x + 1] = Ship.OREOL;
                        }
                    }
                    if ((y == 0) && (x == 9)) {
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                    }
                    if ((y == 9) && (x == 0)) {
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                    }
                    if ((y == 9) && (x == 9)) {
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                    }
                    //for thighs
                    if ((y == 0) && (x != 0) && (x != 9)) {
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x + 1] = Ship.OREOL;
                        }
                    }
                    if ((y == 9) && (x != 0) && (x != 9)) {
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x + 1] = Ship.OREOL;
                        }
                    }
                    if ((x == 0) && (y != 0) && (y != 9)) {
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x + 1] = Ship.OREOL;
                        }
                    }
                    if ((x == 9) && (y != 0) && (y != 9)) {
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x - 1] = Ship.OREOL;
                        }
                    }
                    //for any place
                    if ((x != 0) && (x != 9) && (y != 0) && (y != 9)) {
                        if (massivOfCells[y - 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x] != Ship.SHIP) {
                            massivOfCells[y - 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y - 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y - 1][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x - 1] != Ship.SHIP) {
                            massivOfCells[y][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y][x + 1] != Ship.SHIP) {
                            massivOfCells[y][x + 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x - 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x - 1] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x] != Ship.SHIP) {
                            massivOfCells[y + 1][x] = Ship.OREOL;
                        }
                        if (massivOfCells[y + 1][x + 1] != Ship.SHIP) {
                            massivOfCells[y + 1][x + 1] = Ship.OREOL;
                        }
                    }
                }
            }
        }
        printBoard();
    }
}
package alisherFinalProject;

import Exeption.NotValidation;
import Exeption.ThereIsAnotherShip;
import alisherDay14.NumberExeption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameCore {


    private int scoreOfRound = 1;
    private boolean inGame = true;

    public boolean getInGame() {
        return inGame;
    }

    Scanner scanner = new Scanner(System.in);


    public void Game(Player player1, Player player2) {
        takeAShips(player1);
        System.out.println();
        System.out.println();
        System.out.println("Вверх не мотай  -_- не придумал как еще будет :)");
        takeAShips(player2);
        System.out.println();
        System.out.println();
        System.out.println("Вверх не мотай  -_- не придумал как еще будет :)");
        while (inGame) {
            System.out.println("Стреляет игрок " + player1.getName());
            player2.printBoardOfWar();
            int hitX = scanner.nextInt();
            int hitY = scanner.nextInt();
            if (player2.massivOfCells[hitX][hitY] == Ship.SHIP) {
                player2.massivOfCells[hitX][hitY] = Ship.HIT;
                player2.massivOfWar[hitX][hitY] = Ship.HIT;
                player2.printBoardOfWar();
                System.out.println("Попал зараза  (?_?)");
                while (true) {
                    System.out.println("Стреляй снова Luckyman  *^_^* ");
                    hitX = scanner.nextInt();
                    hitY = scanner.nextInt();
                    if (player2.massivOfCells[hitX][hitY] == Ship.SHIP) {
                        player2.massivOfCells[hitX][hitY] = Ship.HIT;
                        player2.massivOfWar[hitX][hitY] = Ship.HIT;
                        player1.printBoardOfWar();
                        System.out.println("Снова попал черт (o_O)");
                    } else {
                        player2.massivOfWar[hitX][hitY] = Ship.MISS;
                        player2.printBoardOfWar();
                        System.out.println("А было так близко  m (._.) m");
                        break;
                    }
                }
            } else {
                player2.massivOfWar[hitX][hitY] = Ship.MISS;
                player2.printBoardOfWar();
                System.out.println("Ну ты и зоркий глаз, мимо (^__(..)__^)");
            }
            whoseShipIsDead(player2);


            System.out.println("Стреляет игрок " + player2.getName());
            player1.printBoardOfWar();
            hitX = scanner.nextInt();
            hitY = scanner.nextInt();
            if (player1.massivOfCells[hitX][hitY] == Ship.SHIP) {
                player1.massivOfCells[hitX][hitY] = Ship.HIT;
                player1.massivOfWar[hitX][hitY] = Ship.HIT;
                player1.printBoardOfWar();
                System.out.println("Попал зараза  (?_?)");
                while (true) {
                    System.out.println("Стреляй снова Luckyman  *^_^* ");
                    hitX = scanner.nextInt();
                    hitY = scanner.nextInt();
                    if (player1.massivOfCells[hitX][hitY] == Ship.SHIP) {
                        player1.massivOfCells[hitX][hitY] = Ship.HIT;
                        player1.massivOfWar[hitX][hitY] = Ship.HIT;
                        player1.printBoardOfWar();
                        System.out.println("Снова попал черт (o_O)");
                    } else {
                        player1.massivOfWar[hitX][hitY] = Ship.MISS;
                        player1.printBoardOfWar();
                        System.out.println("А было так близко  m (._.) m");
                        break;
                    }
                }
            } else {
                player1.massivOfWar[hitX][hitY] = Ship.MISS;
                player1.printBoardOfWar();
                System.out.println("Ну ты и зоркий глаз, мимо (^__(..)__^)");
            }
            whoseShipIsDead(player1);
            checkToFinish(player1, player2);
        }
    }

    public Object takeAShips(Player player) {
        player.printBoard();
        takeAShip1(player);
        player.oreol();
        takeAShip2(player);
        player.oreol();
        takeAShip2(player);
        player.oreol();
        takeAShip3(player);
        player.oreol();
        takeAShip3(player);
        player.oreol();
        takeAShip3(player);
        player.oreol();
        takeAShip4(player);
        player.oreol();
        takeAShip4(player);
        player.oreol();
        takeAShip4(player);
        player.oreol();
        takeAShip4(player);
        player.oreol();

        return player.massivOfCells;
    }

    public Object takeAShip1(Player player) {
        System.out.println("Начнем раставлять корабли по полю. Другой игрок не смотри!!!");
        System.out.println("Введи координаты четырехпалубного корабля в формате по 2 цыфры через пробел (x1,y1;x2,y2;x3,y3;x4,y4)");
        try {
            int i = 1;
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
                } else if ((((x2 == x1 - 1) || (x2 == x1) || (x2 == x1 + 1)) && y2 == y1) || (((y2 == y1 - 1) || (y2 == y1) || (y2 == y1 + 1)) && x2 == x1)) {
                } else {
                    throw new NotValidation();
                }
                int x3 = scanner.nextInt();
                int y3 = scanner.nextInt();

                if ((x3 > 9) || (y3 > 9) || (x3 < 0) || (y3 < 0)) {
                    throw new NumberExeption();
                }
                if (((((x2 < x1) && (x3 != x2 - 1)) || ((x2 > x1) && (x3 != x2 + 1))) && y3 == y2) ||
                        ((((y2 < y1) && (y3 != y2 - 1)) || ((y2 > y1) && (y3 != y2 + 1))) && x3 == x2)) {
                    throw new NotValidation();
                } else if (((x2 == x1) && (x3 == x2) && (y1 != y2) && (y3 != y2)) ||
                        ((y2 == y1) && (y3 == y2) && (x1 != x2) && (x3 != x2))) {
                    if ((((x3 == x2 - 1) || (x3 == x2 + 1)) && y3 == y2) ||
                            (((y3 == y2 - 1) || (y3 == y2 + 1)) && x3 == x2)) {
                    }
                } else {
                    throw new NotValidation();
                }

                int x4 = scanner.nextInt();
                int y4 = scanner.nextInt();

                if (((x4 > 9) || (x4 < 0)) || ((y4 > 9) || (y4 < 0))) {
                    throw new NumberExeption();
                }
                if (((((x3 < x2) && (x4 != x3 - 1)) || ((x3 > x2) && (x4 != x3 + 1))) && y4 == y3) ||
                        ((((y3 < y2) && (y4 != y3 - 1)) || ((y3 > y2) && (y4 != y3 + 1))) && x4 == x3)) {
                    throw new NotValidation();
                } else if (((x2 == x1) && (x3 == x2) && (x4 == x3) && (y1 != y2) && (y3 != y2) && (y4 != y3)) ||
                        ((y2 == y1) && (y3 == y2) && (y4 == y3) && (x1 != x2) && (x3 != x2) && (x4 != x3))) {
                    if ((((x4 == x3 - 1) || (x4 == x3 + 1)) && y4 == y3) ||
                            (((y4 == y3 - 1) || (y4 == y3 + 1)) && x4 == x3)) {

                        player.massivOfCells[y1][x1] = Ship.SHIP;
                        player.massivOfCells[y2][x2] = Ship.SHIP;
                        player.massivOfCells[y3][x3] = Ship.SHIP;
                        player.massivOfCells[y4][x4] = Ship.SHIP;
                        player.listOfCoordinate.add(y1);
                        player.listOfCoordinate.add(x1);
                        player.listOfCoordinate.add(y2);
                        player.listOfCoordinate.add(x2);
                        player.listOfCoordinate.add(y3);
                        player.listOfCoordinate.add(x3);
                        player.listOfCoordinate.add(y4);
                        player.listOfCoordinate.add(x4);
                        i = -5;
                    }
                } else {
                    throw new NotValidation();
                }

            }
        } catch (NumberExeption e) {
            System.out.println("Введите пожалуйста число от 0 до 9");
            takeAShip1(player);
        } catch (NotValidation e) {
            System.out.println("Введите пожалуйста валидный корабль");
            takeAShip1(player);
        }
        System.out.println("Корабль четырехпалубный выставлен, убедись !)");
        return player.massivOfCells;
    }

    public Object takeAShip2(Player player) {
        System.out.println("Введи координаты трехпалубного корабля в формате по 2 цыфры через пробел (x1,y1;x2,y2;x3,y3)");
        try {
            int i = 1;
            while (i > 0) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();

                if ((x1 > 9) || (y1 > 9) || (x1 < 0) || (y1 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y1][x1] == Ship.SHIP) ||
                        (player.massivOfCells[y1][x1] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();

                if ((x2 > 9) || (y2 > 9) || (x2 < 0) || (y2 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y2][x2] == Ship.SHIP) ||
                        (player.massivOfCells[y2][x2] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                if ((((x2 == x1 - 1) || (x2 == x1) || (x2 == x1 + 1)) && y2 == y1) ||
                        (((y2 == y1 - 1) || (y2 == y1) || (y2 == y1 + 1)) && x2 == x1)) {
                } else {
                    throw new NotValidation();
                }
                int x3 = scanner.nextInt();
                int y3 = scanner.nextInt();

                if ((x3 > 9) || (y3 > 9) || (x3 < 0) || (y3 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y3][x3] == Ship.SHIP) ||
                        (player.massivOfCells[y3][x3] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                if (((((x2 < x1) && (x3 != x2 - 1)) || ((x2 > x1) && (x3 != x2 + 1))) && y3 == y2) ||
                        ((((y2 < y1) && (y3 != y2 - 1)) || ((y2 > y1) && (y3 != y2 + 1))) && x3 == x2)) {
                    throw new NotValidation();
                }
                if (((x2 == x1) && (x3 == x2) && (y1 != y2) && (y3 != y2)) ||
                        ((y2 == y1) && (y3 == y2) && (x1 != x2) && (x3 != x2))) {
                    if ((((x3 == x2 - 1) || (x3 == x2 + 1)) && y3 == y2) ||
                            (((y3 == y2 - 1) || (y3 == y2 + 1)) && x3 == x2)) {
                        player.massivOfCells[y1][x1] = Ship.SHIP;
                        player.massivOfCells[y2][x2] = Ship.SHIP;
                        player.massivOfCells[y3][x3] = Ship.SHIP;
                        player.listOfCoordinate.add(y1);
                        player.listOfCoordinate.add(x1);
                        player.listOfCoordinate.add(y2);
                        player.listOfCoordinate.add(x2);
                        player.listOfCoordinate.add(y3);
                        player.listOfCoordinate.add(x3);
                        i = -5;
                    }
                } else {
                    throw new NotValidation();
                }
            }
        } catch (NumberExeption e) {
            System.out.println("Введите пожалуйста число от 0 до 9");
            takeAShip2(player);
        } catch (NotValidation e) {
            System.out.println("Введите пожалуйста валидный корабль");
            takeAShip2(player);
        } catch (ThereIsAnotherShip e) {
            System.out.println("Уже есть корабль, выберете другое место");
            takeAShip2(player);
        }
        System.out.println("Корабль трехпалубный выставлен, убедись !)");
        return player.massivOfCells;
    }

    public Object takeAShip3(Player player) {
        System.out.println("Введи координаты двухпалубного корабля в формате по 2 цыфры через пробел (x1,y1;x2,y2)");
        try {
            int i = 1;
            while (i > 0) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();

                if ((x1 > 9) || (y1 > 9) || (x1 < 0) || (y1 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y1][x1] == Ship.SHIP) ||
                        (player.massivOfCells[y1][x1] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();

                if ((x2 > 9) || (y2 > 9) || (x2 < 0) || (y2 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y2][x2] == Ship.SHIP) ||
                        (player.massivOfCells[y2][x2] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                if ((((x2 == x1 - 1) || (x2 == x1) || (x2 == x1 + 1)) && y2 == y1) ||
                        (((y2 == y1 - 1) || (y2 == y1) || (y2 == y1 + 1)) && x2 == x1)) {
                    player.massivOfCells[y1][x1] = Ship.SHIP;
                    player.massivOfCells[y2][x2] = Ship.SHIP;
                    player.listOfCoordinate.add(y1);
                    player.listOfCoordinate.add(x1);
                    player.listOfCoordinate.add(y2);
                    player.listOfCoordinate.add(x2);
                    i = -5;
                } else {
                    throw new NotValidation();
                }
            }
        } catch (NumberExeption e) {
            System.out.println("Введите пожалуйста число от 0 до 9");
            takeAShip3(player);
        } catch (NotValidation e) {
            System.out.println("Введите пожалуйста валидный корабль");
            takeAShip3(player);
        } catch (ThereIsAnotherShip e) {
            System.out.println("Уже есть корабль, выберете другое место");
            takeAShip3(player);
        }
        System.out.println("Корабль двухпалобный выставлен, убедись !)");
        return player.massivOfCells;
    }


    public Object takeAShip4(Player player) {
        System.out.println("Введи координаты однопалубного корабля в формате по 2 цыфры через пробел (x1,y1)");
        try {
            int i = 1;
            while (i > 0) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();

                if ((x1 > 9) || (y1 > 9) || (x1 < 0) || (y1 < 0)) {
                    throw new NumberExeption();
                }
                if ((player.massivOfCells[y1][x1] == Ship.SHIP) ||
                        (player.massivOfCells[y1][x1] == Ship.OREOL)) {
                    throw new ThereIsAnotherShip();
                }
                player.massivOfCells[y1][x1] = Ship.SHIP;
                player.listOfCoordinate.add(y1);
                player.listOfCoordinate.add(x1);
                i = -5;
            }
        } catch (NumberExeption e) {
            System.out.println("Введите пожалуйста число от 0 до 9");
            takeAShip4(player);
        } catch (ThereIsAnotherShip e) {
            System.out.println("Уже есть корабль, выберете другое место");
            takeAShip4(player);
        }
        System.out.println("Корабль однопалубный выставлен, убедись !)");
        return player.massivOfCells;
    }


    public boolean checkToFinish(Player player1, Player player2) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if ((player1.massivOfCells[y][x] == Ship.SHIP) &&
                        (player2.massivOfCells[y][x] == Ship.SHIP)) {
                    scoreOfRound++;
                    System.out.println("Раунд " + scoreOfRound);
                } else {
                    inGame = false;
                }
            }
        }
        return inGame;
    }


    public void whoseShipIsDead(Player player) {
        int score4pal = 0;
        int score3pal = 0;
        int score2pal = 0;
        int score1pal = 0;
        //for 4 palubnii
        for (int i = 0; i < 8; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i + 1)] == Ship.HIT) {
                score4pal++;
            }
        }
        if (score4pal == 4) {
            for (int i = 0; i < 8; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }

        //for 3 palubnii
        for (int i = 8; i < 14; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                score3pal++;
            }
        }
        if (score3pal == 3) {
            for (int i = 8; i < 14; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }
        score3pal = 0;
        for (int i = 14; i < 20; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                score3pal++;
            }
        }
        if (score3pal == 3) {
            for (int i = 14; i < 20; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }

//for 2 palubnii
        for (int i = 20; i < 24; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                score2pal++;
            }
        }
        if (score2pal == 2) {
            for (int i = 20; i < 24; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }
        score2pal = 0;

        for (int i = 24; i < 28; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                score2pal++;
            }
        }
        if (score2pal == 2) {
            for (int i = 24; i < 28; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }
        score2pal = 0;


        for (int i = 28; i < 32; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                score2pal++;
            }
        }
        if (score2pal == 2) {
            for (int i = 28; i < 32; i += 2) {
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }


//for 1 palubnii
        for (int i = 32; i < 40; i += 2) {
            if (player.massivOfCells[player.listOfCoordinate.get(i)]
                    [player.listOfCoordinate.get(i+1)] == Ship.HIT){
                player.massivOfCells[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
                player.massivOfWar[player.listOfCoordinate.get(i)]
                        [player.listOfCoordinate.get(i + 1)] = Ship.KILL;
            }
        }
        player.printBoardOfWar();

    }
}
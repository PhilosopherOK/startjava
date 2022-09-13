package alisherFinalProject;

public class Player {

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

    public void printBourd() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(massivOfCells[i][j]);
            }
            System.out.println();
        }

    }
}

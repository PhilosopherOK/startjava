package alisherFinalProject;

public class StartGame {
    public static void main(String[] args) {
        Player playerVlad = new Player();
        GameCore core1 = new GameCore();
        playerVlad.printBourd();
        core1.takeAShip1(playerVlad);
        playerVlad.printBourd();
    }
}

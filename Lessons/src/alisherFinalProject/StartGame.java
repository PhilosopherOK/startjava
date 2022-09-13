package alisherFinalProject;

public class StartGame {
    public static void main(String[] args) {
        Player player1 = new Player("Vlad");
        Player player2 = new Player("Rost");
        GameCore core1 = new GameCore();
        core1.Game(player1, player2);
    }
}

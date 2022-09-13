public class WolfTest {
    public static void main(String[] args){
        wolf wolf = new wolf();

        wolf.getWalk();
        wolf.getColor();
        System.out.println(wolf.getColor());

        wolf.getSit();
        wolf.getRun();
        wolf.setRun(3);
        wolf.getHowl(3,5);
    }
}

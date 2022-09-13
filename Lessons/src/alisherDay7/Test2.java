package alisherDay7;

import java.util.Random;

//2. Дворовый футбол.
//        Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player ),
//        содержит следующие поля:
//        - поле “выносливость” (англ. stamina ), разное для каждого экземпляра
//        - константы “максимальная выносливость” (англ. MAX_STAMINA ) со значением
//        100 и “минимальная выносливость” (англ. MIN_STAMINA ) со значением 0,
//        единые для всех экземпляров
//        - статическое поле countPlayers , которое считает количество игроков на
//        футбольном поле (изначально их 0, выходом на поле считается создание
//        экземпляра класса, уходом - когда игрок устал).
//        - геттер для поля “выносливость”
//        и следующие методы:
//        run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость
//        на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и
//        он уходит с поля.
//        info() - выводит сообщение в зависимости от количества игроков на поле. Если
//        игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
//        свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
//        пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
//        Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при
//        создании должен иметь значение выносливости от 90 до 100 (генерировать внутри
//        конструктора). Создать 6 игроков, вызвать метод info() . При попытке создать 7,8 …
//        n игрока, количество игроков на поле меняться не должно, проверить это.
//        Примените к игроку метод run() , пока он полностью не выдохнется (отрицательное
//        значение выносливости не допускается). Вывести количество игроков на поле.
//        *По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика
//        русского языка учитывалась.
public class Test2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        player1.info();
        System.out.println(player1.getStamina());
        int relaxPlay = player1.getStamina() + 1;
        for (int i = 0; i < relaxPlay; i++) {
            player1.run();
        }
        player1.info();
    }

}
class Player{
    Random random = new Random();

    public int getStamina() {
        return stamina;
    }
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player() {
        this.stamina = random.nextInt(10)+90;
        if (countPlayers != 6){
            countPlayers++;
        }
    }

    public int run(){
        if (stamina == MIN_STAMINA){
            countPlayers--;
        }else {
            stamina--;
        }
        return stamina;
    }
    public static void info(){
        if (countPlayers == 6){
            System.out.println("На поле нет свободных мест");
        }else{
            System.out.println("Команды неполные. На поле еще есть "+ (6-countPlayers) +" свободных мест");
        }


    }



}

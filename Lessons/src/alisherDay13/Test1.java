package alisherDay13;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Martin");
        User user3 = new User("Izera");
        user1.subscribe(user2);
        user2.subscribe(user3);
        user3.subscribe(user2);
        user1.sendMessage(user2,"hi man !");
        user1.sendMessage(user2,"how are you ?");
        user1.sendMessage(user2,"are u ok ?");
        user2.sendMessage(user1,"hi man !");
        user2.sendMessage(user1,"its fine !");
        MessageDatabase.showDialog(user1, user2);
    }
}

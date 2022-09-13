package alisherDay13;

import java.util.List;
import java.util.ArrayList;

public class MessageDatabase {
    public static List<Message> getMessages() {
        return messages;
    }

    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }


    public static void showDialog(User u1, User u2) {


        for(Message message:messages){
            if((message.getSender() == u1)&&(message.getReceiver() == u2)
                    || (message.getSender() == u2)&&(message.getReceiver() == u1)){
                System.out.println(message.getSender() + ": "+ message.getText());
            }
        }
    }
}


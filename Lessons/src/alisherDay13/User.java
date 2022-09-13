package alisherDay13;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList<>();

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }


    public User(String username) {
        this.username = username;
        List<User> subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
            if (isSubscribed(user) == false) {
                subscriptions.add(user);
                System.out.println("Person " + this + " is will be subscribe with " + user);
            }else{
                System.out.println("Person " + this + " subscribe with " + user);
            }

    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this,user,text);
    }

    public String toString() {
        return username;
    }
}

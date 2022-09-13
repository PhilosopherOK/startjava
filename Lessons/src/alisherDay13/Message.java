package alisherDay13;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Message {
    Calendar thisTime = new GregorianCalendar();

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private User sender;
    private User receiver;
    private String text;
    private Date date;
    public Message(User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = thisTime.getTime();
    }
    public String toString(){
        return "FROM - "+ sender +"\n"+
                "; TO - " + receiver +"\n"+
                "; ON - " + date +"  "+"\n"+
                text;
    }

}

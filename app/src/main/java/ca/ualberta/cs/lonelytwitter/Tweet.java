package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;

    public void setMessage(String message) throws TooLongTweetException {
        if(message.length()>140){
            throw new TooLongTweetException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();

    public String toString(){
        return this.date.toString() + "|" + this.message;
    }
}
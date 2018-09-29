package ca.ualberta.cs.lonelytwitter;

public class TooLongTweetException extends Exception {
    TooLongTweetException(){
        super("this message is too long! Please keep your tweets within 140 characters.");
    }
}

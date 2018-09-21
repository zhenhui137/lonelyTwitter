package ca.ualberta.cs.lonelytwitter;

public class TooLongTweetException extends Tweet {
    TooLongTweetException(){
        super("thismessage is too long! Please keep your tweets within 140 characters.");
    }
}

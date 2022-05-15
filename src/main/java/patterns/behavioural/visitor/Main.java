package patterns.behavioural.visitor;

import patterns.behavioural.visitor.accounts.FacebookAccount;
import patterns.behavioural.visitor.accounts.InstagramAccount;
import patterns.behavioural.visitor.accounts.TwitterAccount;
import patterns.behavioural.visitor.message.MessagingVisitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var messagingVisitor = new MessagingVisitor();

        var accounts = Arrays.asList(
                new TwitterAccount("johnDoe24", "https://twitter.com/johnDoe24"),
                new FacebookAccount("johnDoe", "https://facebook.com/johnDoe"),
                new InstagramAccount("jDoe2", "https://instagram.com/jDoe2")
        );

        messagingVisitor.sendMessage(accounts);
    }

}

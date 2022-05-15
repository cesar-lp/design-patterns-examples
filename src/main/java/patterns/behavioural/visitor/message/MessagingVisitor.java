package patterns.behavioural.visitor.message;

import patterns.behavioural.visitor.accounts.FacebookAccount;
import patterns.behavioural.visitor.accounts.InstagramAccount;
import patterns.behavioural.visitor.accounts.SocialMediaAccount;
import patterns.behavioural.visitor.accounts.TwitterAccount;

import java.util.List;

public class MessagingVisitor implements Visitor {

    @Override
    public void message(InstagramAccount account) {
        System.out.printf("Sending DM to Instagram user %s at %s\n", account.getUserName(), account.getProfileUrl());
    }

    @Override
    public void message(FacebookAccount account) {
        System.out.printf("Sending message to Facebook user %s at %s\n", account.getUserName(), account.getProfileUrl());
    }

    @Override
    public void message(TwitterAccount account) {
        System.out.printf("Sending DM to Twitter user %s at %s\n", account.getUserName(), account.getProfileUrl());
    }

    public void sendMessage(List<SocialMediaAccount> accounts) {
        accounts.forEach(account -> account.accept(this));
    }
}

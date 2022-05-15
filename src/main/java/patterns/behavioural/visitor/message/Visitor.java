package patterns.behavioural.visitor.message;

import patterns.behavioural.visitor.accounts.FacebookAccount;
import patterns.behavioural.visitor.accounts.InstagramAccount;
import patterns.behavioural.visitor.accounts.TwitterAccount;

public interface Visitor {

    void message(InstagramAccount instagramAccount);
    void message(FacebookAccount facebookAccount);
    void message(TwitterAccount twitterAccount);

}

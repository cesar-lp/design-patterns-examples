package patterns.behavioural.visitor.accounts;

import patterns.behavioural.visitor.message.Visitor;

public class TwitterAccount extends SocialMediaAccount {

    public TwitterAccount(String userName, String profileUrl) {
        super(userName, profileUrl);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.message(this);
    }
}

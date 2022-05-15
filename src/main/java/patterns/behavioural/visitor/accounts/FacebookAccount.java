package patterns.behavioural.visitor.accounts;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.visitor.message.Visitor;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FacebookAccount extends SocialMediaAccount {

    public FacebookAccount(String userName, String profileUrl) {
        super(userName, profileUrl);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.message(this);
    }
}

package patterns.behavioural.visitor.accounts;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.visitor.message.MessageReceiver;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public abstract class SocialMediaAccount implements MessageReceiver {

    String userName;
    String profileUrl;

}

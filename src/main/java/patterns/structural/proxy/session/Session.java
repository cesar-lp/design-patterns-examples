package patterns.structural.proxy.session;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Session {

    final String id;
    final String ownerId;
    final Integer expirationTimeInMS;

    public Session(String ownerId) {
        id = UUID.randomUUID().toString();
        expirationTimeInMS = 15000;
        this.ownerId = ownerId;
    }
}

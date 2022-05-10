package patterns.structural.facade.message;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConnectionEncryptor {

    final Connection connection;

    public void open() {
        System.out.println("Establishing connection...");
    }

    public void sendMessage(String message) {
        System.out.println("Sending encrypted message...");
    }

    public void close() {
        System.out.println("Closing connection...");
    }
}

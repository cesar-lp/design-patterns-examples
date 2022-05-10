package patterns.structural.facade.message;

public class MessageTransporter {

    public void sendMessage(String from, String to, String message) {
        System.out.println("Creating connection...");
        var connection = new Connection(from, to);

        System.out.println("Connection created. Securing connection...");
        var encryptedConnection = new ConnectionEncryptor(connection);

        encryptedConnection.open();
        encryptedConnection.sendMessage(message);
        encryptedConnection.close();
    }
}

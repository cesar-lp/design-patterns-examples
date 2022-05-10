package patterns.structural.facade;

import patterns.structural.facade.message.MessageTransporter;

public class Main {

    public static void main(String[] args) {
        var messageTransporter = new MessageTransporter();
        messageTransporter.sendMessage("Elon Musk", "Jack Dorsey", "Hey, what if I buy Twitter?");
    }

}

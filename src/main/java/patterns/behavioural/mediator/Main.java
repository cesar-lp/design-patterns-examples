package patterns.behavioural.mediator;

import patterns.behavioural.mediator.chatroom.Participant;
import patterns.behavioural.mediator.chatroom.ChatRoom;

public class Main {

    public static void main(String[] args) {
        var network = new ChatRoom();
        var dillon = new Participant("Dillon");
        var anna = new Participant("Anna");
        var tom = new Participant("Tom");

        network.add(dillon, anna, tom);

        anna.send("How's everyone doing?");
        dillon.send("Hi Anna, how are you?", anna);
        anna.send("Dillon! It's been so long, I'm doing well and you?", dillon);
    }

}

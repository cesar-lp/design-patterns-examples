package patterns.behavioural.mediator.chatroom;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Participant {

    final String name;
    ChatRoom chatRoom;

    public Participant(String name) {
       this.name = name;
    }

    public void send(String message, Participant to) {
        chatRoom.send(message, this, to);
    }

    public void send(String message) {
        chatRoom.send(message, this);
    }

    public void receive(String message, Participant from) {
        System.out.printf("%s is receiving message from %s: %s\n", name, from.getName(), message);
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

}

package patterns.behavioural.mediator.chatroom;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChatRoom {

    List<Participant> participants = new ArrayList<>();

    public void add(Participant... newParticipants) {
        for (var participant : newParticipants) {
            participant.setChatRoom(this);
        }

        participants.addAll(List.of(newParticipants));
    }

    public void send(String message, Participant from) {
        send(message, from, null);
    }

    public void send(String message, Participant from, Participant to) {
        if (to != null) {
            to.receive(message, from);
        } else {
            participants
                    .stream()
                    .filter(member -> member != from)
                    .forEach(member -> member.receive(message, from));
        }
    }
}

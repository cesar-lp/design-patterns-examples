package patterns.behavioural.observer.publishers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.observer.subscribers.Subscriber;

import java.util.LinkedList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class Publisher {

    final List<Subscriber> subscribers = new LinkedList<>();

    public void attach(Subscriber subscriber) {
        System.out.printf("\nPublisher: attaching subscriber %s\n", subscriber);
        subscriber.update(this);

        System.out.printf("Publisher: subscriber updated to current state %s\n", subscriber);
        subscribers.add(subscriber);

        System.out.print("Publisher: subscriber attached\n");
    }

    public void detach(Subscriber subscriber) {
        System.out.printf("\nPublisher: detaching subscriber %s\n", subscriber);
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers() {
        System.out.print("\nPublisher: notifying subscribers\n");
        subscribers.forEach(subscriber -> subscriber.update(this));
    }

    public void displaySubscribers() {
        if (subscribers.isEmpty()) {
            System.out.println("Publisher: no subscriber was found");
            return;
        }

        System.out.println("Publisher: listing subscribers");
        subscribers.forEach(subscriber -> {
            System.out.printf("\t- %s\n", subscriber.toString());
        });
    }
}

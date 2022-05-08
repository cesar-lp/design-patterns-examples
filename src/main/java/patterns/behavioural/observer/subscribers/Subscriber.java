package patterns.behavioural.observer.subscribers;

import patterns.behavioural.observer.publishers.Publisher;

public interface Subscriber {

    void update(Publisher publisher);

}

package patterns.behavioural.visitor.message;

public interface MessageReceiver {
    void accept(Visitor visitor);
}

package patterns.behavioural.memento.editor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class TextArea {

    String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento snapshot() {
        System.out.println("TextArea snapshot: " + text);
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getText();
        System.out.println("TextArea restored to: " + text);
    }

    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    @AllArgsConstructor
    public static class Memento {

        String text;

        private String getText() {
            return text;
        }
    }

}

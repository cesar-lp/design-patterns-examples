package patterns.behavioural.memento.editor;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Deque;
import java.util.LinkedList;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TextEditor {

    Deque<TextArea.Memento> history = new LinkedList<>();
    TextArea textArea = new TextArea();

    public void write(String text) {
        textArea.setText(text);
        history.add(textArea.snapshot());
    }

    public void undo() {
        textArea.restore(history.pop());
    }

}

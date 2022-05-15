package patterns.behavioural.memento;

import patterns.behavioural.memento.editor.TextEditor;

public class Main {

    public static void main(String[] args) {
        var textEditor = new TextEditor();

        textEditor.write("This pattern let's you save and restore the previous state of an object.");
        textEditor.write("With this pattern you can save and restore object's state.");
        textEditor.undo();
    }

}

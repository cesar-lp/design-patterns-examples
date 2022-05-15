package patterns.creation.prototype;

import patterns.creation.prototype.elements.Button;
import patterns.creation.prototype.elements.HTMLElementRegistry;
import patterns.creation.prototype.elements.Tab;

public class Main {

    public static void main(String[] args) {
        var registry = new HTMLElementRegistry();
        registry.addElement(new Button(10, 10, "RED", "BLUE"));
        registry.addElement(new Tab(20, 10, "BLUE", "BLACK"));
        registry.addElement(new Tab(20, 10, "RED", "BLACK"));

        var elements = registry.getByTextColor("RED");

        elements.forEach(el -> System.out.println(el.getElementName()));
    }
}

package patterns.creation.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HTMLElementRegistry registry = new HTMLElementRegistry();
        registry.addElement(new Button(10, 10, "RED", "BLUE"));
        registry.addElement(new Tab(20, 10, "BLUE", "BLACK"));
        registry.addElement(new Tab(20, 10, "RED", "BLACK"));

        List<HTMLElement> elements = registry.getByTextColor("RED");

        elements.forEach(el -> System.out.println(el.getElementName()));
    }
}

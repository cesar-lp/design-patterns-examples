package patterns.creation.prototype;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class HTMLElementRegistry {

    List<HTMLElement> elements = new ArrayList<>();

    public void addElement(HTMLElement HTMLElement) {
        elements.add(HTMLElement);
    }

    List<HTMLElement> getByTextColor(String textColor) {
        return elements.stream()
            .filter(it -> it.getTextColor().equalsIgnoreCase(textColor))
            .map(HTMLElement::clone)
            .collect(toList());
    }
}

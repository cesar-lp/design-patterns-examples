package patterns.creation.prototype.elements;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Button implements HTMLElement {

    int width;
    int height;
    String textColor;
    String backgroundColor;

    public Button(HTMLElement prototype) {
        width = prototype.getWidth();
        height = prototype.getHeight();
        textColor = prototype.getTextColor();
        backgroundColor = prototype.getBackgroundColor();
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getTextColor() {
        return textColor;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getElementName() {
        return "Button";
    }

    @Override
    public HTMLElement clone() {
        return new Button(this);
    }
}

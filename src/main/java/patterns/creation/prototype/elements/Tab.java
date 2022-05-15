package patterns.creation.prototype.elements;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Tab implements HTMLElement {

    int width;
    int height;
    String textColor;
    String backgroundColor;

    public Tab(HTMLElement element) {
        width = element.getWidth();
        height = element.getHeight();
        textColor = element.getTextColor();
        backgroundColor = element.getBackgroundColor();
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
        return "Tab";
    }

    @Override
    public HTMLElement clone() {
        return new Tab(this);
    }
}

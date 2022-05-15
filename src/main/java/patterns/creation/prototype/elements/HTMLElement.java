package patterns.creation.prototype.elements;

public interface HTMLElement {
    int getWidth();
    int getHeight();
    String getTextColor();
    String getBackgroundColor();
    String getElementName();
    HTMLElement clone();
}

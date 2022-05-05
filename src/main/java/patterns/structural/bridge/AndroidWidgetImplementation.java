package patterns.structural.bridge;

public class AndroidWidgetImplementation extends AbstractWidgetImplementation {
    @Override
    public void render() {
        System.out.println("Rendering Android Widget...\n");
    }
}

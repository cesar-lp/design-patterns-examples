package patterns.structural.bridge.widget;

public class MacOSWidgetImplementation extends AbstractWidgetImplementation {

    @Override
    public void render() {
        System.out.println("Rendering Mac OS Widget...\n");
    }

}

package patterns.structural.bridge.widget;

public class AndroidWidgetImplementation extends AbstractWidgetImplementation {

    @Override
    public void render() {
        System.out.println("Rendering Android Widget...\n");
    }

}

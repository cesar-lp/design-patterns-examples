package patterns.structural.bridge.widget;

public class MacOSWidget extends AbstractWidget {

    public MacOSWidget(AbstractWidgetImplementation implementation) {
        super(implementation);
    }

    @Override
    public void display() {
        System.out.println("Displaying Mac OS Widget");
        implementation.render();
    }

}

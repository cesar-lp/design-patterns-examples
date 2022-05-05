package patterns.structural.bridge;

public class AndroidWidget extends AbstractWidget {

    public AndroidWidget(AbstractWidgetImplementation implementation) {
        super(implementation);
    }

    @Override
    public void display() {
        System.out.println("Displaying Android widget");
        implementation.render();
    }
}

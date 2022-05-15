package patterns.structural.bridge.widget;

public abstract class AbstractWidget {

    protected AbstractWidgetImplementation implementation;

    public AbstractWidget(AbstractWidgetImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void display();
}

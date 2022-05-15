package patterns.structural.bridge.factory;

import patterns.structural.bridge.widget.AbstractWidgetImplementation;
import patterns.structural.bridge.widget.MacOSWidgetImplementation;

public class MacOSWidgetImplementationFactory extends AbstractWidgetImplementationFactory {

    @Override
    public AbstractWidgetImplementation create() {
        return new MacOSWidgetImplementation();
    }

}

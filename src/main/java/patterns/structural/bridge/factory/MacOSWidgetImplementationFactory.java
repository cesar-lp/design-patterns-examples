package patterns.structural.bridge.factory;

import patterns.structural.bridge.AbstractWidgetImplementation;
import patterns.structural.bridge.MacOSWidgetImplementation;

public class MacOSWidgetImplementationFactory extends AbstractWidgetImplementationFactory {

    @Override
    public AbstractWidgetImplementation create() {
        return new MacOSWidgetImplementation();
    }

}

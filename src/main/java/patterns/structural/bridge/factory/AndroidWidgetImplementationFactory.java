package patterns.structural.bridge.factory;

import patterns.structural.bridge.AbstractWidgetImplementation;
import patterns.structural.bridge.AndroidWidgetImplementation;

public class AndroidWidgetImplementationFactory extends AbstractWidgetImplementationFactory {

    @Override
    public AbstractWidgetImplementation create() {
        return new AndroidWidgetImplementation();
    }

}

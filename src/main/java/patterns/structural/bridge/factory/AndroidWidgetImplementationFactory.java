package patterns.structural.bridge.factory;

import patterns.structural.bridge.widget.AbstractWidgetImplementation;
import patterns.structural.bridge.widget.AndroidWidgetImplementation;

public class AndroidWidgetImplementationFactory extends AbstractWidgetImplementationFactory {

    @Override
    public AbstractWidgetImplementation create() {
        return new AndroidWidgetImplementation();
    }

}

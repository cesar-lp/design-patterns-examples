package patterns.creation.factory.factories;

import patterns.creation.factory.model.Component;
import patterns.creation.factory.model.ReactComponent;

public class ReactFactory extends ComponentFactory {

    @Override
    Component create() {
        return new ReactComponent();
    }
}

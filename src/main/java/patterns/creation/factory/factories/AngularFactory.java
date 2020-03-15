package patterns.creation.factory.factories;

import patterns.creation.factory.model.AngularComponent;
import patterns.creation.factory.model.Component;

public class AngularFactory extends ComponentFactory {

    @Override
    Component create() {
        return new AngularComponent();
    }
}

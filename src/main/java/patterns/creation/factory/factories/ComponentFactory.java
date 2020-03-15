package patterns.creation.factory.factories;

import patterns.creation.factory.model.Component;

public abstract class ComponentFactory {

    abstract Component create();

    public void render() {
        Component component = create();
        component.render();
    }
}

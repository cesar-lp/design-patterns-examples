package patterns.creation.factory;

import patterns.creation.factory.factories.AngularFactory;
import patterns.creation.factory.factories.ComponentFactory;
import patterns.creation.factory.factories.ReactFactory;

public class Main {

    public static void main(String[] args) {
        String use = args[0];
        ComponentFactory factory = new ReactFactory();

        if (use.equalsIgnoreCase("ANGULAR")) {
            factory = new AngularFactory();
        }

        factory.render();
    }
}

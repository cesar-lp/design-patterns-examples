package patterns.structural.bridge;

import patterns.structural.bridge.factory.AbstractWidgetImplementationFactory;
import patterns.structural.bridge.factory.AndroidWidgetImplementationFactory;
import patterns.structural.bridge.factory.MacOSWidgetImplementationFactory;
import patterns.structural.bridge.widget.AbstractWidget;
import patterns.structural.bridge.widget.AbstractWidgetImplementation;
import patterns.structural.bridge.widget.AndroidWidget;
import patterns.structural.bridge.widget.MacOSWidget;
import patterns.structural.bridge.widget.WidgetPlatform;

public class Main {

    public static void main(String[] args) {
        // Android
        var widgetImplementation = getFactory(WidgetPlatform.ANDROID).create();
        var widget = getWidget(WidgetPlatform.ANDROID, widgetImplementation);
        widget.display();

        // Mac OS
        widgetImplementation = getFactory(WidgetPlatform.MAC_OS).create();
        widget = getWidget(WidgetPlatform.MAC_OS, widgetImplementation);
        widget.display();
    }

    private static AbstractWidgetImplementationFactory getFactory(WidgetPlatform platform) {
        switch (platform) {
            case ANDROID: return new AndroidWidgetImplementationFactory();
            case MAC_OS: return new MacOSWidgetImplementationFactory();
            default: throw new IllegalArgumentException("Invalid platform supplied");
        }
    }

    private static AbstractWidget getWidget(WidgetPlatform platform, AbstractWidgetImplementation implementation) {
        switch (platform) {
            case ANDROID: return new AndroidWidget(implementation);
            case MAC_OS: return new MacOSWidget(implementation);
            default: throw new IllegalArgumentException("Invalid platform supplied");
        }
    }

}

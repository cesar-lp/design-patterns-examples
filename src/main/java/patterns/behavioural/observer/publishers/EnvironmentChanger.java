package patterns.behavioural.observer.publishers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class EnvironmentChanger extends Publisher {

    EnvironmentCondition environmentCondition = EnvironmentCondition.NORMAL;

    public void change(EnvironmentCondition newEnvironmentCondition) {
        environmentCondition = newEnvironmentCondition;
        notifySubscribers();
    }

    public EnvironmentCondition getEnvironmentCondition() {
        return environmentCondition;
    }

}

package patterns.behavioural.state.phone;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class State {

    final Phone phone;

    public void onHomeButtonPressed() {
    }

    public void onPowerButtonPressed() {
    }

    public void onLockButtonPressed() {
    }

}

package patterns.behavioural.state.phone;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class Phone {

    State state;
    boolean isLocked = true;

    public Phone() {
        state = new OffState(this);
    }

    public void changeState(State newState) {
        state = newState;
    }

    public void onHomeButtonPressed() {
        state.onHomeButtonPressed();
    }

    public void onLockButtonPressed() {
        state.onLockButtonPressed();
    }

    public void onPowerButtonPressed() {
        state.onPowerButtonPressed();
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }
}

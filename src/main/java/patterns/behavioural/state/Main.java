package patterns.behavioural.state;

import patterns.behavioural.state.phone.Phone;

public class Main {

    public static void main(String[] args) {
        var phone = new Phone();

        phone.onHomeButtonPressed();
        phone.onLockButtonPressed();
        phone.onPowerButtonPressed();

        phone.onHomeButtonPressed();
        phone.onLockButtonPressed();
        phone.onLockButtonPressed();
        phone.onPowerButtonPressed();
    }

}

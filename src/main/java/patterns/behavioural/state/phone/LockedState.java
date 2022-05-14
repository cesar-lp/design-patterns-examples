package patterns.behavioural.state.phone;

public class LockedState extends State {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonPressed() {
        System.out.println("Turning off phone...");
        phone.changeState(new OffState(phone));
    }

    @Override
    public void onHomeButtonPressed() {
        System.out.println("Displaying home");
        phone.changeState(new ReadyState(phone));
    }

    @Override
    public void onLockButtonPressed() {
        if (phone.isLocked()) {
            System.out.println("Unlocking phone");
            phone.unlock();
            phone.changeState(new ReadyState(phone));
        }
    }
}

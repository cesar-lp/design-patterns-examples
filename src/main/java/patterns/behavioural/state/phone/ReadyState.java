package patterns.behavioural.state.phone;

public class ReadyState extends State {

    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonPressed() {
        System.out.println("Turning off phone...");
        phone.changeState(new OffState(phone));
    }

    @Override
    public void onLockButtonPressed() {
        System.out.println("Locking phone");
        phone.lock();
        phone.changeState(new LockedState(phone));
    }
}

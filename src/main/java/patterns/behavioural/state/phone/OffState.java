package patterns.behavioural.state.phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonPressed() {
        System.out.println("Turning on phone...");
        phone.changeState(new LockedState(phone));
    }
}

package patterns.structural.adapter.analogClock;

public class AnalogClock {

    public void moveHourHand(Integer hours) {
        System.out.println("Moving hour hand...");
    }

    public void moveMinuteHand(Integer minutes) {
        System.out.println("Moving minute hand...");
    }

    public void moveSecondHand(Integer seconds) {
        System.out.println("Moving second hand...");
    }
}

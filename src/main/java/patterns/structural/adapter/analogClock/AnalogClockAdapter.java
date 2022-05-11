package patterns.structural.adapter.analogClock;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.structural.adapter.clock.ClockAdapter;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnalogClockAdapter implements ClockAdapter {

    final AnalogClock clock = new AnalogClock();

    @Override
    public void displayTime(Integer hours, Integer minutes, Integer seconds) {
        clock.moveHourHand(hours);
        clock.moveMinuteHand(minutes);
        clock.moveSecondHand(seconds);
    }

}

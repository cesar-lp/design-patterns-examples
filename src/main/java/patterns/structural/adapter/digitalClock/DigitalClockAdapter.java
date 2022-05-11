package patterns.structural.adapter.digitalClock;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.structural.adapter.clock.ClockAdapter;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class DigitalClockAdapter implements ClockAdapter {

    final DigitalClock clock = new DigitalClock();

    @Override
    public void displayTime(Integer hours, Integer minutes, Integer seconds) {
        clock.displayHours(hours, "red");
        clock.displayMinutes(minutes, "blue");
        clock.displaySeconds(seconds, "yellow");
    }
}

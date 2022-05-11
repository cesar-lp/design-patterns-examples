package patterns.structural.adapter;

import patterns.structural.adapter.analogClock.AnalogClockAdapter;
import patterns.structural.adapter.clock.ClockAdapter;
import patterns.structural.adapter.digitalClock.DigitalClockAdapter;

public class Main {

    public static void main(String[] args) {
        int hours = 4;
        int minutes = 20;
        int seconds = 30;

        displayTime(new AnalogClockAdapter(), hours, minutes, seconds);
        displayTime(new DigitalClockAdapter(), hours, minutes, seconds);
    }

    private static void displayTime(ClockAdapter clockAdapter, Integer hours, Integer minutes, Integer seconds) {
        clockAdapter.displayTime(hours, minutes, seconds);
    }

}

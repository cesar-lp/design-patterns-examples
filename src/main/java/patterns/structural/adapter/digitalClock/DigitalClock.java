package patterns.structural.adapter.digitalClock;

public class DigitalClock {

    public void displayHours(Integer hours, String color) {
        System.out.println("Display hours on LCD display...");
    }

    public void displayMinutes(Integer minutes, String color) {
        System.out.println("Display minutes on LCD display...");
    }

    public void displaySeconds(Integer seconds, String color) {
        System.out.println("Display seconds on LCD display...");
    }
}

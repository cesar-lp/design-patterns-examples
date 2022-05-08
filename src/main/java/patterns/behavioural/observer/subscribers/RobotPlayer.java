package patterns.behavioural.observer.subscribers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.observer.publishers.EnvironmentChanger;
import patterns.behavioural.observer.publishers.Publisher;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class RobotPlayer implements Player, Subscriber {

    final EnvironmentChanger environmentChanger;
    Integer damage = 12;
    Integer defense = 12;

    public RobotPlayer(EnvironmentChanger environmentChanger) {
        this.environmentChanger = environmentChanger;
        this.environmentChanger.attach(this);
    }

    @Override
    public void attack() {
        System.out.println("Robot: attacking...");
    }

    @Override
    public void defend() {
        System.out.println("Robot: defending...");
    }

    @Override
    public void onDeath() {
        environmentChanger.detach(this);
    }

    @Override
    public void update(Publisher publisher) {
        if (publisher != environmentChanger) {
            return;
        }

        switch (environmentChanger.getEnvironmentCondition()) {
            case NORMAL:
            case FULL_MOON:
                updateStats(12, 12);
                break;
            case SUNNY_DAY:
                updateStats(7, 7);
                break;
            case THUNDERSTORM:
                updateStats(5, 5);
                break;
        }
    }

    private void updateStats(Integer damage, Integer defense) {
        this.damage = damage;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return String.format("Robot(damage: %d, defense %d)", damage, defense);
    }
}

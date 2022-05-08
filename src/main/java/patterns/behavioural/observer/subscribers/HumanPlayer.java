package patterns.behavioural.observer.subscribers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.observer.publishers.EnvironmentChanger;
import patterns.behavioural.observer.publishers.Publisher;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class HumanPlayer implements Player, Subscriber {

    final EnvironmentChanger environmentChanger;
    Integer damage = 9;
    Integer defense = 9;

    public HumanPlayer(EnvironmentChanger environmentChanger) {
        this.environmentChanger = environmentChanger;
        this.environmentChanger.attach(this);
    }

    @Override
    public void attack() {
        System.out.println("Human: attacking...");
    }

    @Override
    public void defend() {
        System.out.println("Human: defending...");
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
                updateStats(9, 9);
                break;
            case SUNNY_DAY:
                updateStats(12, 12);
                break;
            case FULL_MOON:
                updateStats(6, 6);
                break;
            case THUNDERSTORM:
                updateStats(8, 8);
                break;
        }
    }

    private void updateStats(Integer damage, Integer defense) {
        this.damage = damage;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return String.format("Human(damage: %d, defense %d)", damage, defense);
    }

}

package patterns.behavioural.observer.subscribers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.observer.publishers.EnvironmentChanger;
import patterns.behavioural.observer.publishers.Publisher;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class WerewolfPlayer implements Player, Subscriber {

    final EnvironmentChanger environmentChanger;
    Integer damage = 10;
    Integer defense = 10;

    public WerewolfPlayer(EnvironmentChanger environmentChanger) {
        this.environmentChanger = environmentChanger;
        this.environmentChanger.attach(this);
    }

    @Override
    public void attack() {
        System.out.println("Werewolf: attacking...");
    }

    @Override
    public void defend() {
        System.out.println("Werewolf: defending...");
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
                updateStats(10, 10);
                break;
            case SUNNY_DAY:
                updateStats(7, 7);
                break;
            case FULL_MOON:
                updateStats(13, 13);
                break;
            case THUNDERSTORM:
                updateStats(11, 11);
                break;
        }
    }

    private void updateStats(Integer damage, Integer defense) {
        this.damage = damage;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return String.format("Werewolf(damage: %d, defense %d)", damage, defense);
    }
}

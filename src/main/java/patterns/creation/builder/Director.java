package patterns.creation.builder;

public class Director {

    public Unit makeTank(Builder builder) {
        return builder.reset()
            .attack(5)
            .agility(5)
            .defense(20)
            .useShield(true)
            .build();
    }

    public Unit makeWarrior(Builder builder) {
        return builder.reset()
            .attack(10)
            .agility(10)
            .defense(10)
            .useShield(true)
            .build();
    }

    public Unit makeWizard(Builder builder) {
        return builder.reset()
            .attack(15)
            .agility(10)
            .defense(0)
            .energy(50)
            .build();
    }

    public Unit makeArcher(Builder builder) {
        return builder.reset()
            .attack(10)
            .agility(15)
            .defense(5)
            .build();
    }
}

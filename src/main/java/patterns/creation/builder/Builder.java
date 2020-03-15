package patterns.creation.builder;

public interface Builder {
    Builder reset();
    Builder attack(int attack);
    Builder defense(int defense);
    Builder agility(int agility);
    Builder energy(int energy);
    Builder useShield(boolean useShield);
    Unit build();
}

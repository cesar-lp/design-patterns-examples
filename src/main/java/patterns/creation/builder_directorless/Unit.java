package patterns.creation.builder_directorless;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Unit {
    int attack;
    int defense;
    int agility;
    int energy;
    boolean useShield;

    private Unit(Builder builder) {
        attack = builder.attack;
        defense = builder.defense;
        agility = builder.agility;
        energy = builder.energy;
        useShield = builder.useShield;
    }

    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Builder {

        final int attack;
        final int defense;
        final int agility;
        int energy = 0;
        boolean useShield = false;

        public Builder(int attack, int defense, int agility) {
            this.attack = attack;
            this.defense = defense;
            this.agility = agility;
        }

        public Builder energy(int val) {
            energy = val;
            return this;
        }

        public Builder useShield(boolean val) {
            useShield = val;
            return this;
        }

        public Unit build() {
            return new Unit(this);
        }
    }
}

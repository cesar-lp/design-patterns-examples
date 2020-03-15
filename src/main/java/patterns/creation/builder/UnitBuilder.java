package patterns.creation.builder;

public class UnitBuilder implements Builder {

    private Unit unit;

    @Override
    public Builder reset() {
        unit = new Unit();
        return this;
    }

    @Override
    public Builder attack(int attack) {
        unit.setAttack(attack);
        return this;
    }

    @Override
    public Builder defense(int defense) {
        unit.setDefense(defense);
        return this;
    }

    @Override
    public Builder agility(int agility) {
        unit.setAgility(agility);
        return this;
    }

    @Override
    public Builder energy(int energy) {
        unit.setEnergy(energy);
        return this;
    }

    @Override
    public Builder useShield(boolean useShield) {
        unit.setUseShield(useShield);
        return this;
    }

    @Override
    public Unit build() {
        return unit;
    }
}


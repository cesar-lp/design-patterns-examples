package patterns.structural.decorator;

public enum EnemyAttribute {

    NORMAL("Normal"),
    FIRE("Fire"),
    LIGHTING("Lighting"),
    DARK_ENERGY("Dark Energy");

    private final String name;

    EnemyAttribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

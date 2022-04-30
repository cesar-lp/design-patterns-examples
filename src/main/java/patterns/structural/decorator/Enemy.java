package patterns.structural.decorator;

public interface Enemy {

    void updateAttribute(EnemyAttribute attribute, int value);

    Integer getDamage();

    void attack();

    void displayAttributes();

}

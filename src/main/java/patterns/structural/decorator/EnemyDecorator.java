package patterns.structural.decorator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class EnemyDecorator implements Enemy {

    final Enemy enemy;

    public EnemyDecorator(Enemy enemy, EnemyAttribute attribute, Integer attributeValue) {
        this.enemy = enemy;
        this.enemy.updateAttribute(attribute, attributeValue);
    }

    @Override
    public void updateAttribute(EnemyAttribute attribute, int value) {
        enemy.updateAttribute(attribute, value);
    }

    @Override
    public void attack() {
        enemy.attack();
    }

    @Override
    public Integer getDamage() {
        return enemy.getDamage();
    }

    @Override
    public void displayAttributes() {
        enemy.displayAttributes();
    }
}

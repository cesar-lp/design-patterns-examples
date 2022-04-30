package patterns.structural.decorator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class BasicEnemy implements Enemy {

    final Map<EnemyAttribute, Integer> attributes = new HashMap<>();

    public BasicEnemy() {
        for (EnemyAttribute attribute : EnemyAttribute.values()) {
            attributes.put(attribute, 0);
        }

        attributes.put(EnemyAttribute.NORMAL, getDamage());
    }

    @Override
    public void updateAttribute(EnemyAttribute attribute, int value) {
        attributes.put(attribute, value);
    }

    @Override
    public Integer getDamage() {
        return 10;
    }

    @Override
    public void attack() {
        System.out.printf("Attacking - Total damage: %d\n", getDamage());
    }

    @Override
    public void displayAttributes() {
        attributes.forEach((key, value) -> {
            System.out.printf("%s: %d\n", key, value);
        });
    }
}

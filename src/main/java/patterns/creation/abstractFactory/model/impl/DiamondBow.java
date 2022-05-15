package patterns.creation.abstractFactory.model.impl;

import patterns.creation.abstractFactory.model.Bow;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DiamondBow implements Bow {

    int damage = 29;
    int attackSpeed = 49;

    @Override
    public void attack() {
        System.out.println("DiamondBow: Attacking with damage: " + damage + " and attack speed: " + attackSpeed);
    }
}

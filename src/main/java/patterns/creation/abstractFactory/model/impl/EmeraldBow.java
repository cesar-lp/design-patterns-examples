package patterns.creation.abstractFactory.model.impl;

import patterns.creation.abstractFactory.model.Bow;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmeraldBow implements Bow {

    int damage = 20;
    int attackSpeed = 40;

    @Override
    public void attack() {
        System.out.println("EmeraldBow: Attacking with damage: " + damage + " and attack speed: " + attackSpeed);
    }
}

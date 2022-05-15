package patterns.creation.abstractFactory.model.impl;

import patterns.creation.abstractFactory.model.Sword;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DiamondSword implements Sword {

    int damage = 60;
    int attackSpeed = 30;

    @Override
    public void attack() {
        System.out.println("DiamondSword: Attacking with damage: " + damage + " and attack speed: " + attackSpeed);
    }
}

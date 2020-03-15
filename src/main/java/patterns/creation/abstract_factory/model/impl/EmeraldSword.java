package patterns.creation.abstract_factory.model.impl;

import patterns.creation.abstract_factory.model.Sword;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmeraldSword implements Sword {

    int damage = 50;
    int attackSpeed = 25;


    @Override
    public void attack() {
        System.out.println("EmeraldSword: Attacking with damage: " + damage + " and attack speed: " + attackSpeed);
    }
}

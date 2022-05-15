package patterns.creation.abstractFactory.factory;

import patterns.creation.abstractFactory.model.Weapon;
import patterns.creation.abstractFactory.model.WeaponType;

public class FactoryProvider {

    public static AbstractWeaponFactory<? extends Weapon> getFactory(WeaponType weaponType) {
        switch (weaponType) {
            case BOW:
                return new BowFactory();
            case SWORD:
                return new SwordFactory();
            default:
                throw new IllegalArgumentException("Invalid weapon type: " + weaponType);
        }
    }
}

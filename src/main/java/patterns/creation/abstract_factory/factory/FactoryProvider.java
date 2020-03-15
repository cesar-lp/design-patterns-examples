package patterns.creation.abstract_factory.factory;

import patterns.creation.abstract_factory.model.WeaponType;

public class FactoryProvider {

    public static AbstractWeaponFactory getFactory(WeaponType weaponType) {
        switch (weaponType) {
            case BOW:
                return new BowFactory();
            case SWORD:
                return new SwordFactory();
            default:
                return null;
        }
    }
}

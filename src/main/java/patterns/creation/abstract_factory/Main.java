package patterns.creation.abstract_factory;

import patterns.creation.abstract_factory.factory.AbstractWeaponFactory;
import patterns.creation.abstract_factory.factory.FactoryProvider;
import patterns.creation.abstract_factory.model.SwordType;
import patterns.creation.abstract_factory.model.Weapon;

import static patterns.creation.abstract_factory.model.WeaponType.SWORD;

public class Main {

    public static void main(String[] args) {
        AbstractWeaponFactory<Weapon> weaponFactory = FactoryProvider.getFactory(SWORD);
        Weapon weapon = weaponFactory.create(SwordType.DIAMOND.name());
        weapon.attack();
    }
}

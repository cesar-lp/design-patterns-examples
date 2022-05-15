package patterns.creation.abstractFactory;

import patterns.creation.abstractFactory.factory.FactoryProvider;
import patterns.creation.abstractFactory.model.Weapon;
import patterns.creation.abstractFactory.model.WeaponMaterial;
import patterns.creation.abstractFactory.model.WeaponType;

import java.util.Arrays;

import static patterns.creation.abstractFactory.model.WeaponType.*;
import static patterns.creation.abstractFactory.model.WeaponMaterial.*;

public class Main {

    public static void main(String[] args) {
        var weaponTypes = Arrays.asList(SWORD, BOW);
        var weaponMaterials = Arrays.asList(EMERALD, DIAMOND);

        weaponTypes.forEach(type -> {
            weaponMaterials.forEach(material -> {
                getWeapon(type, material).attack();
            });
        });
    }

    private static Weapon getWeapon(WeaponType weaponType, WeaponMaterial material) {
        var weaponFactory = FactoryProvider.getFactory(weaponType);
        return weaponFactory.create(material);
    }
}

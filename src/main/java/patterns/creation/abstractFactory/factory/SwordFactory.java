package patterns.creation.abstractFactory.factory;

import patterns.creation.abstractFactory.model.Sword;
import patterns.creation.abstractFactory.model.WeaponMaterial;
import patterns.creation.abstractFactory.model.impl.DiamondSword;
import patterns.creation.abstractFactory.model.impl.EmeraldSword;

public class SwordFactory implements AbstractWeaponFactory<Sword> {

    @Override
    public Sword create(WeaponMaterial material) {
        switch (material) {
            case DIAMOND:
                return new DiamondSword();
            case EMERALD:
                return new EmeraldSword();
            default:
                throw new IllegalArgumentException("Invalid sword type: " + material);
        }
    }
}

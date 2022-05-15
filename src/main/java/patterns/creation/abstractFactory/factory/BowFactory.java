package patterns.creation.abstractFactory.factory;

import patterns.creation.abstractFactory.model.Bow;
import patterns.creation.abstractFactory.model.WeaponMaterial;
import patterns.creation.abstractFactory.model.impl.DiamondBow;
import patterns.creation.abstractFactory.model.impl.EmeraldBow;

public class BowFactory implements AbstractWeaponFactory<Bow> {

    @Override
    public Bow create(WeaponMaterial bowType) {
        switch (bowType) {
            case DIAMOND:
                return new DiamondBow();
            case EMERALD:
                return new EmeraldBow();
            default:
                throw new IllegalArgumentException("Invalid bow type: " + bowType);
        }
    }
}

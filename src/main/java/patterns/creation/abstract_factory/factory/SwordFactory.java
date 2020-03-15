package patterns.creation.abstract_factory.factory;

import patterns.creation.abstract_factory.model.Sword;
import patterns.creation.abstract_factory.model.SwordType;
import patterns.creation.abstract_factory.model.impl.DiamondSword;
import patterns.creation.abstract_factory.model.impl.EmeraldSword;

public class SwordFactory implements AbstractWeaponFactory<Sword> {

    @Override
    public Sword create(String swordType) {
        SwordType st = SwordType.valueOf(swordType.toUpperCase());

        switch (st) {
            case DIAMOND:
                return new DiamondSword();
            case EMERALD:
                return new EmeraldSword();
            default:
                throw new IllegalArgumentException("Invalid sword type: " + swordType);
        }
    }
}

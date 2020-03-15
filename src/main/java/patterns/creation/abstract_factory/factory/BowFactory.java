package patterns.creation.abstract_factory.factory;

import patterns.creation.abstract_factory.model.Bow;
import patterns.creation.abstract_factory.model.BowType;
import patterns.creation.abstract_factory.model.impl.DiamondBow;
import patterns.creation.abstract_factory.model.impl.EmeraldBow;

public class BowFactory implements AbstractWeaponFactory<Bow> {

    @Override
    public Bow create(String bowType) {
        BowType bt = BowType.valueOf(bowType.toUpperCase());

        switch (bt) {
            case DIAMOND:
                return new DiamondBow();
            case EMERALD:
                return new EmeraldBow();
            default:
                throw new IllegalArgumentException("Invalid bow type: " + bowType);
        }
    }
}

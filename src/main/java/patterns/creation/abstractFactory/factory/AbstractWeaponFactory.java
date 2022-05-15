package patterns.creation.abstractFactory.factory;

import patterns.creation.abstractFactory.model.WeaponMaterial;

public interface AbstractWeaponFactory<T> {
    T create(WeaponMaterial materialType);
}

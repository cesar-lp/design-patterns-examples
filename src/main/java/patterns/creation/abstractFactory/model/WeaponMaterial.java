package patterns.creation.abstractFactory.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum WeaponMaterial {

    EMERALD("emerald"), DIAMOND("diamond");

    String type;
}

package patterns.creation.abstract_factory.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum WeaponType {

    SWORD("sword"), BOW("bow"), STAFF("staff");

    String type;
}

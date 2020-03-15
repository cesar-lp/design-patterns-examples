package patterns.creation.abstract_factory.factory;

public interface AbstractWeaponFactory<T> {
    T create(String type);
}

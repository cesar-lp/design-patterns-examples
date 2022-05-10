package patterns.behavioural.iterator;

public interface Iterator<T> {

    void first();

    void next();

    boolean hasNext();

    T currentItem();
}

package patterns.behavioural.iterator.iterator;

public interface Iterator<T> {

    void first();

    void next();

    boolean hasNext();

    T currentItem();
}

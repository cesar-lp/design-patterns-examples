package patterns.behavioural.iterator;

public interface IterableCollection<T> {

    Iterator<T> createSequentialIterator();

    Iterator<T> createReverseIterator();

    T get(Integer index);

    Integer size();

}

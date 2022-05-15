package patterns.behavioural.iterator.collection;

import patterns.behavioural.iterator.iterator.Iterator;

public interface IterableCollection<T> {

    Iterator<T> createSequentialIterator();

    Iterator<T> createReverseIterator();

    T get(Integer index);

    Integer size();

}

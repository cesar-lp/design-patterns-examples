package patterns.behavioural.iterator.collection;

import patterns.behavioural.iterator.iterator.Iterator;
import patterns.behavioural.iterator.iterator.ReverseListIterator;
import patterns.behavioural.iterator.iterator.SequentialListIterator;

import java.util.List;

public class ListCollection<T> implements IterableCollection<T> {

    final List<T> list;

    public ListCollection(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> createSequentialIterator() {
        return new SequentialListIterator<>(this);
    }

    @Override
    public Iterator<T> createReverseIterator() {
        return new ReverseListIterator<>(this);
    }

    @Override
    public T get(Integer index) {
        return list.get(index);
    }

    @Override
    public Integer size() {
        return list.size();
    }

}

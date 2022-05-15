package patterns.behavioural.iterator.iterator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.iterator.collection.IterableCollection;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class SequentialListIterator<T> implements Iterator<T> {

    Integer current;
    final IterableCollection<T> collection;

    public SequentialListIterator(IterableCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        if (current + 1 > collection.size()) {
            throw new IndexOutOfBoundsException();
        }

        current++;
    }

    @Override
    public boolean hasNext() {
        return current < collection.size();
    }

    @Override
    public T currentItem() {
        return collection.get(current);
    }

}

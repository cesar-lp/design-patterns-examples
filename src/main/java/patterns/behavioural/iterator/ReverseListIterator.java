package patterns.behavioural.iterator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReverseListIterator<T> implements Iterator<T> {

    Integer current;
    final IterableCollection<T> collection;

    public ReverseListIterator(IterableCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void first() {
        current = collection.size() - 1;
    }

    @Override
    public void next() {
        if (current < 0) {
            throw new IndexOutOfBoundsException();
        }

        current--;
    }

    @Override
    public boolean hasNext() {
        return current >= 0;
    }

    @Override
    public T currentItem() {
        return collection.get(current);
    }
}
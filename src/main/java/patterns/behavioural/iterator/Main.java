package patterns.behavioural.iterator;

import patterns.behavioural.iterator.collection.ListCollection;
import patterns.behavioural.iterator.iterator.Iterator;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        var list = IntStream.rangeClosed(0, 10).boxed().collect(toList());
        var collection = new ListCollection<>(list);

        printElements(collection.createSequentialIterator());
        System.out.println();
        printElements(collection.createReverseIterator());
    }

    private static void printElements(Iterator<Integer> iterator) {
        for (iterator.first(); iterator.hasNext(); iterator.next()) {
            System.out.printf("%d ", iterator.currentItem());
        }
    }
}

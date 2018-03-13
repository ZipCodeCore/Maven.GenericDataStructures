package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        E first = a.get(0);
        E second = a.get(a.size() - 1);

        return new Pair<>(first, second);
    }

    public <E extends Comparable<E>> E max(ArrayList<E> a) {
        return Collections.max(a);
    }

    public <E extends Comparable<E>> E min(ArrayList<E> a) {
        return Collections.min(a);
    }

    public <E extends Comparable<E>> Pair<E> minmax(ArrayList<E> a) {
        return new Pair<>(min(a), max(a));
    }
}

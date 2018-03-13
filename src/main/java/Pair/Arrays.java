package Pair;

import java.util.ArrayList;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <E> Pair<E> firstLast(ArrayList<E> a) {
        E first = a.get(0);
        E second = a.get(a.size() - 1);

        return new Pair<>(first, second);
    }

    public <E> E max(ArrayList<E> a) {
        return null;
    }

    public <E> E min(ArrayList<E> a) {
        return null;
    }

    public <E> Pair<E> minmax(ArrayList<E> a) {
        return null;
    }
}

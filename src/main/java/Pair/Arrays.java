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
        E last = a.get(a.size() - 1);
        Pair<E> firstLast = new Pair<>(first, last);
        return firstLast;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> a) {
        E minimumValue = Collections.min(a);
        return minimumValue;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> a) {
        E maximumValue = Collections.max(a);
        return maximumValue;
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> a) {
        E maximumValue = Collections.max(a);
        E minimumValue = Collections.min(a);
        Pair<E> minMax = new Pair<>(maximumValue, minimumValue);
        return minMax;
    }

}

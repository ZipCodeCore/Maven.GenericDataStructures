package Pair;

import java.lang.reflect.Array;
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
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> arrayList) {
        Pair <E> firstLast = new Pair<>(arrayList.get(0), arrayList.get(arrayList.size()-1));
        return firstLast;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> arrayList) {
        E minValue = Collections.min(arrayList);
        return minValue;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> arrayList) {
        E maxValue = Collections.max(arrayList);
        return maxValue;
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> arrayList) {
        Pair<E> minAndMax = new Pair<> (Arrays.min(arrayList), Arrays.min(arrayList));
        return minAndMax;
    }
}

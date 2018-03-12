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

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        Pair<E> pairToReturn = new Pair<E>(a.get(0), a.get(a.size() - 1));
        return pairToReturn;
    }

    public static <E extends Comparable> E min(ArrayList<E> arrayList) {
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public static <E extends Comparable> E max(ArrayList<E> arrayList) {
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size() - 1);
    }

    public static <E extends Comparable> Pair<E> minMax(ArrayList<E> arrayList) {
        E minimum = min(arrayList);
        E maximum = max(arrayList);
        return new Pair<E>(minimum, maximum);
    }
}

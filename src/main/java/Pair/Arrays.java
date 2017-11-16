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
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a){
        Pair<E> pair = new Pair<E>(a.get(0), a.get(a.size() - 1));
        return pair;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> arrayList){
        E element = Collections.min(arrayList);
        return element;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> arrayList){
        E element = Collections.max(arrayList);
        return element;
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> arrayList){
        Pair<E> elements = new Pair<E>(Arrays.min(arrayList), Arrays.max(arrayList));
        return elements;
    }

}

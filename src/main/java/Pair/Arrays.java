package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {

    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        Pair<E> couple = new Pair<E>(a.get(0), a.get(a.size()-1));
        return couple;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        Collections.sort(list);
        return list.get(0);
    }
     public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        Collections.sort(list);
        return list.get(list.size()-1);
     }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> list) {
        Pair<E> couple = new Pair( min(list),  max(list));
        return couple;
    }
}
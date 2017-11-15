package Pair;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static  <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> arr) {
        return new Pair<E>(arr.get(0),arr.get(arr.size()-1));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> arr){
        sort(arr);
        return arr.get(0);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> arr){
        sort(arr);
        return arr.get(arr.size()-1);
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> arr){
        sort(arr);
        return firstLast(arr);
//        return new Pair<E>(min(arr),max(arr));
    }
}

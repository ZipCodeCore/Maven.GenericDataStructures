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
public class Arrays{
    public static <E extends Comparable> Pair firstLast(ArrayList<E> input)  {
        E first = input.get(0);
        E last = input.get(input.size() - 1);
        return new Pair(first, last);
    }

    public static <E extends Comparable> Comparable min(ArrayList<E> input) {
        Comparable min = Collections.min(input);
        return min;
    }

    public static <E extends Comparable> Comparable max(ArrayList<E> input) {
        Comparable max = Collections.max(input);
        return max;
    }

    public static <E extends Comparable> Pair minMax(ArrayList<E> input) {
        Pair minMax = new Pair(min(input),  max(input));
        return minMax;

    }
}

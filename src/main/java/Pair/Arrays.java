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
    public static <E extends Comparable> Pair firstLast(ArrayList<E> input) {
        E first = input.get(0);
        E last = input.get(input.size()-1);
        return new Pair(first, last);
    }

    public static <E extends Comparable> E min(ArrayList<E> input){
        E minimum = input.get(0);
        for (E jawn:input){
            if (jawn.compareTo(minimum) < 0) minimum = jawn;
        }
        return minimum;
    }

    public static <E extends Comparable> E max(ArrayList<E> input){
        E maximum = input.get(0);
        for (E jawn:input){
            if (jawn.compareTo(maximum) > 0) maximum = jawn;
        }
        return maximum;
    }

    public static <E extends Comparable> Pair<E> minMax(ArrayList<E> input){
        return new Pair<E>(Arrays.min(input), Arrays.max(input));
    }
}

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
public class Arrays<E extends Comparable> {

    public Arrays() {

    }

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {

        return new Pair<> (a.get(0), a.get(a.size()-1));

    }


    public static <E extends Comparable> E min(ArrayList<E> al) {
        E min = al.get(0);
        for (int i = 0; i < al.size(); i++)
            if (al.get(i).compareTo(min) < 0) {
                min = al.get(i);
            } return min;


    }

    public static <E extends Comparable> E max(ArrayList<E> al) {

        E max = al.get(0);
        for (int i = 0; i < al.size(); i++)
            if (al.get(i).compareTo(max) > 0) {
                max = al.get(i);
            } return max;

    }

    public static <E extends Comparable> Pair<E> minMax(ArrayList<E> al) {
        return new Pair<E> (max(al), min(al));
    }
}

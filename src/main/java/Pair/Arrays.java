package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
   // public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {

        public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a){

        Pair<E> pair = new Pair<E>(a.get(0), a.get(a.size() - 1));
        return pair;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> al) {
        //al.sort(Comparator.naturalOrder());
        Collections.sort(al);
        return al.get(0);

    }

    public static <E extends Comparable> E max(ArrayList<E> al) {
        //  al.sort(Comparator.naturalOrder());
       Collections.sort(al);
       return al.get(al.size() -1);

    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> al) {
      // Collections.sort(al);

       // al.sort(Comparator.naturalOrder());


        Pair<E> pair = new Pair<E>(min(al), max(al));
        return pair;
    }
}
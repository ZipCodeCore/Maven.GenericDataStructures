package Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        Pair<E> firstLast = new Pair<>(a.get(0), a.get(a.size() - 1));
        return firstLast;

    }

        public static  <E extends Comparable> E min(ArrayList<E> list) {
            Collections.sort(list);
            E firstElement =  list.get(0);
            return firstElement;
        }

        public static  <E extends Comparable> E max(ArrayList<E> list){
            Collections.sort(list);
            E lastElement = list.get(list.size() - 1);
            return lastElement;
        }

        public static  <E extends Comparable> Pair<E> minMax(ArrayList<E> list){
            Collections.sort(list);
            Pair<E> firstLast = firstLast(list);
            return firstLast;
        }


}


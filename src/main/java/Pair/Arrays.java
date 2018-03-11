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

public class Arrays<E> {

    public static <E extends Comparable<? super E>> Pair<E> firstLast(ArrayList<E> a){
        return new Pair<E>(a.get(0), a.get(a.size()-1));
    }

    public static <E extends Comparable<? super E>> E min(ArrayList<E> a) {
        E min = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (min.compareTo(a.get(i)) > 0) min = a.get(i);
        }
        return min;
    }

    public static <E extends Comparable<? super E>> E max(ArrayList<E> a) {
        E max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (max.compareTo(a.get(i)) < 0) max = a.get(i);
        }
        return max;
    }

    public static <E extends Comparable<? super E>> Pair<E> minMax(ArrayList<E> a) {
        E min = a.get(0);
        E max = a.get(0);
        for(int i = 0; i<a.size(); i++){
            if(min.compareTo(a.get(i))>0) min = a.get(i);
            if(max.compareTo(a.get(i))<0) max = a.get(i);
        }
        return new Pair<>(min,max);
    }


}

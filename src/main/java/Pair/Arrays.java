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
public class Arrays<E extends  Comparable<E>> {
    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> al) {
       return  new Pair<E>(al.get(0), al.get(al.size()-1));
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> al){
        E min = al.get(0);
        for (int i=1; i <= al.size()-1;i++ ){
            if ( al.get(i).compareTo(min) < 0){
                min = al.get(i);
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> al){
        E max = al.get(0);
        for (int i=1; i <= al.size()-1;i++ ){
            if ( al.get(i).compareTo(max) > 0){
                max = al.get(i);
            }
        }
        return max;
    }

    public static <E extends  Comparable<E>> Pair<E> minMax(ArrayList<E> al){
        return new Pair<E>(min(al),max(al));
    }
}

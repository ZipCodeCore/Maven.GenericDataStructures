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

    E minValue;
    E maxValue;
    E first;
    E last;

    @SuppressWarnings("unchecked")
    public  <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        E first = a.get(0);
        E last = a.get(a.size() - 1);
        return new Pair(first, last);
    }
    @SuppressWarnings("unchecked")
    public <E extends Comparable> E min(ArrayList<E> a) {
        E minValue = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (minValue.compareTo(a.get(i)) > 0) {
                minValue = a.get(i);
            }
        }
        return minValue;
    }
    @SuppressWarnings("unchecked")
    public <E extends Comparable> E max(ArrayList<E> a) {
        E maxValue = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (maxValue.compareTo(a.get(i)) < 0) {
                maxValue = a.get(i);
            }
        }
        return maxValue;
    }
    @SuppressWarnings("unchecked")
    public <E extends Comparable> Pair<E> minmax(){
        return new Pair(minValue,maxValue);
    }

    public E getFirst(){
        return first;
    }

    public E getLast(){
        return last;
    }



 }

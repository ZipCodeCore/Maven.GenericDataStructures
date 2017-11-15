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
public class Arrays <E extends Comparable> {

    ArrayList<E> list;

    public Arrays(ArrayList<E> list) {
        this.list = list;
    }

    public Pair<E> firstLast(ArrayList<E> a) {
        int listSize = a.size();
        return new Pair(a.get(0), a.get(listSize - 1));
    }

    public E min(ArrayList<E> a) {
        E smallest = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(smallest) < 0) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    public E max() {
        E largest = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(largest) > 0) {
                largest = list.get(i);
            }
        }
        return largest;
    }

    public Pair<E> minMax() {
        E smallest = list.get(0);
        E largest = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(smallest) < 0) {
                smallest = list.get(i);
            }
            if(list.get(i).compareTo(largest) > 0) {
                largest = list.get(i);
            }
        }
        return new Pair<E>(smallest, largest);
    }
}

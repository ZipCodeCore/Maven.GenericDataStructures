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
public class Arrays<E extends Comparable> {
    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> arrayList) {
       E firstItem = arrayList.get(0);
       E lastItem = arrayList.get(arrayList.size()-1);

       Pair<E> answer= new Pair<>(firstItem,lastItem);

       return answer;

    }

    public static <E extends Comparable> E min (ArrayList<E> arrayList) {
        arrayList.sort(Comparator.naturalOrder());
        E minItem = arrayList.get(0);

        return minItem;

    }

    public static <E extends Comparable> E max (ArrayList<E> arrayList) {
        arrayList.sort(Comparator.naturalOrder());
        E maxItem = arrayList.get(arrayList.size()-1);

        return maxItem;


    }

    public static <E extends Comparable> Pair<E> minMax (ArrayList<E> arrayList) {
        arrayList.sort(Comparator.naturalOrder());

        Pair <E> answer = new Pair(arrayList.get(0), arrayList.get(arrayList.size()-1));

        return answer;

    }


}

package io.github.aaronclong.generics.pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair
 * of the first element in the array list and the last element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair
 * containing the largest and smallest items from the array list
 */
public class Arrays {
  public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
    if (a.isEmpty()) {
      return null;
    }
    return new Pair<E>(a.get(0), a.get(a.size() - 1));
  }

  public static <E extends Comparable<? super E>> E max(ArrayList<E> a) {
    return Collections.max(a);
  }

  public static <E extends Comparable<? super E>> E min(ArrayList<E> a) {
    return Collections.min(a);
  }

  public static <E extends Comparable<? super E>> Pair<E> minMax(ArrayList<E> a) {
    E theMax = max(a);
    E theMin = min(a);
    return new Pair<E>(theMin, theMax);
  }
}

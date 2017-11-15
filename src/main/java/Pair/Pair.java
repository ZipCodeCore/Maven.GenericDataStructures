package Pair;

import java.util.Comparator;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {
    E first;
    E second;

    public Pair() {

    }

    public Pair(E first, E second) {
        this.first = first;

        this.second = second;
    }

    public E min() {
        if (this.first.compareTo(this.second) > 1) {
            return second;
        } else
            return first;
    }

    public E max() {
        if (first.compareTo(second) > 1) {
            return first;
        } else
            return second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
}

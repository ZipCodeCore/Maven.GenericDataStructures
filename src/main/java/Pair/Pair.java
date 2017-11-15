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

    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E min() {
        int comparisionValue = first.compareTo(second);
        if (comparisionValue < 0) {
            return first;
        }
        else if (comparisionValue > 0) {
            return second;
        }
            return null;
    }

    public E max() {
        int comparisionValue = first.compareTo(second);
        if (comparisionValue > 0) {
            return first;
        }
        else if (comparisionValue < 0) {
            return second;
        }
        return null;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }


}

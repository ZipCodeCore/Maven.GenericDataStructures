package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable<E>> {

    private E first;
    private E second;
    public static int MIN_VALUE = -1;
    public static final int MAX_VALUE = 1;

    public Pair() { }

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min() {
        if (first.compareTo(second) <= MIN_VALUE) {
            return first;
        }
        else {
            return second;
        }
    }

    public E max() {
        if (first.compareTo(second) >= MAX_VALUE) {
            return first;
        }
        else {
            return second;
        }
    }
}
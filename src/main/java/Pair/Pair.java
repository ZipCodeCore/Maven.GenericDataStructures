package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<T extends Comparable> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T max() {
        if (first.compareTo(second) > 0) {
            return first;

        } else if (first.compareTo(second) < 0) {
            return second;
        } else return null;
    }

    public T min() {
        if (first.compareTo(second) > 0) {
            return first;

        } else if (first.compareTo(second) < 0) {
            return first;
        } else return null;
    }
}

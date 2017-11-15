package Pair;

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

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min() {
        int comparisonValue = first.compareTo(second);
        if (comparisonValue < 0) {
            return first;
        }
        else if (comparisonValue > 0) {
            return second;
        }
        else {
            return null;
        }
    }

    public E max() {
        int comparisonValue = first.compareTo(second);
        if (comparisonValue > 0) {
            return first;
        }
        else if (comparisonValue < 0) {
            return second;
        }
        else {
            return null;
        }
    }

}

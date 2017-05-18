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

    Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    E getFirst() {
        return first;
    }

    E getSecond() {
        return second;
    }

    E min() {
        if(first.compareTo(second) > 0) {
            return second;
        } else {
            return first;
        }
    }

    E max() {
        if(first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

}

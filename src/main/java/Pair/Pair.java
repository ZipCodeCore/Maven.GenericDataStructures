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

    public Pair() {

    }

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

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public <E extends Comparable<E>> E min() {
        if(first == null || second == null) {
            return null;
        }
        else {
            if (first.compareTo(second) <= 0) {
                return (E) first;
            }
            else {
                return (E) second;
            }
        }
    }

    public <E extends Comparable<E>> E max() {
        if(first == null || second == null) {
            return null;
        }
        else {
            if (first.compareTo(second) <= 0) {
                return (E) second;
            }
            else {
                return (E) first;
            }
        }
    }
}

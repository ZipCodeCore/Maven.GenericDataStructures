package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    private E e1;
    private E e2;

    public Pair(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getFirst() {
        return e1;
    }

    public E getSecond() {
        return e2;
    }

    public E min() {
        if (e1.compareTo(e2) < 0) {
            return e1;
        } else {
            return e2;
        }
    }

    public E max() {
        if (e1.compareTo(e2) < 0) {
            return e2;
        } else {
            return e1;
        }
    }

}

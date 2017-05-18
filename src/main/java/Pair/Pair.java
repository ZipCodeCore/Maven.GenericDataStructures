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

    private E element1;
    private E element2;

    public Pair(E element1, E element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public E getFirst() {return element1;}
    public E getSecond() {return element2;}

    public E min() {
        int compare = element1.compareTo(element2);
        if (compare == -1) {return element1;}
        else {return element2;}
    }

    public E max() {
        int compare = element1.compareTo(element2);
        if (compare == 1) {return element1;}
        else {return element2;}
    }

}
package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E> {
    private E type1;
    private E type2;

    Pair(E theType1, E theType2) {
        this.type1 = theType1;
        this.type2 = theType2;
    }

    public E getFirst() {
        return this.type1;
    }


    public E getSecond() {
        return this.type2;
    }

    public <E extends Comparable<E>> E min() {
        E type1 = (E) this.getFirst();
        E type2 = (E) this.getSecond();

        E min = type1;

        if (type2 != null && min == null || type2.compareTo(min) < 0) {
            min = type2;
        }

        return min;

    }

    public <E extends Comparable<E>> E max() {
        E type1 = (E) this.getFirst();
        E type2 = (E) this.getSecond();
        E max = type1;

        if (type2 != null && max == null || type2.compareTo(max) > 0) {
            max = type2;
        }

        return max;

    }
}

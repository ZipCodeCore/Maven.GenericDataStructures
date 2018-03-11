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
public class Pair<T> {
    private T type1;
    private T type2;

    Pair(T theType1, T theType2) {
        this.type1 = theType1;
        this.type2 = theType2;
    }

    public T getFirst() {
        return this.type1;
    }

    public T getSecond() {
        return this.type2;
    }

    public <T extends Comparable<T>> T min() {
        T type1 = (T) this.getFirst();
        T type2 = (T) this.getSecond();

        T min = type1;

        if (type2 != null && min == null || type2.compareTo(min) < 0) {
            min = type2;
        }

        return min;


    }

    public <T extends Comparable<T>> T max() {
        T type1 = (T) this.getFirst();
        T type2 = (T) this.getSecond();
        T max = type1;

        if (type2 != null && max == null || type2.compareTo(max) > 0) {
            max = type2;
        }

        return max;

    }
}

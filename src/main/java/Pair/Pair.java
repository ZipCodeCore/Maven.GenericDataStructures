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

    E element1;
    E element2;

    public Pair(E element1, E element2){
        this.element1 = element1;
        this.element2 = element2;
    }


    public E getFirst(){
        return this.element1;
    }

    public E getSecond(){
        return this.element2;
    }

    public E min() {

        return element1.compareTo(element2) == -1 ? element1 : element2;
    }

    public E max(){
        return element1.compareTo(element2) == 1 ? element1 : element2;
    }

}

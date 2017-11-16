package Pair;

import java.util.function.Supplier;

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


    public Pair(E a, E b){
        this.first = a;
        this.second = b;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min(){
        int result =getFirst().compareTo(getSecond());
        return result>0? getSecond():getFirst();
    }

    public E max(){
        int result =getFirst().compareTo(getSecond());
        return result>0? getFirst():getSecond();
    }


}

package Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */

public class Pair<E extends Comparable<? super E>> implements Comparable<Pair<E>> {

    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public  E min(){
        if(first.compareTo(second)>0) return second;
        else return first;
    }

    public E max(){
        if(first.compareTo(second)>0) return first;
        else return second;
    }

    @Override
    public int compareTo(Pair<E> o) {
        return 0;
    }


}

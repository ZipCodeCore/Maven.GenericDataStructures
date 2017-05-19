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
    private E min;
    private E max;
    private E first;
    private E second;

    public Pair(){}

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }
    public E getFirst(){return first;}
    public E getSecond(){return second;}

    public E min(){
        if(first.compareTo(second) > 0) {
            return min = second;
        } else {
            min = first;
        }
        return min;
    }

    public E max(){
        if (first.compareTo(second) < 0){
            return max = second;
        } else {
           return max = first;
        }
    }

}

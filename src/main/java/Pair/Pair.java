package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E> {

    private E first;
    private E second;


    Pair(E first, E second) {
        this.first = first;
        this.second = second;

    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public <E extends Comparable> E min() {


        if(((E) first).compareTo(second) > 0){
            return (E) second;
        }else
            return (E) first;
    }

    public <E extends Comparable>  E max() {
        if(((E) first).compareTo(second) > 0){
            return (E) first;
        }else
            return (E) second;
    }


}

package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {
    private E first;
    private E last;

    public Pair(E first, E last){
        this.first = first;
        this.last = last;
    }

    public E min(){
        return (first.compareTo(last) == 1 ? last : first);
    }

    public E max(){
        return (first.compareTo(last) == 1 ? first : last);
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return last;
    }
}

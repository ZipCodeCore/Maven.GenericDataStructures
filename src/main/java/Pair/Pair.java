package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable>{

    private E first;
    private E second;

    public Pair(E e1, E e2){
        first=e1;
        second=e2;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }

    public E min(){
        if (first.compareTo(second)<=0)
        {
            return first;
        }
        return second;
    }

    public E max(){
        if (first.compareTo(second)>=0)
        {
            return first;
        }
        return second;
    }

}

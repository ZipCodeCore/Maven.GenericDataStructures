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
    Pair<E> p;

    public Pair(E first, E second) {

        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    public E min(){
        int result = compareTo(first);
        boolean secondIsGreater = result == -1;
        if(secondIsGreater){
            return second;
        }else return first;
    }

    public E max(){
        int result = compareTo(first);
        boolean secondIsGreater = result == 1;
        if(secondIsGreater){
            return first;
        }else return second;
    }
    public int compareTo(E e){
        return this.first.compareTo(e);
    }
}

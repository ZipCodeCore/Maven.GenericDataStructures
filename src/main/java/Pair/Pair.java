package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable> {
    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E min(){
        if (this.first.compareTo(this.second) < 0) return this.first;
        return this.second;
    }

    public E max(){
        if (this.first.compareTo(this.second) > 0) return this.first;
        return this.second;
    }
}

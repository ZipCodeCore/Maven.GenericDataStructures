package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable>{

    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst(){
        return this.first;
    }

    public E getSecond(){
        return this.second;
    }

    public E min(){
        if(first.compareTo(second) > 0){
            return this.second;
        }
        return this.first;
    }

    public E max(){
        if(first.compareTo(second) < 0){
            return this.second;
        }
        return this.first;
    }

}

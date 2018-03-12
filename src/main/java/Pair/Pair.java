package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and
 * have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    private E firstValue;
    private E secondValue;

    public Pair(E first, E second){
        this.firstValue = first;
        this.secondValue = second;
    }

    public E getFirst(){
        return this.firstValue;
    }

    public E getSecond(){
        return this.secondValue;
    }
    public E min(){
        if (firstValue.compareTo(secondValue) == 1){
            return secondValue;
        }
        return firstValue;
    }

    public E max(){
        if (firstValue.compareTo(secondValue) == -1){
            return secondValue;
        }
        return firstValue;
    }


}

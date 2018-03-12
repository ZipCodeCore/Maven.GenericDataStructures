package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable<E>>  {
    //without extending you cannot compare generic types
    //by extending comparing individual values of generic types is now viable
    private E firstValue;
    private E secondValue;

    Pair(E first, E second){
        this.firstValue = first;
        this.secondValue = second;
    }

    private int compareTo(E otherValue) {
        return firstValue.compareTo(otherValue);
    }

    public E getFirst(){
        return firstValue;
    }

    public E getSecond(){
        return secondValue;
    }

    public E min(){
        int compareResult = compareTo(firstValue);
        boolean secondValueIsGreater = compareResult == -1;

        if (secondValueIsGreater) {
            return secondValue;
        } else {
            return firstValue;
        }
    }

    public E max(){
        int compareResult = compareTo(secondValue);
        boolean firstValIsGreater = compareResult == 1;

        if (firstValIsGreater) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}
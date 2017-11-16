package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    E First, Second;

    public  Pair(E first, E second) {
        First = first;
        Second = second;
    }

    public E getFirst() {
        return First;
    }

    public E getSecond() {
        return Second;
    }

    public  E min(){
        if(First.compareTo(Second) > 0){
            return Second;
        }
        else {
            return First;
        }

    }

    public E max(){
        if (Second.compareTo(First) < 0){
            return First;
        }
        else{
            return Second;
        }
    }

}



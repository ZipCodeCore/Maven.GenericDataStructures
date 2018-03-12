package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    E firstVal;
    E secondVal;

    public Pair(E firstVal, E secondVal){
        this.firstVal=firstVal;
        this.secondVal=secondVal;
    }

    public E getFirst(){
        return firstVal;
    }

    public E getSecond(){
        return secondVal;
    }

    public E min(){

        E smallerOfTwo;
        smallerOfTwo= firstVal.compareTo(secondVal) == 1 ? secondVal:firstVal;

        return smallerOfTwo;
    }

    public E max(){

        E largerOfTwo;
        largerOfTwo= firstVal.compareTo(secondVal) == 1 ? firstVal:secondVal;

        return largerOfTwo;

    }

}

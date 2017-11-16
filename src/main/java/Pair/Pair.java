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


    public E min(){

        int comparison = first.compareTo(second);
        if(comparison < 0){
            return first;
        } else if (comparison == 0) {
            return null;
        }
        return second;
    }

    public E max (){

        int comparison = second.compareTo(first);
        if(comparison == 1){
            return second;
        } else if (comparison == 0) {
            return null;
        }
        return first;


    }

    public E getFirst() {

        return first;
    }

    public E getSecond(){

        return second;
    }

}

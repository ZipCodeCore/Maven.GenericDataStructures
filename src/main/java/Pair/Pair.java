package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable<E>> {
    private  E val1;
    private  E val2;
    public Pair(E val1,E val2){
        this.val1 = val1;
        this.val2 = val2;
    }
    public E getFirst(){
        return val1;
    }
    public E getSecond(){
        return val2;
    }
    public E min(){
        if(val1.compareTo(val2)<0){
            return val1;
        }
        return val2;
    }
    public E max(){
        if(val1.compareTo(val2)<0){
            return val2;
        }
        return val1;
    }
}

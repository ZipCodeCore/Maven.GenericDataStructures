package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable>
{
    E first;
    E second;

    public Pair(E first, E second)
    {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond(){
        return second;
    }

    public E min()
    {
        //if first is less then second it returns a negative
        if(first.compareTo(second) < 0)
        {
            return first;
        }
        return second;
    }

    public E max()
    {
        if(first.compareTo(second) > 0)
        {
            return first;
        }

        return second;
    }



}

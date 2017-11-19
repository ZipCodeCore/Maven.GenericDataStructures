package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays extends Pair {

    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        E first = a.get(0);
        E second = a.get(a.size()-1);
        return new Pair(first, second); //how can i fix this?
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> a) {
        E min = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if(min.compareTo(a.get(i)) >= MAX_VALUE) {
                min = a.get(i);
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> a) {
        E max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if(max.compareTo(a.get(i)) <= MIN_VALUE) {
                max = a.get(i);
            }
        }
        return max;
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> a) {
        E minValueInArray = min(a);
        E maxValueInArray = max(a);
        return new Pair(minValueInArray, maxValueInArray);  //how can i fix this?
    }


}

//line 15: could not extend it from Pair<E> cause then error with test; had to extend from
//type parameter. What is the difference?

//if i don't have this, <E extends Comparable<E>>, none of my method seem to not want to work.
//do I need to have this, or needed b/c of how I designed code? 

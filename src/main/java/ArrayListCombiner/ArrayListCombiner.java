package ArrayListCombiner;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner<E> {
    private ArrayList<E> myArrayList;

    public ArrayListCombiner(){

    }

    public static ArrayList<E> extendCombiner(ArrayList<E> first, ArrayList<? extends E>second){
        Collections.copy(first, second);
        return first;
    }

    public static ArrayList<? super E> superCombiner(ArrayList<E>first,ArrayList<? super E>second){
        Collections.copy(second,first);
        return second;
    }
}

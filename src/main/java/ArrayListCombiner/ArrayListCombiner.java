package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {

    //in test, because arr2 is a childclass of arr1, so  ?extendsE make it so called "inherit" from arr1, so the value can be combined
    public static <E> void extendCombiner(ArrayList<E> arr1, ArrayList<? extends E> arr2){

        arr1.addAll(arr2);
    }

    // ?superE make arr1 the super class of arr2
    public static <E> void superCombiner(ArrayList<? super E> arr1, ArrayList<E> arr2){

        arr1.addAll(arr2);
    }
}

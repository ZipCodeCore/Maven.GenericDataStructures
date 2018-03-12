package ArrayListCombiner;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {

    public static <E> void extendCombiner(ArrayList<E> first, ArrayList<? extends E> second){
        first.addAll(second);
    }

    public static <E> void superCombiner(ArrayList<? super E> first, ArrayList<E> second){
        first.addAll(second);
    }
}


//to describe static in my head....
//you don't need the juice to have the sauce
//so for example, a class is the sauce...makes a meal what it is
//an object is the juice, great flavor but not what you want with everymeal
//if you check out the test, and you notice its not instantiated you don't need the juice
//because the test already has the sauce

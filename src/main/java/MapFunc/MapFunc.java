package MapFunc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc<T, R> {



    public static <T, R> ArrayList map(ArrayList<T> arrayList, Function<T,R> function) {
        ArrayList<R> returnArrayList = new ArrayList<R>();
        for (int i = 0; i <arrayList.size() ; i++) {
            returnArrayList.add((R)function.apply(arrayList.get(i)));
        }
        return returnArrayList;
    }
}

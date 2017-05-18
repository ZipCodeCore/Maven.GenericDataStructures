package MapFunc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R> ArrayList<R> map(ArrayList<T> list, Function<T,R> function) {
        ArrayList<R> retList = new ArrayList<>();
        for(T t : list) {
            retList.add(function.apply(t));
        }
        return retList;
    }

}

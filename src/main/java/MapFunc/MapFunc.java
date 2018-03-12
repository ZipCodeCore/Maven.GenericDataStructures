package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R, E extends T> ArrayList<R> map (ArrayList<E> arrList, Function<T,R> function){
        ArrayList<R> arrayList = new ArrayList<>();
        for (E value: arrList){
            R rValue = function.apply(value);
            arrayList.add(rValue);
        }
        return arrayList;
    }
}

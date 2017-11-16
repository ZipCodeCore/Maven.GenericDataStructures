package MapFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {
    public static <T,R> ArrayList<R> map(List<T> arrayList, Function<T,R> obj){
        ArrayList<R> rArrayList = new ArrayList<>();
        for (T type: arrayList) {
           rArrayList.add(obj.apply(type));
        }
    return rArrayList;
    }

}

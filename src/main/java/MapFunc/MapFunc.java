package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc{

    public static <T, R, E extends T> ArrayList<R> map(ArrayList<E> inputList, Function<T, R> function) {
        ArrayList<R> newList = new ArrayList<>();
        for(E value: inputList) {
            R output = function.apply(value);
            newList.add(output);
        }
        return newList;
    }
}

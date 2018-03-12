package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a
 * `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first
 * after the function is applied to them.
 */
public class MapFunc {
// type R bc it could return a different type but could be the same
    public static <T, R> ArrayList map(ArrayList<T> input, Function<T, R> myFunction) {
        //create new arraylist
        ArrayList<R> mappedArrayList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            R element = myFunction.apply(input.get(i));
            mappedArrayList.add(element);
        }
        return mappedArrayList;
    }
}


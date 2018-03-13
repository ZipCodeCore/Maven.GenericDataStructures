package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> a, Function<T, R> f) {

        ArrayList<R> result = new ArrayList<>(a.size());
        a.forEach(
                t -> result.add(f.apply(t))
        );
        return result;
    }
}

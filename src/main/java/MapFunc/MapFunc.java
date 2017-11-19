package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList map(ArrayList<T> arrayList, Function<T, R> function) {
        return arrayList.stream().map(function::apply).collect(Collectors.toCollection(ArrayList::new));
    }
}

//Function<T, R> = type of input, type of the result; represents a function that takes one input and produces a result.



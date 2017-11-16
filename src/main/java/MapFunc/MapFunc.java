package MapFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<T> map(ArrayList<R> list, Function <R, T> func){

        Stream<R> listStream = list.stream();
        Stream<T> streamOfFunc = listStream.map(a -> func.apply(a));
        List<T> fromStreamOfFunc = streamOfFunc.collect(Collectors.toList());
        return (ArrayList<T>) fromStreamOfFunc;
    }
}

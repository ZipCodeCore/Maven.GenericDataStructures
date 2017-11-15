package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R> ArrayList<R> map(ArrayList<T> arrayList, Function<T,R> function) {
        Stream<T> streamOfList = arrayList.stream();
        Stream<R> streamOfMappedFunction = streamOfList.map(a -> function.apply(a));
        List<R> collectedOutPutFromMappedList = streamOfMappedFunction.collect(Collectors.toList());
        return (ArrayList<R>) collectedOutPutFromMappedList;
    }
}

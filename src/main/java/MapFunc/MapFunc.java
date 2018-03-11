package MapFunc;


import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc<T,R> {


    public static <T,R> ArrayList<R> map(ArrayList<T> array, Function<T,R> function) {
        ArrayList<R> entryPairs = new ArrayList<>();
        for(T item: array){
            R result = function.apply(item);
            entryPairs.add(result);
        }
        return entryPairs;
    }

}

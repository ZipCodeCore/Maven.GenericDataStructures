package MapFunc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R> ArrayList<R> map(ArrayList<T> list, Function<T,R> func){

        return  list.stream()//stream the contents of the ArrayList...
                    .map(e->func.apply(e))//and for every element e, apply the function to e
                    .collect(Collectors.toCollection(ArrayList::new));//collect the results in an ArrayList
    }

}

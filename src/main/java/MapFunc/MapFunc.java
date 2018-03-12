package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    // in this case, T is input and R is output
    public static <T, R> ArrayList<R> map(ArrayList<T> myInput, Function<T,R> myFunc){
        ArrayList<R> output = new ArrayList<>();
        for (T element : myInput){
            output.add(myFunc.apply(element));
        }
        return output;

    }

}

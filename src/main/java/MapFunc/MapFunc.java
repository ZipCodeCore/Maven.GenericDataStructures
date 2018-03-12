package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    //okay katrice, so public method is because this test does not create a instance of MapFunc
    //The <T, R> when its static you have to define the generic so you can pass it into a static
    //We are returning an Arraylist of the results and they take in an ArrayList of type T
    public static <T,R> ArrayList<R> map(ArrayList<T>, Function<T,R>){

    }
}

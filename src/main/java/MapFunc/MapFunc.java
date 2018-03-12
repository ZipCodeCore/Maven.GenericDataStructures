package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T,R> ArrayList map(ArrayList<T> arrayList, Function<T,R> function) {

        ArrayList<T> newArrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            newArrayList.add((T) function.apply(arrayList.get(i)));  //function.apply using the lambda
        }
        return newArrayList;
    }
}


//MapFunc -- Make a map method that takes an ArrayList and a Function<T,R> object and
//        returns an arraylist containing all of the elements of the first with the function applied to them.
// T = type
// R = return type
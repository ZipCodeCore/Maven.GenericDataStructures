package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> mapArray, Function<T, R> mapFunction) {
        ArrayList funcArray = new ArrayList();
        for (T mapArrayValue : mapArray) {
            R changedValue = mapFunction.apply(mapArrayValue);
            funcArray.add(changedValue);

        }
        return funcArray;
    }

    /* For this part you need to create a generic method and give it the type parameter of <T, R>
       because the function uses T for the type being passed in. Then R for the return type.
       The method then returns ArrayList of type R because this is the array that had the function applied to it.
       The argument being passed in is of type T being the original array being passed into the function.
     */
}


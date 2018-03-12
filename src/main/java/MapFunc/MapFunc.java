package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {//T being my input type and R being my output type
    public static <T, R> ArrayList<R> map (ArrayList<T> array, Function<T, R> functor){
        ArrayList<R> arrayList = new ArrayList<>();//empty arraylist
        for (T thelid : array) { //iterate through my array for each of the lids of type T
            arrayList.add(functor.apply(thelid));//in my new list add the function being applied
        } //to each of the lids
        return arrayList; //arrayList being my output type
    }
}

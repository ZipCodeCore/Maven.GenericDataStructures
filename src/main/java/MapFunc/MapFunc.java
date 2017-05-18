package MapFunc;
import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */

public class MapFunc {

    public static <T,R> ArrayList<R> map(ArrayList<T> arrayList, Function<T,R> function) {
        ArrayList<R> newArrayList = new ArrayList<R>();
        for (T element : arrayList) {
            newArrayList.add(function.apply(element));
            System.out.println(element.getClass().getSimpleName());
        }
        return newArrayList;
    }

}


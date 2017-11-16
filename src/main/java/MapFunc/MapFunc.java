package MapFunc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map (List<T> arrayList, Function<T, R> function) {
        ArrayList<R> newList;
        newList = (ArrayList<R>) arrayList.stream().map(a-> function.apply(a)).collect(Collectors.toList());




        ArrayList<R> rs = arrayList.stream().map(function::apply).collect(Collectors.toCollection(ArrayList::new));
        newList = rs;





        ArrayList<R> a = new ArrayList<>();
        for (T t : arrayList) {
            R apply = function.apply(t);
            a.add(apply);
        }


        return newList;
    }



}

package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them
 * //R apply (T t).
 */
public class MapFunc {

    public static <T,R> ArrayList <R> map(ArrayList<T>list,Function<T,R>function){

        ArrayList<R> mapList= new ArrayList();
        for(int i=0;i< list.size();i++){
            R element = function.apply(list.get(i));

            mapList.add(element);

        }
        return mapList;
    }

}

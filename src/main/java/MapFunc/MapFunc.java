package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc
{
    /*

    MapFunc -- Make a map method that takes an ArrayList and a
    Function<T,R> object and returns an arraylist containing all of the elements
    of the first with the function applied to them.

     */

    //T is the Type and R is the return type against the T
    public static<T,R> ArrayList map(ArrayList<T> inputArrayList, Function<T,R> function)
    {
           ArrayList<R> values = new ArrayList<R>();

           for (int i = 0; i < inputArrayList.size(); i++)
           {
               R output = function.apply(inputArrayList.get(i));
               values.add(output);

           }

           return values;

    }

}

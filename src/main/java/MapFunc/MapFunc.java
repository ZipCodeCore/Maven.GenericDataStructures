package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc<T> {

    private ArrayList<T> mapArray;

    public MapFunc() {
        this.mapArray = new ArrayList<>();
    }

    public static ArrayList map(ArrayList mapArray, Function mapFunction){
        ArrayList funcArray = new ArrayList();
        for (int i = 0; i < mapArray.size(); i++ ){
            mapFunction.apply(i);
            funcArray.add(i);
        }
       return funcArray;
    }
}

package ArrayListCombiner;

import Employee.Employee;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class  ArrayListCombiner {

    public static <E> void extendCombiner(ArrayList<E> employees, ArrayList<? extends E> managers ){
        employees.addAll(managers);
    }

    public static <E> void superCombiner(ArrayList<? super E> employees, ArrayList<E> managers){
        employees.addAll(managers);

    }
}

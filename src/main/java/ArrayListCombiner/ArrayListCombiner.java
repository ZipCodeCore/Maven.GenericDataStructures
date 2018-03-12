package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner { //the second array extends from the first array so it will inherit the behavior from the first array
    public static <E> void superCombiner(ArrayList<? super E> firstArray, ArrayList<E> secondArray){
        firstArray.addAll(secondArray); //addall will append all elements of the second array to end of the first array
    }
    public static <E> void extendCombiner(ArrayList<E> firstArray, ArrayList<? extends E> secondArray){ //making the arrays able to combine
        firstArray.addAll(secondArray);//add all will combine the second array elements to the end of the first
    } //the firstArray is the parent class to the second array according to the test
    //Manager extends employee
}
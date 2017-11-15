package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public  class MapFunc<T,R> {



   private ArrayList<R> mappedList;
    public static  <T,R>ArrayList<R> map(ArrayList<T> list, Function<T, R> function){
        ArrayList<R> list1 = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            list1.add(apply);
        }
        return  list1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
       ArrayList<Integer> mappedList = MapFunc.map(intList,num -> num*2 );
        System.out.println(mappedList.toString());

//        intArray.addAll(1);
//        ArrayList<Integer> mappedList = MapFunc.map(intList, num -> num*2);
    }

}

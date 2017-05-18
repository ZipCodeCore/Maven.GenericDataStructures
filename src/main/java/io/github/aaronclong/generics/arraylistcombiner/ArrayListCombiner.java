package io.github.aaronclong.generics.arraylistcombiner;

import io.github.aaronclong.generics.employee.Manager;
import io.github.aaronclong.generics.employee.Employee;

import java.util.ArrayList;

/**
 * Create two generic methods that take two ArrayLists.
 * The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {
  public static <E> void superCombiner(ArrayList<? super E> listOne,
                                 ArrayList listTwo) {
    listOne.addAll(listTwo);

  }

  public static <E> void extendCombiner(ArrayList<? extends E> listOne,
                                ArrayList listTwo) {
    listOne.addAll(listTwo);
  }
}

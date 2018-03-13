package StackArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList();
    }

    public E push(E aThing) {

        elements.add(aThing);
        return (E)elements.get(elements.size() - 1);
    }

    public E pop() throws IndexOutOfBoundsException {

        return (E)elements.remove(elements.size() - 1);

    }

    public boolean isEmpty() {
        if (elements.size() > 0) {
            return false;
        } else {
            return true;
        }
    }


}

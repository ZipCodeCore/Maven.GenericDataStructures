package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements= new Object[0];

    }

    public boolean isEmpty() {
        return elements.length==0;
    }

    public void push(E foobar) {
        elements=Arrays.copyOf(elements,elements.length+1);
        elements[elements.length-1] = foobar;
    }

    public E pop() {
        E lastElement = (E) elements[elements.length-1];
        elements= Arrays.copyOf(elements,elements.length-1);
        return lastElement;
    }
}

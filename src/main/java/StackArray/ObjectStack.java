package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public void push(Object element) {
        int arrayLength = elements.length;
        elements = Arrays.copyOf(elements, arrayLength + 1);
        elements[arrayLength] = element;
    }

    public Object pop() {
        int arrayLength = elements.length;
        Object element = elements[arrayLength - 1];
        elements = Arrays.copyOf(elements, arrayLength - 1);
        return element;
    }

    public boolean isEmpty() {
        if(elements.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

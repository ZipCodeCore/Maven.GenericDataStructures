package StackArray;

import StackArrayList.Stack;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements = new Object[0];

    public ObjectStack() {

    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        else {return false;}
    }

    public void push(Object element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    public Object pop() throws NullPointerException {
        try {
            Object item = elements[elements.length - 1];
            elements = Arrays.copyOf(elements, elements.length - 1);
            return item;

        }
        catch (NullPointerException npe) {
            throw new NullPointerException();
        }
    }
}

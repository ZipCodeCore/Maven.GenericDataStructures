package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    @SuppressWarnings("unchecked")
    public ObjectStack() {

        elements = new Object[0];

    }

    public void push(String item) {

        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = item;
    }

    public E pop() {
        Object poppedValue = elements[elements.length - 1];
        elements = Arrays.copyOfRange(elements, 0, elements.length - 1);
        return (E) poppedValue;
    }

    public boolean isEmpty() {

        boolean isEmpty = elements.length == 0;

        return isEmpty;
    }
}

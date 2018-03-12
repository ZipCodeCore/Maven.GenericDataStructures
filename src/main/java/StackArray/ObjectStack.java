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

    public ObjectStack() {
        elements = new Object[0];
    }

    public Object push(Object aThing) {

        Object[] temp = Arrays.copyOf(elements, elements.length + 1);

        temp[elements.length] = aThing;
        elements = temp;
        return aThing;
    }

    public Object pop() throws IndexOutOfBoundsException {

        Object poppedObj = elements[elements.length - 1];

        if (elements.length > 0) {
            Object[] temp = Arrays.copyOf(elements, elements.length - 1);
            for (int i = 0; i < elements.length - 1; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        return poppedObj;
    }

    public boolean isEmpty() {
        if (elements.length > 0) {
            return false;
        } else {
            return true;
        }
    }
}

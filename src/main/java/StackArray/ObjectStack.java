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

    public Object push(Object aThing) {

        Object[] temp = Arrays.copyOf(elements, elements.length + 1);

        if (elements.length > 0) {

            for (int i = 0; i < elements.length; i++) {
                temp[i + 1] = elements[i];
            }
        }

        temp[0] = aThing;
        elements = temp;
        return aThing;
    }

    public Object pop() {

        if (elements.length == 0) {
            return null;
        } else {
            Object[] temp = Arrays.copyOf(elements, elements.length - 1);
            int iterator = 0;

            for (int i = 1; i < elements.length; i++) {
                temp[iterator] = elements[i];
                iterator++;
            }

            Object poppedObj = elements[0];
            elements = temp;
            return poppedObj;
        }
    }

    public boolean isEmpty() {
        if (elements.length > 0) {
            return false;
        } else {
            return true;
        }
    }
}

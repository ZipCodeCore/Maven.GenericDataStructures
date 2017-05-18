package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements = (E[]) new Object[0];

    public GenericStack() {
    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(E element) {
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

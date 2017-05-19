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

    public void push(E element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        E retval = (E) elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return retval;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}

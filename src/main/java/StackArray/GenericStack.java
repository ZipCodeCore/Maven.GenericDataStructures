package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public void push(E element) {
        int arrayLength = elements.length;
        elements = Arrays.copyOf(elements, arrayLength + 1);
        elements[arrayLength] = element;
    }

    public E pop() {
        int arrayLength = elements.length;
        E element = elements[arrayLength - 1];
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

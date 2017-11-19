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
        //we need to cast here b/c we cannot construct a generic array
        this.elements = (E[]) new Object[0];
    }

    public void push(E item) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = item;
    }

    public E pop() {
        E item = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return item;
    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
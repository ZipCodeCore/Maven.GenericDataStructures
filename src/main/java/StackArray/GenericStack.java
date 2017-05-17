package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int endPlusOne;

    public GenericStack() {
        elements = (E[]) new Object[0];
        endPlusOne = 0;
    }

    public void push(E e) {
        if (endPlusOne == elements.length) {
            elements = Arrays.copyOf(elements, elements.length + 5);
        }
        elements[endPlusOne] = e;
        endPlusOne++;
    }

    public E pop() throws IndexOutOfBoundsException {
        endPlusOne--;
        return elements[endPlusOne];
    }

    public boolean isEmpty() {
        return endPlusOne == 0;
    }

}

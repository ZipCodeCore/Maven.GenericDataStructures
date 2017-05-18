package StackArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[0];
    }


    public E[] getElements() {
        return elements;
    }


    public void push(E element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }


    public E pop() throws IndexOutOfBoundsException {
        if (elements.length == 0) {
            throw new IndexOutOfBoundsException();
        }
        return popWhenArrayHasElement();
    }

    public E popWhenArrayHasElement() {
        E poppedElement = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return poppedElement;
    }


    public boolean isEmpty() {
        return elements.length == 0;
    }

}

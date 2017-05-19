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

    public GenericStack() {
        elements = (E[]) new Object[0];
    }


    void push(String item) {

        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = (E) item;

    }

    E pop() {

        Object poppedValue = elements[elements.length-1];
        elements =Arrays.copyOfRange(elements, 0, elements.length-1);

        return (E) poppedValue;
    }


    boolean isEmpty() {

        return elements.length == 0;
    }
}
